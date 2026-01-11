package ServiceCatalogCMS;

import java.util.List;

public class CMSFacade {

	private Catalog serviceCatalog;
	private CompanyInfo companyInfo;

	public CMSFacade() {
		this.serviceCatalog = new Catalog();
	}

	public Catalog getServiceCatalog() {
		return this.serviceCatalog;
	}

	// SD-CMS-001: Agregar categoría raíz al catálogo
	public boolean addRootCategory(Category category) {
		boolean wasAdded = this.serviceCatalog.addItem(category);
		return wasAdded;
	}

	// SD-CMS-001: Agregar item a una categoría existente
	public boolean addItemToCategory(String categoryName, CatalogItem item) {
		CatalogComponent component = this.serviceCatalog.getCategory(categoryName);
		Category category = (Category) component;
		boolean wasAdded = category.add(item);
		return wasAdded;
	}

	// SD-CMS-002: Actualizar componente de catálogo
	public boolean updateCatalogComponent(CatalogComponent item) {
		String itemName = item.getName();
		CatalogComponent existing = this.serviceCatalog.getCategory(itemName);
		boolean wasUpdated = false;
		if (existing != null) {
			String newDescription = item.getDescription();
			existing.setDescription(newDescription);
			wasUpdated = true;
		}
		return wasUpdated;
	}

	public boolean deleteCatalogComponent(CatalogComponent item) {
		boolean wasDeleted = this.serviceCatalog.removeItem(item);
		return wasDeleted;
	}

	// SD-CAT-001: Navegar catálogo
	public List<CatalogComponent> browseCategories() {
		List<CatalogComponent> categories = this.serviceCatalog.getAllCategories();
		return categories;
	}

	// SD-CAT-002: Filtrar servicios
	public List<CatalogComponent> filterServices(CatalogFilterCriteria criteria) {
		List<CatalogComponent> filtered = this.serviceCatalog.filter(criteria);
		return filtered;
	}

	public boolean editWebsiteContent(ContentBlock content) {
		content.updateContent(content.getContent());
		return true;
	}

	public boolean editCompanyInfo(String key, String content) {
		this.companyInfo.updateInfo(key, content);
		return true;
	}

}