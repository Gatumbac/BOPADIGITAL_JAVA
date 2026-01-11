package ServiceCatalogCMS;

import java.math.BigDecimal;
import java.util.*;

public abstract class CatalogComponent {

	private String name;
	private String description;

	// SD-CAT-001: Obtener detalles del componente
	public String getDetails() {
		String details = this.name + ": " + this.description;
		return details;
	}

	public abstract BigDecimal getPrice();

	// SD-CAT-001: Búsqueda por palabra clave (Composite)
	public List<CatalogComponent> search(String keyword) {
		List<CatalogComponent> results = new ArrayList<>();
		boolean matchesName = this.name != null && this.name.contains(keyword);
		boolean matchesDesc = this.description != null && this.description.contains(keyword);
		if (matchesName || matchesDesc) {
			results.add(this);
		}
		return results;
	}

	// SD-CAT-002: Filtrado por criterio (Composite)
	public abstract List<CatalogComponent> filter(CatalogFilterCriteria criteria);

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}