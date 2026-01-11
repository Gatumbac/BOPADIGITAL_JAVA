package Auth;

import java.time.LocalDateTime;

import CoreUsers.*;

public class SystemUser {

	private Employee employee;
	private Role role;
	private String email;
	private String passwordHash;
	private boolean isActive;
	private LocalDateTime createdAt;
	private LocalDateTime lastConnection;

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public boolean verifyActive() {
		return this.isActive;
	}

	/**
	 * 
	 * @param role
	 */
	public boolean addRole(Role role) {
		// TODO - implement SystemUser.addRole
		throw new UnsupportedOperationException();
	}

	public boolean hasPermission(String resource, String action) {
		boolean hasPermission = role.hasPermission(resource, action);
		return hasPermission;
	}

	public String getEmail() {
		return this.email;
	}

}