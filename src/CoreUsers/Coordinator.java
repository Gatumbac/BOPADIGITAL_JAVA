package CoreUsers;

import Documents.*;
import CRM.*;
import java.io.File;

public class Coordinator extends Employee {

	private String department;

	// SD-DOC-002/003: Revisar documento
	public void reviewDocument(NegotiationDocument document, boolean isApproved, String reason) {
		PendingApprovalState currentState = (PendingApprovalState) document.getState();
		if (isApproved) {
			currentState.approve(this);
		} else {
			currentState.reject(this, reason);
		}
	}

	public void authorizeServiceActivation(Negotiation negotiation) {
		NegotiationState currentState = negotiation.getCurrentState();
		currentState.handleNextStage();
	}

	// SD-DOC-004: Descargar documento
	public File downloadDocument(NegotiationDocument document) {
		String storagePath = document.getStoragePath();
		S3EmcryptedStorage storage = new S3EmcryptedStorage();
		File file = storage.downloadFile(storagePath);
		return file;
	}

}