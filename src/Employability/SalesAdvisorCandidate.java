package Employability;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import Documents.*;

public class SalesAdvisorCandidate {

	private List<JobApplication> applications;
	private List<CandidateResume> resumeHistory;
	private String name;
	private String lastname;
	private String email;
	private String phone;
	private String address;
	private int applicationCount;

	// SD-EMP-001: Ver vacantes activas
	public List<JobVacancy> viewActiveVacancies(VacancyFacade facade) {
		List<JobVacancy> activeVacancies = facade.getActiveVacancies();
		return activeVacancies;
	}

	// SD-EMP-002: Candidato envía postulación (con CV)
	public JobApplication applyToVacancy(JobVacancy vacancy, File resumeFile) {
		JobApplication application = new JobApplication(this, vacancy);
		CandidateResume resume = this.uploadResume(resumeFile);
		application.attachResume(resume);
		vacancy.addApplication(application);
		application.submit();	
		return application;
	}

	public CandidateResume uploadResume(File file) {
		DocumentUploadService uploadService = DocumentUploadService.getInstance();
		CandidateResumeFactory factory = new CandidateResumeFactory();
		uploadService.setFactory(factory);
		String destinationFolder = "resumes";
		BaseDocument document = uploadService.uploadFile(file, destinationFolder);
		CandidateResume resume = (CandidateResume) document;
		this.resumeHistory.add(resume);
		return resume;
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