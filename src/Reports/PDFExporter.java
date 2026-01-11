package Reports;

import java.io.File;
import java.util.List;

public class PDFExporter implements ReportExporter {

	// SD-REP-002: Exportar reporte a PDF
	@Override
	public File export(Report report) {
		String title = report.getTitle();
		String filename = this.generateFilename(title);
		File pdfFile = new File(filename);
		List<PerformanceMetric> metrics = report.getMetrics();
		this.writeMetricsToPdf(pdfFile, metrics);
		return pdfFile;
	}

	private String generateFilename(String title) {
		String sanitizedTitle = title.replace(" ", "_");
		String timestamp = String.valueOf(System.currentTimeMillis());
		String filename = sanitizedTitle + "_" + timestamp + ".pdf";
		return filename;
	}

	private void writeMetricsToPdf(File file, List<PerformanceMetric> metrics) {
		for (PerformanceMetric metric : metrics) {
			String name = metric.getMetricName();
			double value = metric.getValue();
			// Simula escritura al PDF
		}
	}

}