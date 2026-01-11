package Documents;

import java.util.Date;

public class DocumentConfig {

	DocumentType type;
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

	/**
	 * 
	 * @param filename
	 * @param fileExtension
	 * @param fileSizeMb
	 * @param storagePath
	 */
	public DocumentConfig(String filename, String fileExtension, double fileSizeMb, String storagePath) {
		// TODO - implement DocumentConfig.DocumentConfig
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param isMandatory
	 */
	public DocumentConfig withMandatory(boolean isMandatory) {
		// TODO - implement DocumentConfig.withMandatory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reviewDate
	 */
	public DocumentConfig withReviewDate(Date reviewDate) {
		// TODO - implement DocumentConfig.withReviewDate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param message
	 */
	public DocumentConfig withCoordinatorMessage(String message) {
		// TODO - implement DocumentConfig.withCoordinatorMessage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 */
	public DocumentConfig withDocumentType(DocumentType type) {
		// TODO - implement DocumentConfig.withDocumentType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mimeType
	 */
	public DocumentConfig withMimeType(String mimeType) {
		// TODO - implement DocumentConfig.withMimeType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param description
	 */
	public DocumentConfig withDescription(String description) {
		// TODO - implement DocumentConfig.withDescription
		throw new UnsupportedOperationException();
	}

}