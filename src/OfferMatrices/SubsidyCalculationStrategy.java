package OfferMatrices;

import java.math.BigDecimal;

public interface SubsidyCalculationStrategy {

	/**
	 * 
	 * @param totalMatrixValue
	 * @param clientCurrentBilling
	 * @param serviceCount
	 */
	BigDecimal calculate(BigDecimal totalMatrixValue, BigDecimal clientCurrentBilling, BigDecimal serviceCount);

}