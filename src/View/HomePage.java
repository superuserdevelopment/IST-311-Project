/**
 * IST-311 Object Oriented Design and Software Application
 * Prof. Jesse Middaugh
 * Project
 * Team-2
 */

package View;

import Controllers.DatabaseController;
import Controllers.UserAuthenticationService;
import Model.User;

import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {
    HomePage(String username, String password)
    {
        setDefaultCloseOperation(javax.swing.
                WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        setSize(1920, 1000);
        JPanel homePanel = new JPanel(new BorderLayout());
        UserAuthenticationService userAuthenticationService = new UserAuthenticationService("TradingDatabase.accdb");
        DatabaseController databaseController = new DatabaseController("TradingDatabase.accdb");
        databaseController.makeConnection();
        User user = databaseController.getUserDetails(username);
        System.out.println(user.getHoldings());
        //create a welcome label and set it to the new page
        JButton showUsersButton = new JButton("Show user details");
        JLabel nameLabel = new JLabel("Welcome: "+ ((user != null)? user.getName() : "Name not found"));
        JLabel usernameLabel = new JLabel("Username: "+ ((user != null)? user.getUsername() : "Username not found"));
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        nameLabel.setSize(50,20);
        usernameLabel.setHorizontalAlignment(JLabel.CENTER);
        usernameLabel.setSize(50,20);

        JPanel topPanel = new JPanel(new GridLayout(1,2));
        topPanel.add(nameLabel);
        topPanel.add(usernameLabel);

        JPanel middlePanel = new JPanel(new GridLayout(1,2));
        PortfolioVitalsPanel portfolioVitalsPanel = new PortfolioVitalsPanel(user);
        middlePanel.add(portfolioVitalsPanel);

        JPanel comprehensiveInformation = new JPanel(new GridLayout(2,1));
        StockInformationPanel stockInformationPanel = new StockInformationPanel(user.getHoldings().size(), 7, user);
        comprehensiveInformation.add(stockInformationPanel);
        StockInformationPanel stockInformationPanel2 = new StockInformationPanel(user.getHoldings().size(), 7, user);
        comprehensiveInformation.add(stockInformationPanel2);

        middlePanel.add(comprehensiveInformation);
        homePanel.add(topPanel, BorderLayout.NORTH);
        homePanel.add(middlePanel);

        this.add(homePanel, BorderLayout.CENTER);
    }
}
