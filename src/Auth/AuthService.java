package Auth;

public class AuthService {

	PasswordHasher hasher;
	UserRepository users;
	TokenService tokenService;

	/**
	 * 
	 * @param email
	 * @param passwordHash
	 */
	public String login(String email, String passwordHash) {
		// TODO - implement AuthService.login
		throw new UnsupportedOperationException();
	}

}