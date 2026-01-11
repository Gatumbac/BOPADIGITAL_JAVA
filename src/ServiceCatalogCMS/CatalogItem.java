package ServiceCatalogCMS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CatalogItem extends CatalogComponent {

	private List<Condition> conditions;
	private List<Benefit> benefits;
	private BigDecimal price;

	public CatalogItem() {
		this.conditions = new ArrayList<>();
		this.benefits = new ArrayList<>();
		this.price = BigDecimal.ZERO;
	}

	// SD-CAT-002: Verificar si coincide con criterio de filtro
	public boolean isMatch(CatalogFilterCriteria criteria) {
		BigDecimal minPrice = criteria.getMinPrice();
		BigDecimal maxPrice = criteria.getMaxPrice();
		boolean priceInRange = this.price.compareTo(minPrice) >= 0 && this.price.compareTo(maxPrice) <= 0;
		String searchTerm = criteria.getSearchTerm();
		boolean matchesTerm = true;
		if (searchTerm != null) {
			String name = this.getName();
			matchesTerm = name != null && name.contains(searchTerm);
		}
		boolean isMatch = priceInRange && matchesTerm;
		return isMatch;
	}

	// SD-CAT-002: Filtrado para Leaf (retorna a sí mismo si coincide)
	@Override
	public List<CatalogComponent> filter(CatalogFilterCriteria criteria) {
		List<CatalogComponent> results = new ArrayList<>();
		boolean matches = this.isMatch(criteria);
		if (matches) {
			results.add(this);
		}
		return results;
	}

	public void operation() {
		String details = this.getDetails();
		// Operación del Composite pattern
	}

	@Override
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void addCondition(Condition condition) {
		this.conditions.add(condition);
	}

	public void addBenefit(Benefit benefit) {
		this.benefits.add(benefit);
	}

}