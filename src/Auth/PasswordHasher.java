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
	String verifyPassword(String plainPassword, String hashPassword);

}