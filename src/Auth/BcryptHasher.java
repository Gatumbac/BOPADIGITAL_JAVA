package Auth;

public class BcryptHasher implements PasswordHasher {

  @Override
  public String generateHash(String password) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'generateHash'");
  }

  @Override
  public boolean verifyPassword(String plainPassword, String hashPassword) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'verifyPassword'");
  }
}