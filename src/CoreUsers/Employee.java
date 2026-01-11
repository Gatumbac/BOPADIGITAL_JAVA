package CoreUsers;

import Auth.*;

public abstract class Employee {

	private SystemUser credentials;
	private String employeeCode;
	private String firstName;
	private String secondName;
	private String lastName;
	private String secondLastName;

	public String getFullName() {
		String fullName = this.firstName + " " + this.lastName;
		return fullName;
	}

	public String getEmail() {
		String email = this.credentials.getEmail();
		return email;
	}

}