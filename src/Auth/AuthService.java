package Auth;

public class AuthService {

	private PasswordHasher hasher;
	private UserRepository users;
	private TokenService tokenService;

	// SD-SEG-001: Login de Usuario
	public String login(String email, String plainPassword) {
		SystemUser user = users.findByEmail(email);
		String storedHash = user.getPasswordHash();
		boolean isValid = hasher.verifyPassword(plainPassword, storedHash);
		String token = null;
		if (isValid) {
			token = tokenService.generateToken(user);
		}
		return token;
	}

	// SD-SEG-002: Verificar Permiso de Usuario
	public boolean checkPermission(String token, String resource, String action) {
		boolean isValidToken = tokenService.validateToken(token);
		boolean hasPermission = false;
		if (isValidToken) {
			SystemUser user = tokenService.getUserFromToken(token);
			boolean isActive = user.verifyActive();
			if (isActive) {	
				hasPermission = user.hasPermission(resource, action);;
			} 
		} 
		return hasPermission;
	}

}