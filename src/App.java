import Controllers.DatabaseController;
import Controllers.UserAuthenticationService;
import View.LoginForm;
import javax.swing.*;
import java.sql.Connection;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
//        Connection connection = null;
//        UserAuthenticationService userAuthenticationService = new UserAuthenticationService("TradingDatabase.accdb");
//        Scanner sc = new Scanner(System.in);
//        String username, password;
//        System.out.print("Enter username: ");
//        username = sc.nextLine();
//        System.out.print("Enter password: ");
//        password = sc.nextLine();
//        if(userAuthenticationService.validateUser(username, password)){
//            System.out.println("--Login Successful--");
//            if(userAuthenticationService.isAdmin(username, password)){
//                System.out.println("--Admin privileges granted--");
//                userAuthenticationService.displayUserDetails();
//            }
//            else{
//                System.out.println("--Not Admin--");
//            }
//        }
//        else{
//            System.out.println("--Login Unsuccessful--");
//        }
        try
        {
            //create instance of the CreateLoginForm
            LoginForm form = new LoginForm();
            form.setSize(300,100);  //set size of the frame
            form.setVisible(true);  //make form visible to the user
        }
        catch(Exception e)
        {
            //handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        //databaseController.addUser("test", "Doe", "doe@example.com", "987-654-3210", true, true, "SuperSafePassword", true);
    }
}
