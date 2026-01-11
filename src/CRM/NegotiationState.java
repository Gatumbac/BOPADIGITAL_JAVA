package CRM;

import Documents.BaseDocument;
import Documents.NegotiationDocument;
import OfferMatrices.OfferMatrix;

public abstract class NegotiationState {

	Negotiation context;
	private String name;
	private String description;

	/**
	 * 
	 * @param context
	 */
	public void setContext(Negotiation context) {
		this.context = context;
	}

	public void handleNextStage() {
		// TODO - implement NegotiationState.handleNextStage
		throw new UnsupportedOperationException();
	}

	public void handleCancellation() {
		// TODO - implement NegotiationState.handleCancellation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param visit
	 */
	public void registerVisit(Visit visit) {
		// TODO - implement NegotiationState.registerVisit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param matrix
	 */
	public void generateOffer(OfferMatrix matrix) {
		// TODO - implement NegotiationState.generateOffer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param doc
	 */
	public void attachDocument(NegotiationDocument doc) {
		// TODO - implement NegotiationState.attachDocument
		throw new UnsupportedOperationException();
	}

}