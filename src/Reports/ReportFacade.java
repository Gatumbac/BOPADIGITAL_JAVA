package Reports;

import CoreUsers.*;

public class ReportFacade {

	// SD-REP-001: Generar reporte gerencial de ventas
	public CommercialPerformanceReport generateManagerReport(Executive manager, ReportFilter filter) {
		boolean validFilter = filter.validateDates();
		CommercialPerformanceReport report = null;
		if (validFilter) {
			report = new CommercialPerformanceReport(manager);
			PerformanceMetric salesMetric = new PerformanceMetric("Ventas Totales", 0, "USD");
			report.addMetric(salesMetric);
			PerformanceMetric conversionMetric = new PerformanceMetric("Tasa de Conversion", 0, "%");
			report.addMetric(conversionMetric);
			report.addMarketInsight("Analisis del periodo");
		}
		return report;
	}

	public OperationalReport generateSupervisorReport(ImmediateSupervisor supervisor, ReportFilter filter) {
		boolean validFilter = filter.validateDates();
		OperationalReport report = null;
		if (validFilter) {
			report = new OperationalReport(supervisor);
			PerformanceMetric visitsMetric = new PerformanceMetric("Visitas Realizadas", 0, "unidades");
			report.addMetric(visitsMetric);
		}
		return report;
	}

}