package Documents;

import CoreUsers.*;

public abstract class DocumentNegotiationState {

	protected NegotiationDocument context;
	private String name;
	private String description;

	public void setContext(NegotiationDocument context) {
		this.context = context;
	}

	public NegotiationDocument getContext() {
		return this.context;
	}

	public void approve(Coordinator coordinator) {
		// Por defecto no hace nada
	}

	public void reject(Coordinator coordinator, String reason) {
		// Por defecto no hace nada
	}

	public void replaceFile(String newFilePath, double newSize) {
		// Por defecto no hace nada
	}

}