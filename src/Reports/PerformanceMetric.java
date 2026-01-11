package Reports;

public class PerformanceMetric {

	private Report report;
	private String metricName;
	private double value;
	private String unit;

	public PerformanceMetric(String metricName, double value, String unit) {
		this.metricName = metricName;
		this.value = value;
		this.unit = unit;
	}

	public boolean validateData() {
		boolean hasName = this.metricName != null && !this.metricName.isEmpty();
		boolean hasValidValue = this.value >= 0;
		boolean isValid = hasName && hasValidValue;
		return isValid;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public String getMetricName() {
		return this.metricName;
	}

	public double getValue() {
		return this.value;
	}

	public String getUnit() {
		return this.unit;
	}

}