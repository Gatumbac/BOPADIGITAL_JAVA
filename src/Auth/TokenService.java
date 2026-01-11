package Auth;

public interface TokenService {

	/**
	 * 
	 * @param user
	 */
	String generateToken(SystemUser user);

	boolean validateToken(String token);

	SystemUser getUserFromToken(String token);

}