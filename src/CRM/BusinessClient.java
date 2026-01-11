package CRM;

import CoreUsers.*;

import java.math.BigDecimal;
import java.util.*;

public class BusinessClient {

	SalesAdvisor seller;
	Collection<Visit> visitLog;
	RUC ruc;
	Collection<Negotiation> negotiationHistory;
	private String bussinessName;
	private int activeServicesCount;
	private BigDecimal currentMonthlyBilling;
	private boolean isActive;
	private String address;
	private String contactName;
	private String contactPhone;
	private String contactEmail;

	public void deactivate() {
		// TODO - implement BusinessClient.deactivate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param services
	 * @param billing
	 */
	public void updateCommercialInfo(int services, BigDecimal billing) {
		// TODO - implement BusinessClient.updateCommercialInfo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param advisor
	 */
	public void assignToAdvisor(SalesAdvisor advisor) {
		// TODO - implement BusinessClient.assignToAdvisor
		throw new UnsupportedOperationException();
	}

	public void unassignAdvisor() {
		// TODO - implement BusinessClient.unassignAdvisor
		throw new UnsupportedOperationException();
	}

	public String getElegibilityCategory() {
		// TODO - implement BusinessClient.getElegibilityCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param visit
	 */
	public void addVisitToLog(Visit visit) {
		// TODO - implement BusinessClient.addVisitToLog
		throw new UnsupportedOperationException();
	}

	public Negotiation getActiveNegotiation() {
		// TODO - implement BusinessClient.getActiveNegotiation
		throw new UnsupportedOperationException();
	}

}