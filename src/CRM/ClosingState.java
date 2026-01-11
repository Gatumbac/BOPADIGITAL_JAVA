package CRM;

public class ClosingState extends NegotiationState {

	// SD-CRM-006: Closing → PostSale
	@Override
	public void handleNextStage() {
		PostSaleState nextState = new PostSaleState();
		Negotiation negotiation = this.getContext();
		negotiation.changeState(nextState);
	}

}
