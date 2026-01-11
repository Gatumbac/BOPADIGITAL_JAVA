package Documents;

import java.io.File;

public interface FileStorageService {

	/**
	 * 
	 * @param file
	 * @param destinationFolder
	 */
	String uploadFile(File file, String destinationFolder);

	/**
	 * 
	 * @param storagePath
	 */
	File downloadFile(String storagePath);

}