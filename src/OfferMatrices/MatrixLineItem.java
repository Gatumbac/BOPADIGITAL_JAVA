package OfferMatrices;

import java.math.BigDecimal;

import ServiceCatalogCMS.*;

public class MatrixLineItem {

	private OfferMatrix matrix;
	private CatalogItem item;
	private int quantity;
	private BigDecimal unitPrice;
	private BigDecimal total;

	// SD-MAT-002: Constructor para crear ítem de matriz
	public MatrixLineItem(OfferMatrix matrix, CatalogItem item, int quantity, BigDecimal customPrice) {
		this.matrix = matrix;
		this.item = item;
		this.quantity = quantity;
		boolean hasCustomPrice = customPrice != null;
		if (hasCustomPrice) {
			this.unitPrice = customPrice;
		} else {
			BigDecimal catalogPrice = item.getPrice();
			this.unitPrice = catalogPrice;
		}
		this.total = BigDecimal.ZERO;
	}

	// SD-MAT-002: Calcular total del ítem
	public BigDecimal calculateTotal() {
		BigDecimal qty = new BigDecimal(this.quantity);
		BigDecimal lineTotal = this.unitPrice.multiply(qty);
		this.total = lineTotal;
		return this.total;
	}

	public CatalogItem getItem() {
		return this.item;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

}