import java.util.ArrayList;

public class User {
  
  private String name;
  private String username;
  private String password;
  private ArrayList<String> holdings;
  private ArrayList<String> watchlist;
  private ArrayList<String> favorites;
  
 public User(String name, String username, String password) {
    this.name = name;
    this.username = username;
    this.password = password;
    holdings = new ArrayList<String>();
    watchlist = new ArrayList<String>();
    favorites = new ArrayList<String>();
 }

 public User(){
  name = "";
  username = "";
  password = "";
  holdings = new ArrayList<String>();
  watchlist = new ArrayList<String>();
  favorites = new ArrayList<String>();
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
  
  public boolean validatePassword(String password) {
    boolean isPasswordValid = true;
    return isPasswordValid;
  }
  
  public boolean setPassword(String oldPassword, String newPassword) {
    boolean isPasswordValid = true;
    return isPasswordValid;
  }
  
  public ArrayList<String> getHoldings() {
     return holdings;
  }
  
   public ArrayList<String> getWatchlist(String[] args) {
    return watchlist;
  }
  
   public ArrayList<String> getFavorites(String[] args) {
     return favorites;
  }
  
}

