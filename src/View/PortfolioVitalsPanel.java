/**
 * IST-311 Object Oriented Design and Software Application
 * Prof. Jesse Middaugh
 * Project
 * Team-2
 */

package View;

import Controllers.DatabaseController;
import Controllers.UserAuthenticationService;
import Model.Stock;
import Model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class PortfolioVitalsPanel extends JPanel implements ActionListener {

    private JLabel returns;
    private JLabel dailyReturns;
    private JLabel returnsValue;
    private JLabel dailyReturnsValue;
    private JPanel stockReturnsPanel;
    private JPanel cryptoReturnsPanel;
    private JPanel StocksPanel;
    private JPanel CryptoPanel;
    private JButton addStock;
    private JButton addCrypto;
    private User user;
    private StockInformationPanel stockInformationPanel;
    private StockInformationPanel stockInformationPanel1;
    public PortfolioVitalsPanel(User user){
        this.setLayout(new GridLayout(4,2));
        returns = new JLabel();
        dailyReturns = new JLabel();
        returnsValue = new JLabel();
        dailyReturnsValue = new JLabel();
        stockReturnsPanel = new JPanel();
        cryptoReturnsPanel = new JPanel();
        addStock = new JButton();
        addCrypto = new JButton();
        this.user = user;
        returns.setText("Returns");
        returns.setHorizontalAlignment(JLabel.CENTER);
        returns.setFont(new Font("Verdana", Font.PLAIN, 24));

        returnsValue.setText("+10.23%");
        returnsValue.setHorizontalAlignment(JLabel.CENTER);
        returnsValue.setFont(new Font("Verdana", Font.PLAIN, 24));

        dailyReturns.setText("Daily Returns");
        dailyReturns.setHorizontalAlignment(JLabel.CENTER);
        dailyReturns.setFont(new Font("Verdana", Font.PLAIN, 24));

        dailyReturnsValue.setText("-5.79%");
        dailyReturnsValue.setHorizontalAlignment(JLabel.CENTER);
        dailyReturnsValue.setFont(new Font("Verdana", Font.PLAIN, 24));

        addStock.setText("Add Stocks");
        addStock.setSize(50, 20);
        addStock.setMargin(new Insets(30, 30, 30, 30));
        addCrypto.setText("Add Crypto");
        addCrypto.setSize(50, 20);
        addCrypto.setMargin(new Insets(30, 30, 30, 30));

        stockInformationPanel = new StockInformationPanel(user.getHoldings().size(), user);
        stockInformationPanel1 = new StockInformationPanel(user.getHoldings().size(), user);
        this.add(returns);
        this.add(returnsValue);
        this.add(dailyReturns);
        this.add(dailyReturnsValue);

        this.add(stockInformationPanel);
        this.add(stockInformationPanel1);
        addStock.addActionListener(this::actionPerformed);
        this.add(addStock);
        this.add(addCrypto);


    }

    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter
    {
        String result = (String) JOptionPane.showInputDialog(
                this,
                "Enter the scrip of the Stock to be added",
                "Add new Stock",
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                ""
        );

        result = result.toUpperCase();
        DatabaseController databaseController = new DatabaseController("TradingDatabase.accdb");
        databaseController.makeConnection();
        Stock stock = databaseController.getStockDetails(result);
        if(stock != null){
            user.addToHoldings(stock.getScrip());
            databaseController.updateStocks(user);
            stockInformationPanel.revalidate();
            stockInformationPanel.repaint();
            stockInformationPanel1.revalidate();
            stockInformationPanel1.repaint();
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Stock entered",
                    "Stock addition failed", JOptionPane.ERROR_MESSAGE);
        }

    }
}
