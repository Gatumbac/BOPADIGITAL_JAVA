package CoreUsers;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;
import OfferMatrices.*;
import CRM.*;
import Documents.*;

public class SalesAdvisor extends Employee {

	Collection<OfferMatrix> createdMatrices;
	Collection<ImmediateSupervisor> supervisors;
	Collection<BusinessClient> clients;
	Collection<Negotiation> negotiationHistory;
	Collection<Visit> visitHistory;
	private double commissionRate;
	private String salesZone;
	private BigDecimal monthlySalesTarget;
	private BigDecimal accumulativeSales;
	private int totalSalesMonth;
	private BigDecimal currentMonthBilling;

	/**
	 * 
	 * @param client
	 * @param gps
	 * @param type
	 * @param notes
	 */
	public Visit registrateVisit(BusinessClient client, GPSCoordinates gps, VisitType type, String notes) {
		// TODO - implement SalesAdvisor.registrateVisit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param negotiation
	 */
	public OfferMatrix createOffer(Negotiation negotiation) {
		// TODO - implement SalesAdvisor.createOffer
		throw new UnsupportedOperationException();
	}

	public Map<String, Number> getMetrics() {
		// TODO - implement SalesAdvisor.getMetrics
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param negotiation
	 * @param file
	 */
	public NegotiationDocument uploadNegotiationDocument(Negotiation negotiation, File file) {
		// TODO - implement SalesAdvisor.uploadNegotiationDocument
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param negotiation
	 * @param file
	 */
	public MatrixAttachment uploadMatrixAttachment(Negotiation negotiation, File file) {
		// TODO - implement SalesAdvisor.uploadMatrixAttachment
		throw new UnsupportedOperationException();
	}

}