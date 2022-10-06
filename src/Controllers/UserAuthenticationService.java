package Controllers;

import java.sql.*;

public class UserAuthenticationService extends DatabaseController {

    public UserAuthenticationService(String databaseName){
        super(databaseName);
    }

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
