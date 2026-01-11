package Documents;

import java.io.File;

public class S3EmcryptedStorage implements FileStorageService {

	// SD-DOC-001: Subir archivo encriptado a S3
	@Override
	public String uploadFile(File file, String destinationFolder) {
		String filename = file.getName();
		String encryptedPath = destinationFolder + "/" + filename;
		// Simula encriptación y subida
		return encryptedPath;
	}

	// SD-DOC-004: Descargar archivo de S3
	@Override
	public File downloadFile(String storagePath) {
		String filename = this.extractFilename(storagePath);
		File downloadedFile = new File(filename);
		// Simula descarga y desencriptación
		return downloadedFile;
	}

	private String extractFilename(String path) {
		int lastSlash = path.lastIndexOf('/');
		String filename = path;
		if (lastSlash >= 0) {
			filename = path.substring(lastSlash + 1);
		}
		return filename;
	}

}