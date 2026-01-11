package Auth;

import java.time.LocalDateTime;

import CoreUsers.*;

public class SystemUser {

	Employee employee;
	Role role;
	private String email;
	private String passwordHash;
	private boolean isActive;
	private LocalDateTime createdAt;
	private LocalDateTime lastConnection;

	public boolean verifyActive() {
		// TODO - implement SystemUser.verifyActive
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param role
	 */
	public boolean addRole(Role role) {
		// TODO - implement SystemUser.addRole
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public boolean hasPermission(String name) {
		// TODO - implement SystemUser.hasPermission
		throw new UnsupportedOperationException();
	}

}