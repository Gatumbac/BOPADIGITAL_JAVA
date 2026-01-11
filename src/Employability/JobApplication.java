package Employability;

import java.time.LocalDateTime;

import Documents.*;

public class JobApplication extends Publisher implements NotifiableEntity {

	private JobVacancy vacancy;
	private SalesAdvisorCandidate candidate;
	private ApplicationState currentState;
	private CandidateResume attachedResume;
	private LocalDateTime applicationDate;
	private String coverLetter;
	private boolean isReviewed;
	private String reviewNotes;
	private String reviewDate;

	public JobApplication(SalesAdvisorCandidate candidate, JobVacancy vacancy) {
		super();
		this.candidate = candidate;
		this.vacancy = vacancy;
		DraftState initialState = new DraftState();
		this.currentState = initialState;
		this.currentState.setContext(this);
	}

	public void changeState(ApplicationState newState) {
		this.currentState = newState;
		newState.setContext(this);
	}

	public ApplicationState getCurrentState() {
		return this.currentState;
	}

	public void attachResume(CandidateResume resume) {
		this.attachedResume = resume;
	}

	// SD-EMP-004: Sistema notifica recepción (llamado internamente)
	public void submit() {
		ApplicationState state = this.currentState;
		state.submitApplication();
		this.notifySubscribers();
	}

	// SD-EMP-003: Evaluar postulación
	public void evaluateApplication(boolean isApproved) {
		ApplicationState state = this.currentState;
		state.evaluate(isApproved);
		this.notifySubscribers();
	}

	@Override
	public String getRecipientEmail() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getRecipientEmail'");
	}

	@Override
	public String getNotificationMessage() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNotificationMessage'");
	}

	@Override
	public String getNotificationTitle() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNotificationTitle'");
	}

}