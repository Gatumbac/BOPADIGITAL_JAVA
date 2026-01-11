package CRM;

public class ProspectingState extends NegotiationState {

	// SD-CRM-006: Prospecting → InitialContact
	@Override
	public void handleNextStage() {
		InitialContactState nextState = new InitialContactState();
		Negotiation negotiation = this.getContext();
		negotiation.changeState(nextState);
	}

}
