package Employability;

public abstract class ApplicationState {

	protected JobApplication context;
	private String name;
	private String description;

	/**
	 * 
	 * @param application
	 */
	public void setContext(JobApplication application) {
		this.context = application;
	}

	public void submitApplication() {
		PendingState nextState = new PendingState();
		context.changeState(nextState);
	}

	public void evaluate(boolean isApproved) {
		ApplicationState nextState;
		if (isApproved) {
			AcceptedState acceptedState = new AcceptedState();
			nextState = acceptedState;
		} else {
			RejectedState rejectedState = new RejectedState();
			nextState = rejectedState;
		}
		context.changeState(nextState);
	}

}