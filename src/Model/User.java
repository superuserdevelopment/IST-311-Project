package Model;

import java.util.ArrayList;

public class User {

    private String name;
    private String username;
    private String password;
    private ArrayList<String> holdings;
    private ArrayList<String> watchlist;
    private ArrayList<String> favorites;

    /**
     * Parameterized constructor to initialize the Model.User object with given data
     * @param name the name of the user
     * @param username the username of the user
     * @param password the password of the user
     */
    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        holdings = new ArrayList<String>();
        watchlist = new ArrayList<String>();
        favorites = new ArrayList<String>();
    }

    /**
     * Constructor to initialize the Model.User object with default data
     */
    public User() {
        name = "";
        username = "";
        password = "";
        holdings = new ArrayList<String>();
        watchlist = new ArrayList<String>();
        favorites = new ArrayList<String>();
    }

    /**
     * Gets the name of the user stored in this object
     * @return the name of the user stored in this object
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user stored in this object
     * @param name the name of the user stored in this object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the username of the user stored in this object
     * @return the username of the user stored in this object
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user stored in this object
     * @param username the username of the user stored in this object
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Validates the password for the given user
     * @param password the password to be valiated
     * @return true if password is valid, false if password is invalid
     */
    public boolean validatePassword(String password) {
        boolean isPasswordValid = false;
        return isPasswordValid;
    }

    /**
     * Sets the password for the user object
     * @param oldPassword the old password of the user
     * @param newPassword the new password to be set
     * @return true if password is valid, false if password is invalid
     */
    public boolean setPassword(String oldPassword, String newPassword) {
        boolean isPasswordValid = false;
        return isPasswordValid;
    }

    /**
     * Gets the holdings of the user
     * @return ArrayList of the holdings
     */
    public ArrayList<String> getHoldings() {
        return holdings;
    }

    /**
     * Gets the watchlist of the user
     * @return ArrayList of the holdings
     */
    public ArrayList<String> getWatchlist() {
        return watchlist;
    }

    /**
     * Gets the favorites of the user
     * @return ArrayList of the holdings
     */
    public ArrayList<String> getFavorites() {
        return favorites;
    }

}

