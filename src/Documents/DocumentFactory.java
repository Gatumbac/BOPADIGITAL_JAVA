package Documents;

public abstract class DocumentFactory {

	public abstract BaseDocument createDocument(DocumentConfig config);

	// Template Method: crear y validar documento
	public BaseDocument processDocument(DocumentConfig config) {
		BaseDocument document = this.createDocument(config);
		document.validateFormat();
		return document;
	}

}