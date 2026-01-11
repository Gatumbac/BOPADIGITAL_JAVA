package ServiceCatalogCMS;

import java.math.BigDecimal;
import java.util.*;

public class CatalogItem extends CatalogComponent {

	Collection<Condition> conditions;
	Collection<Benefit> benefits;
	private BigDecimal price;

	/**
	 * 
	 * @param criteria
	 */
	public boolean isMatch(CatalogFilterCriteria criteria) {
		// TODO - implement CatalogItem.isMatch
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement CatalogItem.operation
		throw new UnsupportedOperationException();
	}

	@Override
	public BigDecimal getPrice() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
	}

}