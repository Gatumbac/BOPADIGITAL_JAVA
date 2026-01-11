package Reports;

import CoreUsers.*;

import java.io.File;
import java.time.LocalDateTime;
import java.util.*;

public abstract class Report {

	ReportExporter exporter;
	Employee generatedBy;
	Collection<PerformanceMetric> metrics;
	Collection<ReportChart> visualizations;
	private String title;
	private LocalDateTime generationDate;

	/**
	 * 
	 * @param exporter
	 */
	public void setExporter(ReportExporter exporter) {
		this.exporter = exporter;
	}

	public File exportData() {
		// TODO - implement Report.exportData
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param metric
	 */
	public void addMetric(PerformanceMetric metric) {
		// TODO - implement Report.addMetric
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement Report.operation
		throw new UnsupportedOperationException();
	}

}