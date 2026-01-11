package CRM;

import CoreUsers.*;
import ServiceCatalogCMS.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BusinessClient {

	private SalesAdvisor seller;
	private List<Visit> visitLog;
	private RUC ruc;
	private List<Negotiation> negotiationHistory;
	private String businessName;
	private int activeServicesCount;
	private BigDecimal currentMonthlyBilling;
	private boolean isActive;
	private String address;
	private String contactName;
	private String contactPhone;
	private String contactEmail;

	// SD-CRM-001: Constructor para registro de cliente
	public BusinessClient(String rucValue, String businessName, String contactName) {
		this.ruc = new RUC(rucValue);
		this.businessName = businessName;
		this.contactName = contactName;
		this.isActive = true;
		this.visitLog = new ArrayList<>();
		this.negotiationHistory = new ArrayList<>();
	}

	public RUC getRuc() {
		return this.ruc;
	}

	// SD-CRM-008: Desactivar cliente
	public void deactivate() {
		this.isActive = false;
		this.seller = null;
	}

	// SD-CRM-002: Asignar a asesor
	public void assignToAdvisor(SalesAdvisor advisor) {
		this.seller = advisor;
		advisor.addClient(this);
	}

	public void unassignAdvisor() {
		SalesAdvisor previousAdvisor = this.getSeller();
		this.setSeller(null);
		previousAdvisor.removeClient(this);
	}

	// SD-CRM-007: Obtener historial de visitas
	public List<Visit> getVisitHistory() {
		List<Visit> history = new ArrayList<>(this.visitLog);
		return history;
	}

	public void addVisitToLog(Visit visit) {
		this.visitLog.add(visit);
	}

	public Negotiation getActiveNegotiation() {
		Negotiation activeNegotiation = null;
		for (Negotiation negotiation : negotiationHistory) {
			boolean isActive = negotiation.isActive();
			if (isActive) {
				activeNegotiation = negotiation;
			}
		}
		return activeNegotiation;
	}

	public void addNegotiation(Negotiation negotiation) {
		this.negotiationHistory.add(negotiation);
	}

	public boolean isActive() {
		return this.isActive;
	}

	public SalesAdvisor getSeller() {
		return this.seller;
	}

	public void setSeller(SalesAdvisor seller) {
		this.seller = seller;
	}

	public BigDecimal getCurrentMonthlyBilling() {
		return this.currentMonthlyBilling;
	}

	public int getActiveServicesCount() {
		return this.activeServicesCount;
	}

	// SD-CAT-001: Navegar catálogo de servicios (búsqueda recursiva - Composite)
	public List<CatalogComponent> searchCatalog(Catalog catalog, String keyword) {
		List<CatalogComponent> results = catalog.search(keyword);
		return results;
	}

	// SD-CAT-002: Filtrar servicios del catálogo
	public List<CatalogComponent> filterServices(Catalog catalog, CatalogFilterCriteria criteria) {
		List<CatalogComponent> results = catalog.filter(criteria);
		return results;
	}

}
