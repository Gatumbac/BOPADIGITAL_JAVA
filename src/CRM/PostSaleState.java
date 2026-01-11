package CRM;

public class PostSaleState extends NegotiationState {

	// SD-CRM-006: PostSale es el estado final, no avanza
	@Override
	public void handleNextStage() {
		// Estado final, no hay transición
	}

}
