package CRM;

import CoreUsers.*;
import java.util.*;
import Documents.*;
import OfferMatrices.*;

public class Negotiation {

	BusinessClient client;
	SalesAdvisor advisor;
	NegotiationState state;
	Collection<Visit> visits;
	Collection<NegotiationDocument> documents;
	Collection<OfferMatrix> matrices;
	Collection<DocumentType> mandatoryDocuments;
	private Date startDate;
	private Date estimatedClosedDate;
	private String observations;
	private boolean isActive;

	/**
	 * 
	 * @param state
	 */
	public void changeState(NegotiationState state) {
		// TODO - implement Negotiation.changeState
		throw new UnsupportedOperationException();
	}

	public NegotiationState getCurrentState() {
		// TODO - implement Negotiation.getCurrentState
		throw new UnsupportedOperationException();
	}

	public void proceedToNextState() {
		// TODO - implement Negotiation.proceedToNextState
		throw new UnsupportedOperationException();
	}

	public void cancel() {
		// TODO - implement Negotiation.cancel
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param visit
	 */
	public void addVisitReport(Visit visit) {
		// TODO - implement Negotiation.addVisitReport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param matrix
	 */
	public void createOffer(OfferMatrix matrix) {
		// TODO - implement Negotiation.createOffer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param doc
	 */
	public void addDocument(NegotiationDocument doc) {
		// TODO - implement Negotiation.addDocument
		throw new UnsupportedOperationException();
	}

	public boolean hasPendingDocuments() {
		// TODO - implement Negotiation.hasPendingDocuments
		throw new UnsupportedOperationException();
	}

}