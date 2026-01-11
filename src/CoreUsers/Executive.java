package CoreUsers;

import java.util.ArrayList;
import java.util.List;
import Reports.*;

public class Executive extends ImmediateSupervisor {

	private List<SalesObjective> objectives;
	private String managementRegion;

	public Executive() {
		super();
		this.objectives = new ArrayList<>();
	}

	public void defineStrategicObjetctive(SalesObjective objective) {
		this.objectives.add(objective);
	}

	public boolean managesZone(String zone) {
		boolean manages = this.managementRegion != null && this.managementRegion.equals(zone);
		return manages;
	}

	// SD-REP-001: Generar reporte gerencial
	public CommercialPerformanceReport generateReport(ReportFacade facade, ReportFilter filter) {
		CommercialPerformanceReport report = facade.generateManagerReport(this, filter);
		return report;
	}

	// SD-REP-002: Exportar reporte a PDF
	public void exportReportToPdf(Report report) {
		PDFExporter pdfExporter = new PDFExporter();
		report.exportData(pdfExporter);
	}

}