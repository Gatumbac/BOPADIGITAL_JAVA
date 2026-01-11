package Reports;

import CoreUsers.*;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Report {

	private ReportExporter exporter;
	private Employee generatedBy;
	private List<PerformanceMetric> metrics;
	private List<ReportChart> visualizations;
	private String title;
	private LocalDateTime generationDate;

	public Report(Employee generatedBy, String title) {
		this.generatedBy = generatedBy;
		this.title = title;
		this.generationDate = LocalDateTime.now();
		this.metrics = new ArrayList<>();
		this.visualizations = new ArrayList<>();
	}

	public void setExporter(ReportExporter exporter) {
		this.exporter = exporter;
	}

	// SD-REP-002: Exportar reporte usando Strategy pattern
	public File exportData(ReportExporter exporter) {
		this.setExporter(exporter);
		PDFExporter currentExporter = (PDFExporter) this.exporter;
		File exportedFile = currentExporter.export(this);
		return exportedFile;
	}

	// SD-REP-001: Agregar métrica al reporte
	public void addMetric(PerformanceMetric metric) {
		boolean isValid = metric.validateData();
		if (isValid) {
			this.metrics.add(metric);
			metric.setReport(this);
		}
	}

	public void addVisualization(ReportChart chart) {
		this.visualizations.add(chart);
	}

	public void operation() {
		// Template method para operaciones específicas
	}

	public String getTitle() {
		return this.title;
	}

	public LocalDateTime getGenerationDate() {
		return this.generationDate;
	}

	public List<PerformanceMetric> getMetrics() {
		return this.metrics;
	}

	public Employee getGeneratedBy() {
		return this.generatedBy;
	}

}