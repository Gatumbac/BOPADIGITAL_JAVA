package Documents;

import java.util.Date;
import CRM.Negotiation;

public class DocumentConfig {

	private DocumentType type;
	private String filename;
	private String fileExtension;
	private double fileSizeMb;
	private String storagePath;
	private Date uploadDate;
	private String mimeType;
	private boolean isMandatory;
	private Date reviewDate;
	private String coordinatorMessage;
	private String description;
	private Negotiation negotiation;

	public DocumentConfig(String filename, String storagePath) {
		this.filename = filename;
		this.storagePath = storagePath;
	}

	public DocumentConfig withMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
		return this;
	}

	public DocumentConfig withReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
		return this;
	}

	public DocumentConfig withCoordinatorMessage(String message) {
		this.coordinatorMessage = message;
		return this;
	}

	public DocumentConfig withDocumentType(DocumentType type) {
		this.type = type;
		return this;
	}

	public DocumentConfig withMimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	public DocumentConfig withDescription(String description) {
		this.description = description;
		return this;
	}

	public DocumentConfig withNegotiation(Negotiation negotiation) {
		this.negotiation = negotiation;
		return this;
	}

	public String getFilename() {
		return this.filename;
	}

	public String getStoragePath() {
		return this.storagePath;
	}

	public DocumentType getType() {
		return this.type;
	}

	public Negotiation getNegotiation() {
		return this.negotiation;
	}

}