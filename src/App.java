import Controllers.DatabaseController;
import Controllers.UserAuthenticationService;

import java.sql.Connection;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Connection connection = null;
        UserAuthenticationService userAuthenticationService = new UserAuthenticationService("TradingDatabase.accdb");
        Scanner sc = new Scanner(System.in);
        String username, password;
        System.out.print("Enter username: ");
        username = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();
        if(userAuthenticationService.validateUser(username, password)){
            System.out.println("--Login Successful--");
            if(userAuthenticationService.isAdmin(username, password)){
                System.out.println("--Admin privileges granted--");
            }
            else{
                System.out.println("--Not Admin--");
            }
        }
        else{
            System.out.println("--Login Unsuccessful--");
        }

        //databaseController.addUser("test", "Doe", "doe@example.com", "987-654-3210", true, true, "SuperSafePassword", true);
    }
}
