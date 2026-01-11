package CRM;

public class InitialContactState extends NegotiationState {

	// SD-CRM-006: InitialContact → ActiveNegotiation
	@Override
	public void handleNextStage() {
		ActiveNegotiationState nextState = new ActiveNegotiationState();
		Negotiation negotiation = this.getContext();
		negotiation.changeState(nextState);
	}

}
