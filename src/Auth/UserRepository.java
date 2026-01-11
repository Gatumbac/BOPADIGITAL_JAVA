package Auth;

public interface UserRepository {

	/**
	 * 
	 * @param email
	 */
	SystemUser findByEmail(String email);

}