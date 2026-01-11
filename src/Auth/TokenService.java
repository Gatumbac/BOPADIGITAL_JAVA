package Auth;

public interface TokenService {

	/**
	 * 
	 * @param user
	 */
	String generateToken(SystemUser user);

	/**
	 * 
	 * @param token
	 */
	boolean validateToken(String token);

}