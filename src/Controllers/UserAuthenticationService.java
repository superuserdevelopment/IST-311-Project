package Controllers;

import java.sql.*;

public class UserAuthenticationService extends DatabaseController {

    /**
     * Parameterized Constructor for the UserAuthenticationService class
     * @param databaseName name of the database that is to be controlled
     */
    public UserAuthenticationService(String databaseName){
        super(databaseName);
    }

    /**
     * Validates user credentials
     * @param username
     * @param password
     * @return true if valid else invalid
     */
    public boolean validateUser(String username, String password){
        boolean successful = makeConnection();
        if(!successful)
            return false;
        try{
            PreparedStatement checkIfUserIsValid = connection.prepareStatement("SELECT Password FROM Users WHERE UserID = ?");
            checkIfUserIsValid.setString(1, username);
            resultSet = checkIfUserIsValid.executeQuery();
            if(resultSet.next() && resultSet.getString("Password").equals(password)){
                return true;
            }
        }catch (SQLException sqlerror){
            System.out.println(sqlerror.getMessage());

        }
        return false;


    }

    /**
     * Checks if given user is admin
     * @param username
     * @param password
     * @return true if user is admin else returns false
     */
    public boolean isAdmin(String username, String password){
        boolean successful = validateUser(username, password);
        if(!successful)
            return false;
        try{
            PreparedStatement checkIfUserIsValid = connection.prepareStatement("SELECT isAdmin FROM Users WHERE UserID = ?");
            checkIfUserIsValid.setString(1, username);
            resultSet = checkIfUserIsValid.executeQuery();
            if(resultSet.next() && resultSet.getBoolean("isAdmin")){
                return true;
            }
        }catch (SQLException sqlerror){
            System.out.println(sqlerror.getMessage());

        }
        return false;


    }
}
