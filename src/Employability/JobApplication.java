package Employability;

import java.time.LocalDateTime;

import Documents.*;

public class JobApplication extends Publisher implements NotifiableEntity {

	JobVacancy applications;
	SalesAdvisorCandidate candidate;
	ApplicationState currentState;
	CandidateResume attachedResume;
	private LocalDateTime applicationDate;
	private String coverLetter;
	private boolean isReviewed;
	private String reviewNotes;
	private String reviewDate;

	/**
	 * 
	 * @param state
	 */
	public void changeState(ApplicationState state) {
		// TODO - implement JobApplication.changeState
		throw new UnsupportedOperationException();
	}

	public ApplicationState getCurrentState() {
		return this.currentState;
	}

	public void submit() {
		// TODO - implement JobApplication.submit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param isApproved
	 */
	public void evaluateApplication(boolean isApproved) {
		// TODO - implement JobApplication.evaluateApplication
		throw new UnsupportedOperationException();
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