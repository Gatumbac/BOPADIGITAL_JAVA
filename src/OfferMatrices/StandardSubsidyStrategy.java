package OfferMatrices;

import java.math.BigDecimal;

public class StandardSubsidyStrategy implements SubsidyCalculationStrategy {

	// SD-MAT-003: Calcular subsidio estándar
	@Override
	public BigDecimal calculate(BigDecimal totalMatrixValue, BigDecimal clientCurrentBilling, BigDecimal serviceCount) {
		BigDecimal baseRate = new BigDecimal("0.10");
		BigDecimal baseSubsidy = totalMatrixValue.multiply(baseRate);
		BigDecimal billingFactor = this.calculateBillingFactor(clientCurrentBilling);
		BigDecimal serviceFactor = this.calculateServiceFactor(serviceCount);
		BigDecimal adjustedSubsidy = baseSubsidy.multiply(billingFactor);
		BigDecimal finalSubsidy = adjustedSubsidy.multiply(serviceFactor);
		return finalSubsidy;
	}

	private BigDecimal calculateBillingFactor(BigDecimal billing) {
		BigDecimal threshold = new BigDecimal("1000");
		BigDecimal factor = BigDecimal.ONE;
		int comparison = billing.compareTo(threshold);
		if (comparison > 0) {
			factor = new BigDecimal("1.5");
		} else {
			factor = BigDecimal.ONE;
		}
		return factor;
	}

	private BigDecimal calculateServiceFactor(BigDecimal services) {
		BigDecimal threshold = new BigDecimal("5");
		BigDecimal factor = BigDecimal.ONE;
		int comparison = services.compareTo(threshold);
		if (comparison > 0) {
			factor = new BigDecimal("1.2");
		} else {
			factor = BigDecimal.ONE;
		}
		return factor;
	}

}