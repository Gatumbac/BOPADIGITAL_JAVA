package OfferMatrices;

import CoreUsers.*;

public class PendingApprovalState extends MatrixState {

	// SD-SUP-002: Aprobar matriz
	@Override
	public void approve(ImmediateSupervisor supervisor) {
		OfferMatrix matrix = this.getContext();
		matrix.approve(supervisor);
	}

	// SD-SUP-003: Rechazar matriz
	@Override
	public void reject(ImmediateSupervisor supervisor, String reason) {
		OfferMatrix matrix = this.getContext();
		matrix.reject(supervisor, reason);
	}

}
