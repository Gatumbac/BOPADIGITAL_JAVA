package OfferMatrices;

public class DraftMatrixState extends MatrixState {

	// SD-MAT-004: Permite editar el borrador
	@Override
	public void editDetails() {
		OfferMatrix matrix = this.getContext();
		boolean hasItems = matrix.hasItems();
		if (hasItems) {
			matrix.recalculateTotals();
		}
	}

	// SD-MAT-005: Enviar a aprobación
	@Override
	public void sendForApproval() {
		OfferMatrix matrix = this.getContext();
		boolean hasItems = matrix.hasItems();
		if (hasItems) {
			PendingApprovalState nextState = new PendingApprovalState();
			matrix.changeState(nextState);
			matrix.notifySubscribers();
		}
	}

}
