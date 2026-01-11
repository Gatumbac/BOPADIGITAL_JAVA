package Documents;

import CoreUsers.*;

public abstract class DocumentNegotiationState {

	NegotiationDocument context;
	private String name;
	private String description;

	/**
	 * 
	 * @param context
	 */
	public void setContext(NegotiationDocument context) {
		this.context = context;
	}

	/**
	 * 
	 * @param coordinator
	 */
	public void approve(Coordinator coordinator) {
		// TODO - implement DocumentNegotiationState.approve
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param coordinator
	 */
	public void reject(Coordinator coordinator) {
		// TODO - implement DocumentNegotiationState.reject
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newFilePath
	 * @param newSize
	 */
	public void replaceFile(String newFilePath, double newSize) {
		// TODO - implement DocumentNegotiationState.replaceFile
		throw new UnsupportedOperationException();
	}

}