package Documents;

import CoreUsers.*;

public class PendingApprovalState extends DocumentNegotiationState {

	// SD-DOC-002: Aprobar documento
	@Override
	public void approve(Coordinator coordinator) {
		NegotiationDocument document = this.getContext();
		document.approveDocument(coordinator);
	}

	// SD-DOC-003: Rechazar documento
	@Override
	public void reject(Coordinator coordinator, String reason) {
		NegotiationDocument document = this.getContext();
		document.rejectDocument(coordinator, reason);
	}

}
