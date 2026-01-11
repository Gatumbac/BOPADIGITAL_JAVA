package Documents;

public abstract class DocumentFactory {

	/**
	 * 
	 * @param config
	 */
	public abstract BaseDocument createDocument(DocumentConfig config);

	/**
	 * 
	 * @param config
	 */
	public BaseDocument processDocument(DocumentConfig config) {
		// TODO - implement DocumentFactory.processDocument
		throw new UnsupportedOperationException();
	}

}