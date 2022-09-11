import java.io.ObjectStreamField;
import java.util.*;

public class UserAuthenticationService 
{
  ArrayList<String> users;
  
  public UserAuthenticationService(){
    users  = new ArrayList<String>();
  }
  public Object loginUser(String username, String password) {
    return new Object();
  }
  
  public Object createNewUser(String name, String username, String password) {
    return new Object();
  }
  
  public Object deleteUser(String username, String password) {
    return new Object();
  }

}
