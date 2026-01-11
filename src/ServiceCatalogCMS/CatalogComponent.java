package ServiceCatalogCMS;

import java.math.BigDecimal;

public abstract class CatalogComponent {

	private String name;
	private String description;

	public String getDetails() {
		// TODO - implement CatalogComponent.getDetails
		throw new UnsupportedOperationException();
	}

	public abstract BigDecimal getPrice();

	/**
	 * 
	 * @param keyword
	 */
	public CatalogComponent[] search(String keyword) {
		// TODO - implement CatalogComponent.search
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param criteria
	 */
	public CatalogComponent[] filter(CatalogFilterCriteria criteria) {
		// TODO - implement CatalogComponent.filter
		throw new UnsupportedOperationException();
	}

}