package ServiceCatalogCMS;

import java.util.*;

public class Catalog {

	private List<CatalogComponent> categories;

	public Catalog() {
		this.categories = new ArrayList<>();
	}

	// SD-CAT-002: Filtrar catálogo por criterio
	public List<CatalogComponent> filter(CatalogFilterCriteria criteria) {
		List<CatalogComponent> results = new ArrayList<>();
		List<CatalogComponent> categories = this.getAllCategories();
		for (CatalogComponent category : categories) {
			List<CatalogComponent> categoryResults = category.filter(criteria);
			results.addAll(categoryResults);
		}
		return results;
	}


	// SD-CAT-001: Buscar en catálogo por palabra clave
	public List<CatalogComponent> search(String keyword) {
		List<CatalogComponent> results = new ArrayList<>();
		List<CatalogComponent> categories = this.getAllCategories();
		for (CatalogComponent category : categories) {
			List<CatalogComponent> categoryResults = category.search(keyword);
			results.addAll(categoryResults);
		}
		return results;
	}

	// SD-CMS-001: Agregar componente al catálogo
	public boolean addItem(CatalogComponent component) {
		boolean wasAdded = this.categories.add(component);
		return wasAdded;
	}

	public boolean removeItem(CatalogComponent component) {
		boolean wasRemoved = this.categories.remove(component);
		return wasRemoved;
	}

	// SD-CAT-001: Obtener categoría por nombre
	public CatalogComponent getCategory(String categoryName) {
		CatalogComponent foundCategory = null;
		for (CatalogComponent category : this.categories) {
			String name = category.getName();
			boolean matches = name != null && name.equals(categoryName);
			if (matches) {
				foundCategory = category;
			}
		}
		return foundCategory;
	}

	public List<CatalogComponent> getAllCategories() {
		return this.categories;
	}

}