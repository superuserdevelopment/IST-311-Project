package View;

import Controllers.DatabaseController;
import Controllers.UserAuthenticationService;
import Model.User;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
    JButton submitButton;
    JPanel loginPanel;
    JLabel usernameLabel, passwordLabel;
    final JTextField  usernameField, passwordField;

    public LoginForm()
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //create label for username
        usernameLabel = new JLabel();
        usernameLabel.setText("Username");      //set label value for usernameField

        //create text field to get username from the user
        usernameField = new JTextField(15);    //set length of the text

        //create label for password
        passwordLabel = new JLabel();
        passwordLabel.setText("Password");      //set label value for passwordField

        //create text field to get password from the user
        passwordField = new JPasswordField(15);    //set length for the password

        //create submit button
        submitButton = new JButton("SUBMIT"); //set label to button

        //create panel to put form elements
        loginPanel = new JPanel(new GridLayout(3, 1));
        loginPanel.add(usernameLabel);    //set username label to panel
        loginPanel.add(usernameField);   //set text field to panel
        loginPanel.add(passwordLabel);    //set password label to panel
        loginPanel.add(passwordField);   //set text field to panel
        loginPanel.add(submitButton);           //set button to panel

        //set border to panel
        add(loginPanel, BorderLayout.CENTER);

        //perform action on button click
        submitButton.addActionListener(this);     //add action listener to button
        setTitle("LOGIN FORM");         //set title to the login form
    }

    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter
    {
        String username = usernameField.getText();        //get user entered username from the usernameField
        String password = passwordField.getText();        //get user entered pasword from the passwordField

        UserAuthenticationService userAuthenticationService = new UserAuthenticationService("TradingDatabase.accdb");
        DatabaseController databaseController = new DatabaseController("TradingDatabase.accdb");
        databaseController.makeConnection();
        //check whether the credentials are authentic or not
        if (userAuthenticationService.validateUser(username, password)) {  //if authentic, navigate user to a new page
            User user = databaseController.getUserDetails(username);
            //create instance of the NewPage
            HomePage page = new HomePage();

            //make page visible to the user
            page.setVisible(true);

            //create a welcome label and set it to the new page
            JLabel nameLabel = new JLabel("Welcome: "+ ((user != null)? user.getName() : "Name not found"));
            JLabel usernameLabel = new JLabel("Username: "+ ((user != null)? user.getUsername() : "Username not found"));
            page.getContentPane().add(nameLabel);
            //page.getContentPane().add(usernameLabel);
        }
        else{
            //show error message
            JOptionPane.showMessageDialog(null, "Invalid Username or Password",
                    "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
