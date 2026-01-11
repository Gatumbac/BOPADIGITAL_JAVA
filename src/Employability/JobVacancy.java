package Employability;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JobVacancy {

	private List<JobApplication> applications;
	private String title;
	private String description;
	private String[] requirements;
	private LocalDateTime publicatioDate;
	private LocalDateTime closingDate;
	private String[] requiredDocuments;
	private boolean isActive;
	private boolean isPublished;

	/**
	 * 
	 * @param title
	 * @param closingDate
	 */
	public boolean updateVacancy(String title, LocalDateTime closingDate) {
		// TODO - implement JobVacancy.updateVacancy
		throw new UnsupportedOperationException();
	}

	public void closeVacancy() {
		// TODO - implement JobVacancy.closeVacancy
		throw new UnsupportedOperationException();
	}

	public boolean isActive() {
		boolean expired = this.isExpired();
		boolean active = false;
		if (this.isActive && !expired) {
			active = true;
		}
		return active;
	}

	public boolean isExpired() {
		LocalDateTime now = LocalDateTime.now();
		boolean expired = now.isAfter(closingDate);
		return expired;
	}

	public boolean isPublished() {
		return this.isPublished;
	}

	public void addApplication(JobApplication application) {
		this.applications.add(application);
	}

}