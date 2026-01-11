package OfferMatrices;

public class RejectedMatrixState extends MatrixState {

	// Permite editar y re-enviar después de rechazo
	@Override
	public void editDetails() {
		DraftMatrixState draftState = new DraftMatrixState();
		OfferMatrix matrix = this.getContext();
		matrix.changeState(draftState);
	}

}
