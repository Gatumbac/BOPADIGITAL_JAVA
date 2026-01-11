package ServiceCatalogCMS;

import java.math.BigDecimal;

public class CatalogFilterCriteria {

	private String searchTerm;
	private BigDecimal minPrice;
	private BigDecimal maxPrice;
	private String coverage;
	private String categoryName;

	public CatalogFilterCriteria() {
		this.minPrice = BigDecimal.ZERO;
		this.maxPrice = new BigDecimal("999999");
	}

	public CatalogFilterCriteria withSearchTerm(String term) {
		this.searchTerm = term;
		return this;
	}

	public CatalogFilterCriteria withPriceRange(BigDecimal min, BigDecimal max) {
		this.minPrice = min;
		this.maxPrice = max;
		return this;
	}

	public CatalogFilterCriteria withCategory(String category) {
		this.categoryName = category;
		return this;
	}

	public String getSearchTerm() {
		return this.searchTerm;
	}

	public BigDecimal getMinPrice() {
		return this.minPrice;
	}

	public BigDecimal getMaxPrice() {
		return this.maxPrice;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

}