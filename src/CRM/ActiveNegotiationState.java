package CRM;

public class ActiveNegotiationState extends NegotiationState {

	// SD-CRM-006: ActiveNegotiation → Closing
	// Requiere al menos una matriz de oferta aprobada para avanzar
	@Override
	public void handleNextStage() {
		Negotiation negotiation = this.getContext();
		boolean hasApproved = negotiation.hasApprovedMatrix();
		if (hasApproved) {
			ClosingState nextState = new ClosingState();
			negotiation.changeState(nextState);
		}
	}

}
