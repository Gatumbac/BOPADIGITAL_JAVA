package Auth;

public class JwtTokenService implements TokenService {

  @Override
  public String generateToken(SystemUser user) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'generateToken'");
  }

  @Override
  public boolean validateToken(String token) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'validateToken'");
  }

  @Override
  public SystemUser getUserFromToken(String token) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUserFromToken'");
  }
}