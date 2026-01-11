package CRM;

public class CanceledState extends NegotiationState {

	// SD-CRM-006: Canceled es estado terminal, no avanza
	@Override
	public void handleNextStage() {
		// Estado terminal, no hay transición
	}

	@Override
	public void handleCancellation() {
		// Ya está cancelado, no hace nada
	}

}
