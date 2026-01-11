package Documents;

import java.io.File;

public class DocumentUploadService {

	private FileStorageService storageService;
	private static DocumentUploadService instance;
	private DocumentFactory documentFactory;

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

	public BaseDocument uploadFile(File file, String destinationFolder) {
		String storagePath = storageService.uploadFile(file, destinationFolder);
		String fileName = file.getName();
		DocumentConfig config = new DocumentConfig(fileName, storagePath);
		BaseDocument document = documentFactory.createDocument(config);
		return document;
	}

	public void setFactory(DocumentFactory factory) {
		this.documentFactory = factory;
	}

}