package Employability;

public abstract class ApplicationState {

	JobApplication context;
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
		// TODO - implement ApplicationState.submitApplication
		throw new UnsupportedOperationException();
	}

	public boolean validateApplication() {
		// TODO - implement ApplicationState.validateApplication
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param isApproved
	 */
	public void evaluate(boolean isApproved) {
		// TODO - implement ApplicationState.evaluate
		throw new UnsupportedOperationException();
	}

}