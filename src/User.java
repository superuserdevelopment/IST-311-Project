import java.util.ArrayList;

public class User {
  
  private String name;
  private String username;
  private String password;
  ArrayList<String> holdings = new ArrayList<String>();
  ArrayList<String> watchlist = new ArrayList<String>();
  ArrayList<String> favorites = new ArrayList<String>();
  
 public User(String name, String username, String password) {
    this.name = name;
    this.username = username;
    this.password = password;
 }
  
 public String getName() {
    return name;
 }
	
 public void setName(String name) {
    this.name = name;
 }
  
 public String getUsername() {
    return username;
 }
	
 public void setUsername(String username) {
    this.username = username;
 }
  
  public void validatePassword(String password, String[] args) {
    boolean isPasswordValid = true;
    boolean isPasswordNotValid = false;
  }
  
  public void setPassword(String username, String password, String[] args) {
    this.username = username;
    this.password = passwword;
  }
  
  public void getHoldings(String[] args) {
    return holdings; 
  }
  
   public void getWatchlist(String[] args) {
    return watchlist; 
  }
  
   public void getFavorites(String[] args) {
    return favorites; 
  }
  
}

