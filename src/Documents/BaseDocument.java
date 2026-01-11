package Documents;

import java.time.LocalDateTime;

public abstract class BaseDocument {

	private String filename;
	private String fileExtension;
	private double fileSizeMb;
	private String storagePath;
	private LocalDateTime uploadDate;
	private String mimeType;

	/**
	 * 
	 * @param name
	 */
	private String extractExtension(String name) {
		// TODO - implement BaseDocument.extractExtension
		throw new UnsupportedOperationException();
	}

	public abstract String[] getAllowedExtensions();

	public void validateFormat() {
		// TODO - implement BaseDocument.validateFormat
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newFilePath
	 * @param newSize
	 */
	public void updateFileInfo(String newFilePath, double newSize) {
		// TODO - implement BaseDocument.updateFileInfo
		throw new UnsupportedOperationException();
	}

}