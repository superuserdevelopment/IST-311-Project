package Controllers;

import javax.swing.*;
import java.sql.*;

public class DatabaseController {
    static String DATABASE_URL = "jdbc:ucanaccess://" + System.getProperty("user.dir") + "//";
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public DatabaseController(String databaseName){
        DATABASE_URL += databaseName;
    }

    public DatabaseController(){
        DATABASE_URL += "HumanResources.accdb";
    }

    public boolean makeConnection(){
        try{
            connection = DriverManager.getConnection(DATABASE_URL);

            return true;
        }
        catch(SQLException sqlerror) {
            System.out.println("Error: " + sqlerror.getLocalizedMessage());
            return false;
        }
    }

    public int addUser(String userID, String name, String email, String phoneNumber, boolean isCryptoAccount, boolean isStockAccount, String password, boolean isAdmin){
        int result = 0; //return

        try{
            PreparedStatement insertNewUser = connection.prepareStatement("INSERT INTO Users (Name, Email, PhoneNumber, isCryptoAccount, isStockAccount, Password, isAdmin, UserID) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            insertNewUser.setString(1, name);
            insertNewUser.setString(2, email);
            insertNewUser.setString(3, phoneNumber);
            insertNewUser.setBoolean(4, isCryptoAccount);
            insertNewUser.setBoolean(5, isStockAccount);
            insertNewUser.setString(6, password);
            insertNewUser.setBoolean(7, isAdmin);
            insertNewUser.setString(8, userID);

            result = insertNewUser.executeUpdate();
            if(result == 1){
                JOptionPane.showMessageDialog(null, name, "User added to the table", JOptionPane.INFORMATION_MESSAGE);
            }

        }catch (SQLException sqlerror){
            System.out.println(sqlerror.getMessage());
            JOptionPane.showMessageDialog(null, sqlerror.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    public void displayUserDetails(){
        try{
            PreparedStatement checkIfUserIsValid = connection.prepareStatement("SELECT * FROM Users");
            resultSet = checkIfUserIsValid.executeQuery();
            System.out.println("Name\tEmail\t\tPhone Number\t\tisCryptoAccount\tisStockAccount\tUserID");
            while(resultSet.next()){
                System.out.println(resultSet.getString("Name") + "\t" + resultSet.getString("Email") + "\t\t" + resultSet.getString("PhoneNumber") + "\t\t" + resultSet.getBoolean("isCryptoAccount") + "\t\t" + resultSet.getBoolean("isStockAccount") + "\t\t" + resultSet.getString("UserID"));
            }
        }catch (SQLException sqlerror){
            System.out.println(sqlerror.getMessage());
        }
    }


}
