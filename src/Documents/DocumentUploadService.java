package Documents;

import java.io.File;

public class DocumentUploadService {

	FileStorageService storageService;
	private static DocumentUploadService instance;
	DocumentFactory documentFactory;

	private DocumentUploadService() {
		// TODO - implement DocumentUploadService.DocumentUploadService
		throw new UnsupportedOperationException();
	}

	public static DocumentUploadService getInstance() {
		if (instance == null) {
			return new DocumentUploadService();
		} 
		return instance;
	}

	/**
	 * 
	 * @param file
	 * @param destinationFolder
	 */
	public BaseDocument uploadFile(File file, String destinationFolder) {
		// TODO - implement DocumentUploadService.uploadFile
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param originalName
	 */
	private String generateUniqueName(String originalName) {
		// TODO - implement DocumentUploadService.generateUniqueName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param factory
	 */
	public void setFactory(DocumentFactory factory) {
		// TODO - implement DocumentUploadService.setFactory
		throw new UnsupportedOperationException();
	}

}