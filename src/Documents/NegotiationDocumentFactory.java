package Documents;

import CRM.Negotiation;

public class NegotiationDocumentFactory extends DocumentFactory {

	// SD-DOC-001: Crear documento de negociación
	@Override
	public BaseDocument createDocument(DocumentConfig config) {
		Negotiation negotiation = config.getNegotiation();
		DocumentType type = config.getType();
		String filename = config.getFilename();
		String storagePath = config.getStoragePath();
		NegotiationDocument document = new NegotiationDocument(negotiation, type, filename, storagePath);
		return document;
	}

}