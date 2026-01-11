package CRM;

import Documents.NegotiationDocument;
import OfferMatrices.OfferMatrix;

public abstract class NegotiationState {

	protected Negotiation context;
	private String name;
	private String description;

	public void setContext(Negotiation context) {
		this.context = context;
	}

	public Negotiation getContext() {
		return this.context;
	}

	// SD-CRM-006: Método abstracto para avanzar al siguiente estado
	public abstract void handleNextStage();

	public void handleCancellation() {
		CanceledState canceledState = new CanceledState();
		this.context.changeState(canceledState);
	}

	public void registerVisit(Visit visit) {
		this.context.addVisitReport(visit);
	}

	public void generateOffer(OfferMatrix matrix) {
		this.context.addMatrix(matrix);
	}

	public void attachDocument(NegotiationDocument doc) {
		this.context.addDocument(doc);
	}

}