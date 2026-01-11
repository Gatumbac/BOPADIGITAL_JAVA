package OfferMatrices;

import CoreUsers.*;

public abstract class MatrixState {

	protected OfferMatrix context;
	private String name;
	private String description;

	public void setContext(OfferMatrix context) {
		this.context = context;
	}

	public OfferMatrix getContext() {
		return this.context;
	}

	// Por defecto no permite editar
	public void editDetails() {
		// No hace nada en estados donde no se permite edición
	}

	// Por defecto no permite enviar a aprobación
	public void sendForApproval() {
		// No hace nada en estados donde no se permite enviar
	}

	public void approve(ImmediateSupervisor supervisor) {
		// No hace nada por defecto
	}

	public void reject(ImmediateSupervisor supervisor, String reason) {
		// No hace nada por defecto
	}

}