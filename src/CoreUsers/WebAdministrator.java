package CoreUsers;

import ServiceCatalogCMS.*;
import Employability.*;

public class WebAdministrator extends Employee {

	// SD-CMS-001: Crear item en catálogo (dentro de una categoría)
	public boolean createCatalogItem(CMSFacade facade, String categoryName, CatalogItem item) {
		boolean wasCreated = facade.addItemToCategory(categoryName, item);
		return wasCreated;
	}

	// SD-CMS-002: Editar contenido web (CompanyInfo)
	public boolean editCompanyContent(CMSFacade facade, String key, String newContent) {
		boolean wasEdited = facade.editCompanyInfo(key, newContent);
		return wasEdited;
	}

	// SD-EMP-003: Evaluar postulación
	public void evaluateApplication(JobApplication application, boolean isApproved) {
		ApplicationState currentState = application.getCurrentState();
		currentState.evaluate(isApproved);
	}

}