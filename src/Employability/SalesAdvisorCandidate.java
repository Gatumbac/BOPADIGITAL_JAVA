package Employability;

import java.io.File;
import java.util.*;
import Documents.*;

public class SalesAdvisorCandidate {

	Collection<JobApplication> applications;
	Collection<CandidateResume> resumeHistory;
	private String name;
	private String lastname;
	private String email;
	private String phone;
	private String address;
	private int applicationCount;

	/**
	 * 
	 * @param vacancy
	 */
	public JobApplication applyToVacancy(JobVacancy vacancy) {
		// TODO - implement SalesAdvisorCandidate.applyToVacancy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param file
	 */
	public CandidateResume uploadResume(File file) {
		// TODO - implement SalesAdvisorCandidate.uploadResume
		throw new UnsupportedOperationException();
	}

	public JobApplication[] getApplications() {
		// TODO - implement SalesAdvisorCandidate.getApplications
		throw new UnsupportedOperationException();
	}

	public CandidateResume getLatestResume() {
		// TODO - implement SalesAdvisorCandidate.getLatestResume
		throw new UnsupportedOperationException();
	}

}