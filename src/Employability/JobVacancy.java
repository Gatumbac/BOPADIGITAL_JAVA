package Employability;

import java.time.LocalDateTime;
import java.util.*;

public class JobVacancy {

	Collection<JobApplication> vacancy;
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
		// TODO - implement JobVacancy.isActive
		throw new UnsupportedOperationException();
	}

	public boolean isExpired() {
		// TODO - implement JobVacancy.isExpired
		throw new UnsupportedOperationException();
	}

	public boolean isPublished() {
		// TODO - implement JobVacancy.isPublished
		throw new UnsupportedOperationException();
	}

}