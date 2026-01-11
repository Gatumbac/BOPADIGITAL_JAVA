package Employability;

import java.util.*;

public class VacancyFacade {

	private List<JobVacancy> vacancies;

	// SD-EMP-001: Ver vacantes activas
	public List<JobVacancy> getActiveVacancies() {
		List<JobVacancy> activeList = new ArrayList<>();
		for (JobVacancy vacancy : vacancies) {
			boolean isActive = vacancy.isActive();
			boolean isPublished = vacancy.isPublished();
			if (isActive && isPublished) {
				activeList.add(vacancy);
			}
		}
		return activeList;
	}

	/**
	 * 
	 * @param vacancy
	 */
	public boolean createJobVacancy(JobVacancy vacancy) {
		// TODO - implement VacancyFacade.createJobVacancy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vacancy
	 */
	public boolean updateJobVacancy(JobVacancy vacancy) {
		// TODO - implement VacancyFacade.updateJobVacancy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vacancy
	 */
	public boolean deleteJobVacancy(JobVacancy vacancy) {
		// TODO - implement VacancyFacade.deleteJobVacancy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vacancy
	 */
	public boolean publishJobVacancy(JobVacancy vacancy) {
		// TODO - implement VacancyFacade.publishJobVacancy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vacancy
	 */
	public boolean unpublishJobVacancy(JobVacancy vacancy) {
		// TODO - implement VacancyFacade.unpublishJobVacancy
		throw new UnsupportedOperationException();
	}

}