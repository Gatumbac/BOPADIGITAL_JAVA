package Documents;

import java.time.LocalDateTime;

public abstract class BaseDocument {

	private String filename;
	private String fileExtension;
	private double fileSizeMb;
	private String storagePath;
	private LocalDateTime uploadDate;
	private String mimeType;

	private String extractExtension(String name) {
		int lastDot = name.lastIndexOf('.');
		String extension = "";
		if (lastDot > 0) {
			extension = name.substring(lastDot + 1);
		}
		return extension;
	}

	public abstract String[] getAllowedExtensions();

	public void validateFormat() {
		String extension = this.extractExtension(this.filename);
		String[] allowed = this.getAllowedExtensions();
		boolean isValid = false;
		for (String allowedExt : allowed) {
			boolean matches = extension.equalsIgnoreCase(allowedExt);
			if (matches) {
				isValid = true;
			}
		}
	}

	// SD-DOC-001: Actualizar información del archivo
	public void updateFileInfo(String newFilePath, double newSize) {
		this.storagePath = newFilePath;
		this.fileSizeMb = newSize;
		this.uploadDate = LocalDateTime.now();
	}

	public String getStoragePath() {
		return this.storagePath;
	}

	public String getFilename() {
		return this.filename;
	}

	protected void setFilename(String filename) {
		this.filename = filename;
		this.fileExtension = this.extractExtension(filename);
	}

	protected void setStoragePath(String path) {
		this.storagePath = path;
	}

}