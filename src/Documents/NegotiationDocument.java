package Documents;

import Employability.*;

import java.util.Date;

import CRM.*;
import CoreUsers.*;

public class NegotiationDocument extends BaseDocument implements NotifiableEntity {

	Negotiation negotiation;
	DocumentType type;
	DocumentNegotiationState state;
	Coordinator reviewedBy;
	private Date reviewDate;
	private String coordinatorMessage;

	/**
	 * 
	 * @param state
	 */
	public void changeState(DocumentNegotiationState state) {
		// TODO - implement NegotiationDocument.changeState
		throw new UnsupportedOperationException();
	}

	public DocumentNegotiationState getState() {
		return this.state;
	}

	/**
	 * 
	 * @param coordinator
	 */
	public void approveDocument(Coordinator coordinator) {
		// TODO - implement NegotiationDocument.approveDocument
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param coordinator
	 * @param reason
	 */
	public void rejectDocument(Coordinator coordinator, String reason) {
		// TODO - implement NegotiationDocument.rejectDocument
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newPath
	 * @param newSize
	 */
	public void reuploadFile(String newPath, double newSize) {
		// TODO - implement NegotiationDocument.reuploadFile
		throw new UnsupportedOperationException();
	}

	@Override
	public String getRecipientEmail() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getRecipientEmail'");
	}

	@Override
	public String getNotificationMessage() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNotificationMessage'");
	}

	@Override
	public String getNotificationTitle() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNotificationTitle'");
	}

	@Override
	public String[] getAllowedExtensions() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAllowedExtensions'");
	}

}