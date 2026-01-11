package CRM;

import java.util.Date;

import CoreUsers.*;

public class Visit {

	Negotiation negotiation;
	ImmediateSupervisor verifiedBy;
	SalesAdvisor advisor;
	VisitType type;
	GPSCoordinates coordinates;
	BusinessClient client;
	private Date date;
	private String observations;
	private boolean isVerified;
	private String supervisorComment;

	/**
	 * 
	 * @param supervisor
	 */
	public void markAsVerified(ImmediateSupervisor supervisor) {
		// TODO - implement Visit.markAsVerified
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param supervisor
	 * @param reason
	 */
	public void markAsRejected(ImmediateSupervisor supervisor, String reason) {
		// TODO - implement Visit.markAsRejected
		throw new UnsupportedOperationException();
	}

	public double calculateDistanceToClientOffice() {
		// TODO - implement Visit.calculateDistanceToClientOffice
		throw new UnsupportedOperationException();
	}

}