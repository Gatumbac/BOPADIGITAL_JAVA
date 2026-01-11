package ServiceCatalogCMS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Category extends CatalogComponent {

	private List<CatalogComponent> children;

	public Category() {
		this.children = new ArrayList<>();
	}

	// SD-CMS-001: Agregar componente hijo
	public boolean add(CatalogComponent component) {
		boolean wasAdded = this.children.add(component);
		return wasAdded;
	}

	public boolean remove(CatalogComponent component) {
		boolean wasRemoved = this.children.remove(component);
		return wasRemoved;
	}

	// SD-CAT-001: Obtener ítems de la categoría (Composite)
	public List<CatalogComponent> getItems() {
		List<CatalogComponent> items = new ArrayList<>(this.children);
		return items;
	}

	// SD-CAT-001: Búsqueda recursiva en hijos
	@Override
	public List<CatalogComponent> search(String keyword) {
		List<CatalogComponent> results = super.search(keyword);
		for (CatalogComponent child : this.children) {
			List<CatalogComponent> childResults = child.search(keyword);
			results.addAll(childResults);
		}
		return results;
	}

	// SD-CAT-002: Filtrado recursivo en hijos
	@Override
	public List<CatalogComponent> filter(CatalogFilterCriteria criteria) {
		List<CatalogComponent> results = new ArrayList<>();
		for (CatalogComponent child : this.children) {
			List<CatalogComponent> childResults = child.filter(criteria);
			results.addAll(childResults);
		}
		return results;
	}

	@Override
	public BigDecimal getPrice() {
		BigDecimal total = BigDecimal.ZERO;
		for (CatalogComponent child : this.children) {
			BigDecimal childPrice = child.getPrice();
			total = total.add(childPrice);
		}
		return total;
	}

}