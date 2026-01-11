package CoreUsers;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import OfferMatrices.*;
import OfferMatrices.PendingApprovalState;
import CRM.*;
import Documents.*;

public class SalesAdvisor extends Employee {

	private List<OfferMatrix> createdMatrices;
	private List<ImmediateSupervisor> supervisors;
	private List<BusinessClient> clients;
	private List<Negotiation> negotiationHistory;
	private List<Visit> visitHistory;
	private double commissionRate;
	private String salesZone;
	private BigDecimal monthlySalesTarget;
	private BigDecimal accumulativeSales;
	private int totalSalesMonth;
	private BigDecimal currentMonthBilling;

	// SD-CRM-001: Registrar nuevo cliente
	public BusinessClient registerClient(String rucValue, String businessName, String contactName) {
		RUC ruc = new RUC(rucValue);
		boolean isValidRuc = ruc.isValid();
		BusinessClient client = null;
		if (isValidRuc) {
			client = new BusinessClient(rucValue, businessName, contactName);
			client.assignToAdvisor(this);
		}
		return client;
	}

	public void addClient(BusinessClient client) {
		this.clients.add(client);
	}

	public void removeClient(BusinessClient client) {
		this.clients.remove(client);
	}

	// SD-CRM-003: Agendar visita
	public Visit scheduleVisit(BusinessClient client, VisitType type, String notes, Date date) {
		Visit visit = new Visit(this, client, type, notes, date);
		this.visitHistory.add(visit);
		client.addVisitToLog(visit);
		return visit;
	}

	// SD-CRM-004: Registrar resultado de visita (Check-in GPS)
	public void registerVisitResult(Visit visit, GPSCoordinates gps, String observations) {
		visit.registerCheckIn(gps, observations);
		Negotiation negotiation = visit.getNegotiation();
		if (negotiation != null) {
			negotiation.addVisitReport(visit);
		}
	}

	// SD-CRM-006: Actualizar estado de negociación
	public void advanceNegotiation(Negotiation negotiation) {
		negotiation.proceedToNextState();
	}

	// SD-CRM-007: Consultar historial de visitas verificadas
	public List<Visit> getClientVisitHistory(BusinessClient client) {
		List<Visit> allVisits = client.getVisitHistory();
		List<Visit> verifiedVisits = new ArrayList<>();
		for (Visit visit : allVisits) {
			boolean isVerified = visit.isVerified();
			if (isVerified) {
				verifiedVisits.add(visit);
			}
		}
		return verifiedVisits;
	}

	// Crear nueva negociación
	public Negotiation startNegotiation(BusinessClient client) {
		Negotiation negotiation = new Negotiation(client, this);
		client.addNegotiation(negotiation);
		this.negotiationHistory.add(negotiation);
		return negotiation;
	}

	// SD-MAT-001
	public OfferMatrix createOffer(Negotiation negotiation) {
		OfferMatrix matrix = new OfferMatrix(negotiation, this);
		this.createdMatrices.add(matrix);
		negotiation.addMatrix(matrix);
		return matrix;
	}

	// SD-SUP-001: Obtener matrices pendientes de aprobación
	public List<OfferMatrix> getMatricesPendingApproval() {
		List<OfferMatrix> pendingMatrices = new ArrayList<>();
		for (OfferMatrix matrix : this.createdMatrices) {
			MatrixState state = matrix.getCurrentState();
			boolean isPending = state instanceof PendingApprovalState;
			if (isPending) {
				pendingMatrices.add(matrix);
			}
		}
		return pendingMatrices;
	}

	// SD-DOC-001: Subir documento a negociación
	public NegotiationDocument uploadDocumentToNegotiation(Negotiation negotiation, File file, DocumentType docType) {
		FileStorageService storage = new S3EmcryptedStorage();
		String destinationFolder = "negotiations/" + negotiation.hashCode();
		String storagePath = storage.uploadFile(file, destinationFolder);
		String filename = file.getName();
		DocumentConfig config = new DocumentConfig(filename, storagePath);
		config.withDocumentType(docType);
		config.withNegotiation(negotiation);
		NegotiationDocumentFactory factory = new NegotiationDocumentFactory();
		BaseDocument baseDoc = factory.processDocument(config);
		NegotiationDocument document = (NegotiationDocument) baseDoc;
		negotiation.addDocument(document);
		return document;
	}

}
