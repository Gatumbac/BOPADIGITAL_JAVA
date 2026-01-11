package CoreUsers;

import java.util.ArrayList;
import java.util.List;
import CRM.*;
import OfferMatrices.*;

public class ImmediateSupervisor extends Employee {

	private List<SalesAdvisor> subordinates;
	private String salesZone;

	public ImmediateSupervisor() {
		this.subordinates = new ArrayList<>();
	}

	public void addAdvisorToTeam(SalesAdvisor advisor) {
		this.subordinates.add(advisor);
	}

	// SD-CRM-002: Asignar cliente a asesor
	public void assignClientToAdvisor(BusinessClient client, SalesAdvisor advisor) {
		boolean hasCurrentAdvisor = client.getSeller() != null;
		if (hasCurrentAdvisor) {
			client.unassignAdvisor();
		}
		client.assignToAdvisor(advisor);
	}

	// SD-CRM-005: Verificar visita
	public void reviewVisit(Visit visit, String comments) {
		double distance = visit.calculateDistanceToClientOffice();
    double maxAllowedDistance = 100.0;  // Umbral configurable (ej. 100 metros)
		if (distance <= maxAllowedDistance) {
			visit.markAsVerified(this, comments);	
		} else {
			visit.markAsRejected(this, comments);
		}
	}

	// SD-CRM-008: Desactivar cliente
	public void deactivateClient(BusinessClient client) {
		SalesAdvisor seller = client.getSeller();
		if (seller != null) {
			client.unassignAdvisor();
		}
		client.deactivate();
	}

	// SD-SUP-001: Listar matrices pendientes de aprobación
	public List<OfferMatrix> getPendingMatrices() {
		List<OfferMatrix> pendingMatrices = new ArrayList<>();
		List<SalesAdvisor> subordinates = this.getSubordinates();
		for (SalesAdvisor advisor : subordinates) {
			List<OfferMatrix> advisorMatrices = advisor.getMatricesPendingApproval();
			pendingMatrices.addAll(advisorMatrices);
		}
		return pendingMatrices;
	}

	public List<SalesAdvisor> getSubordinates() {
		return this.subordinates;
	}

	// SD-SUP-002: Aprobar matriz
	public void approveMatrix(OfferMatrix matrix) {
		PendingApprovalState currentState = (PendingApprovalState) matrix.getCurrentState();
		currentState.approve(this);
	}

	// SD-SUP-003: Rechazar matriz
	public void rejectMatrix(OfferMatrix matrix, String reason) {
		PendingApprovalState currentState = (PendingApprovalState) matrix.getCurrentState();
		currentState.reject(this, reason);
	}

	public void reviewOfferMatrix(OfferMatrix matrix, boolean isApproved, String reason) {
		if (isApproved) {
			matrix.approve(this);
		} else {
			matrix.reject(this, reason);
		}
	}

}
