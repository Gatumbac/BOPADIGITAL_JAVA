package Reports;

import java.util.Date;

import ServiceCatalogCMS.*;

public class ReportFilter {

	private Category serviceType;
	private Date startDate;
	private Date endDate;
	private String zone;

	public ReportFilter(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public boolean validateDates() {
		boolean hasStartDate = this.startDate != null;
		boolean hasEndDate = this.endDate != null;
		boolean isValid = false;
		if (hasStartDate && hasEndDate) {
			boolean startBeforeEnd = this.startDate.before(this.endDate);
			isValid = startBeforeEnd;
		}
		return isValid;
	}

	public boolean matchesDate(Date dateToCheck) {
		boolean afterStart = dateToCheck.after(this.startDate) || dateToCheck.equals(this.startDate);
		boolean beforeEnd = dateToCheck.before(this.endDate) || dateToCheck.equals(this.endDate);
		boolean matches = afterStart && beforeEnd;
		return matches;
	}

	public ReportFilter withZone(String zone) {
		this.zone = zone;
		return this;
	}

	public ReportFilter withServiceType(Category type) {
		this.serviceType = type;
		return this;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public String getZone() {
		return this.zone;
	}

}