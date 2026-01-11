package CRM;

import CoreUsers.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Documents.*;
import OfferMatrices.*;

public class Negotiation {

	private BusinessClient client;
	private SalesAdvisor advisor;
	private NegotiationState state;
	private List<Visit> visits;
	private List<NegotiationDocument> documents;
	private List<OfferMatrix> matrices;
	private List<DocumentType> mandatoryDocuments;
	private Date startDate;
	private Date estimatedClosedDate;
	private String observations;
	private boolean isActive;

	public Negotiation(BusinessClient client, SalesAdvisor advisor) {
		this.client = client;
		this.advisor = advisor;
		this.startDate = new Date();
		this.isActive = true;
		this.visits = new ArrayList<>();
		this.documents = new ArrayList<>();
		this.matrices = new ArrayList<>();
		ProspectingState initialState = new ProspectingState();
		this.state = initialState;
		this.state.setContext(this);
	}

	public void changeState(NegotiationState newState) {
		this.state = newState;
		newState.setContext(this);
	}

	public NegotiationState getCurrentState() {
		return this.state;
	}

	// SD-CRM-006: Avanzar al siguiente estado
	public void proceedToNextState() {
		NegotiationState currentState = this.state;
		currentState.handleNextStage();
	}

	public void cancel() {
		CanceledState canceledState = new CanceledState();
		this.changeState(canceledState);
		this.isActive = false;
	}

	public void addVisitReport(Visit visit) {
		this.visits.add(visit);
		visit.setNegotiation(this);
	}

	public void addMatrix(OfferMatrix matrix) {
		this.matrices.add(matrix);
	}

	public void addDocument(NegotiationDocument doc) {
		this.documents.add(doc);
	}

	public boolean isActive() {
		return this.isActive;
	}

	public BusinessClient getClient() {
		return this.client;
	}

	public SalesAdvisor getAdvisor() {
		return this.advisor;
	}

	// SD-CRM-006: Verifica si existe al menos una matriz aprobada
	public boolean hasApprovedMatrix() {
		for (OfferMatrix matrix : this.matrices) {
			if (matrix.getCurrentState() instanceof OfferMatrices.ApprovedMatrixState) {
				return true;
			}
		}
		return false;
	}

}
