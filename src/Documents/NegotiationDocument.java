package Documents;

import Employability.EmailService;
import Employability.NotifiableEntity;

import java.util.Date;

import CRM.*;
import CoreUsers.*;

public class NegotiationDocument extends BaseDocument implements NotifiableEntity {

	private Negotiation negotiation;
	private DocumentType type;
	private DocumentNegotiationState state;
	private Coordinator reviewedBy;
	private Date reviewDate;
	private String coordinatorMessage;

	// SD-DOC-001: Constructor para crear documento de negociación
	public NegotiationDocument(Negotiation negotiation, DocumentType type, String filename, String storagePath) {
		this.negotiation = negotiation;
		this.type = type;
		this.setFilename(filename);
		this.setStoragePath(storagePath);
		Documents.PendingApprovalState initialState = new Documents.PendingApprovalState();
		this.state = initialState;
		this.state.setContext(this);
	}

	public void changeState(DocumentNegotiationState newState) {
		this.state = newState;
		newState.setContext(this);
	}

	public DocumentNegotiationState getState() {
		return this.state;
	}

	// SD-DOC-002: Aprobar documento
	public void approveDocument(Coordinator coordinator) {
		this.reviewedBy = coordinator;
		this.reviewDate = new Date();
		AcceptedState acceptedState = new AcceptedState();
		this.changeState(acceptedState);
	}

	// SD-DOC-003: Rechazar documento
	public void rejectDocument(Coordinator coordinator, String reason) {
		this.reviewedBy = coordinator;
		this.reviewDate = new Date();
		this.coordinatorMessage = reason;
		RejectedState rejectedState = new RejectedState();
		this.changeState(rejectedState);
		EmailService emailService = new EmailService();
		emailService.update(this);
	}

	public void reuploadFile(String newPath, double newSize) {
		this.updateFileInfo(newPath, newSize);
		Documents.PendingApprovalState pendingState = new Documents.PendingApprovalState();
		this.changeState(pendingState);
	}

	public Negotiation getNegotiation() {
		return this.negotiation;
	}

	@Override
	public String getRecipientEmail() {
		SalesAdvisor advisor = this.negotiation.getAdvisor();
		String email = advisor.getEmail();
		return email;
	}

	@Override
	public String getNotificationMessage() {
		String message = "Documento actualizado";
		return message;
	}

	@Override
	public String getNotificationTitle() {
		String title = "Notificacion de Documento";
		return title;
	}

	@Override
	public String[] getAllowedExtensions() {
		String[] extensions = {"pdf", "jpg", "png", "doc", "docx"};
		return extensions;
	}

}