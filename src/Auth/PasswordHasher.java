package Auth;

public interface PasswordHasher {

	/**
	 * 
	 * @param password
	 */
	String generateHash(String password);

	/**
	 * 
	 * @param plainPassword
	 * @param hashPassword
	 */
	boolean verifyPassword(String plainPassword, String hashPassword);

}