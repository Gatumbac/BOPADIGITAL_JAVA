package OfferMatrices;

import Employability.*;
import ServiceCatalogCMS.CatalogItem;
import CRM.*;

import java.math.BigDecimal;
import java.util.*;
import CoreUsers.*;
import Documents.*;

public class OfferMatrix extends Publisher implements NotifiableEntity {

	private Negotiation negotiation;
	private MatrixState state;
	private SubsidyCalculationStrategy subsidyStrategy;
	private List<MatrixLineItem> items;
	private ImmediateSupervisor approvedBy;
	private SalesAdvisor creator;
	private List<MatrixAttachment> attachments;
	private Date creationDate;
	private String observations;
	private BigDecimal totalAmount;
	private BigDecimal calculatedSubsidy;
	private boolean isApproved;
	private Date approvalDate;
	private String supervisorMessage;

	// SD-MAT-001: Constructor para crear nueva matriz
	public OfferMatrix(Negotiation negotiation, SalesAdvisor creator) {
		super();
		this.negotiation = negotiation;
		this.creator = creator;
		this.creationDate = new Date();
		this.items = new ArrayList<>();
		this.attachments = new ArrayList<>();
		this.totalAmount = BigDecimal.ZERO;
		this.calculatedSubsidy = BigDecimal.ZERO;
		this.isApproved = false;
		DraftMatrixState initialState = new DraftMatrixState();
		this.state = initialState;
		this.state.setContext(this);
		StandardSubsidyStrategy defaultStrategy = new StandardSubsidyStrategy();
		this.subsidyStrategy = defaultStrategy;
	}

	public void changeState(MatrixState newState) {
		this.state = newState;
		newState.setContext(this);
	}

	public MatrixState getCurrentState() {
		return this.state;
	}

	public void setSubsidyStrategy(SubsidyCalculationStrategy strategy) {
		this.subsidyStrategy = strategy;
	}

	// SD-MAT-005: Enviar matriz a supervisor
	public void sendToSupervisor() {
		DraftMatrixState currentState = (DraftMatrixState) this.state;
		currentState.sendForApproval();
	}

	// SD-SUP-002: Aprobar matriz
	public void approve(ImmediateSupervisor supervisor) {
		this.approvedBy = supervisor;
		this.isApproved = true;
		this.approvalDate = new Date();
		ApprovedMatrixState approvedState = new ApprovedMatrixState();
		this.changeState(approvedState);
		this.notifySubscribers();
	}

	// SD-SUP-003: Rechazar matriz
	public void reject(ImmediateSupervisor supervisor, String reason) {
		this.approvedBy = supervisor;
		this.isApproved = false;
		this.supervisorMessage = reason;
		RejectedMatrixState rejectedState = new RejectedMatrixState();
		this.changeState(rejectedState);
		this.notifySubscribers();
	}

	// SD-MAT-002: Agregar ítem a la matriz
	public boolean addItem(CatalogItem catalogItem, int quantity, BigDecimal customPrice) {
		MatrixLineItem lineItem = new MatrixLineItem(this, catalogItem, quantity, customPrice);
		boolean wasAdded = this.items.add(lineItem);
		if (wasAdded) {
			this.recalculateTotals();
		}
		return wasAdded;
	}

	// SD-MAT-003: Recalcular totales con estrategia de subsidio
	public void recalculateTotals() {
		BigDecimal itemsTotal = BigDecimal.ZERO;
		for (MatrixLineItem item : this.items) {
			BigDecimal itemTotal = item.calculateTotal();
			itemsTotal = itemsTotal.add(itemTotal);
		}
		this.setTotalAmount(itemsTotal);
		BusinessClient client = this.negotiation.getClient();
		BigDecimal clientBilling = client.getCurrentMonthlyBilling();
		int servicesCount = client.getActiveServicesCount();
		BigDecimal servicesBD = new BigDecimal(servicesCount);
		BigDecimal subsidy = this.subsidyStrategy.calculate(this.totalAmount, clientBilling, servicesBD);
		this.setCalculatedSubsidy(subsidy);
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setCalculatedSubsidy(BigDecimal subsidy) {
		this.calculatedSubsidy = subsidy;
	}

	// SD-MAT-004: Guardar borrador
	public void saveDraft(String observations) {
		this.observations = observations;
		DraftMatrixState currentState = (DraftMatrixState) this.getCurrentState();
		currentState.editDetails();
	}

	public void addAttachment(MatrixAttachment attachment) {
		this.attachments.add(attachment);
	}

	public Negotiation getNegotiation() {
		return this.negotiation;
	}

	public SalesAdvisor getCreator() {
		return this.creator;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public boolean hasItems() {
		boolean hasItems = !this.items.isEmpty();
		return hasItems;
	}

	@Override
	public String getRecipientEmail() {
		String email = this.creator.getEmail();
		return email;
	}

	@Override
	public String getNotificationMessage() {
		String message = "Matriz actualizada";
		return message;
	}

	@Override
	public String getNotificationTitle() {
		String title = "Notificacion de Matriz";
		return title;
	}

}