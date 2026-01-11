package OfferMatrices;

import CoreUsers.*;

public abstract class MatrixState {

	OfferMatrix context;
	private String name;
	private String description;

	/**
	 * 
	 * @param context
	 */
	public void setContext(OfferMatrix context) {
		this.context = context;
	}

	public void editDetails() {
		// TODO - implement MatrixState.editDetails
		throw new UnsupportedOperationException();
	}

	public void sendForApproval() {
		// TODO - implement MatrixState.sendForApproval
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param supervisor
	 */
	public void approve(ImmediateSupervisor supervisor) {
		// TODO - implement MatrixState.approve
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param supervisor
	 */
	public void reject(ImmediateSupervisor supervisor) {
		// TODO - implement MatrixState.reject
		throw new UnsupportedOperationException();
	}

}