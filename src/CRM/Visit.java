package CRM;

import java.util.Date;

import CoreUsers.*;

public class Visit {

	private Negotiation negotiation;
	private ImmediateSupervisor verifiedBy;
	private SalesAdvisor advisor;
	private VisitType type;
	private GPSCoordinates coordinates;
	private BusinessClient client;
	private Date date;
	private String observations;
	private boolean isVerified;
	private String supervisorComment;

	// SD-CRM-003: Constructor para agendar visita
	public Visit(SalesAdvisor advisor, BusinessClient client, VisitType type, String notes, Date date) {
		this.advisor = advisor;
		this.client = client;
		this.type = type;
		this.observations = notes;
		this.date = date;
		this.isVerified = false;
	}

	// SD-CRM-004: Registrar check-in con GPS
	public void registerCheckIn(GPSCoordinates gps, String observations) {
		this.coordinates = gps;
		this.observations = observations;
		gps.setTimestamp(new Date());
	}

	// SD-CRM-005: Marcar como verificada
	public void markAsVerified(ImmediateSupervisor supervisor, String comment) {
		this.isVerified = true;
		this.verifiedBy = supervisor;
		this.supervisorComment = comment;
	}

	public void markAsRejected(ImmediateSupervisor supervisor, String reason) {
		this.isVerified = false;
		this.verifiedBy = supervisor;
		this.supervisorComment = reason;
	}

	public double calculateDistanceToClientOffice() {
		double visitLat = this.coordinates.getLatitude();
		double visitLon = this.coordinates.getLongitude();
		double distance = this.coordinates.calculateDistance(visitLat, visitLon);
		return distance;
	}

	public GPSCoordinates getCoordinates() {
		return this.coordinates;
	}

	public Negotiation getNegotiation() {
		return this.negotiation;
	}

	public void setNegotiation(Negotiation negotiation) {
		this.negotiation = negotiation;
	}

	public BusinessClient getClient() {
		return this.client;
	}

	public boolean isVerified() {
		return this.isVerified;
	}

}
