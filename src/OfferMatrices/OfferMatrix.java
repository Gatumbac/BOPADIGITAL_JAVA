package OfferMatrices;

import Employability.*;
import ServiceCatalogCMS.CatalogItem;
import CRM.*;

import java.math.BigDecimal;
import java.util.*;
import CoreUsers.*;
import Documents.*;

public class OfferMatrix extends Publisher implements NotifiableEntity {

	Negotiation negotiation;
	MatrixState state;
	SubsidyCalculationStrategy subsidyStrategy;
	Collection<MatrixLineItem> items;
	ImmediateSupervisor approvedBy;
	SalesAdvisor creator;
	Collection<MatrixAttachment> attachments;
	private Date creationDate;
	private String observations;
	private BigDecimal totalAmount;
	private BigDecimal calculatedSubsidy;
	private boolean isApproved;
	private Date approvalDate;
	private String supervisorMessage;

	/**
	 * 
	 * @param state
	 */
	public void changeState(MatrixState state) {
		// TODO - implement OfferMatrix.changeState
		throw new UnsupportedOperationException();
	}

	public MatrixState getCurrentState() {
		// TODO - implement OfferMatrix.getCurrentState
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param strategy
	 */
	public void setSubsidyStrategy(SubsidyCalculationStrategy strategy) {
		this.subsidyStrategy = strategy;
	}

	public void sendToSupervisor() {
		// TODO - implement OfferMatrix.sendToSupervisor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param supervisor
	 */
	public void approve(ImmediateSupervisor supervisor) {
		// TODO - implement OfferMatrix.approve
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param supervisor
	 * @param reason
	 */
	public void reject(ImmediateSupervisor supervisor, String reason) {
		// TODO - implement OfferMatrix.reject
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param catalogItem
	 * @param quantity
	 * @param customPrice
	 */
	public boolean addItem(CatalogItem catalogItem, int quantity, BigDecimal customPrice) {
		// TODO - implement OfferMatrix.addItem
		throw new UnsupportedOperationException();
	}

	public void recalculateTotals() {
		// TODO - implement OfferMatrix.recalculateTotals
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attachment
	 */
	public void addAttachment(MatrixAttachment attachment) {
		// TODO - implement OfferMatrix.addAttachment
		throw new UnsupportedOperationException();
	}

	@Override
	public String getRecipientEmail() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getRecipientEmail'");
	}

	@Override
	public String getNotificationMessage() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNotificationMessage'");
	}

	@Override
	public String getNotificationTitle() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNotificationTitle'");
	}

}