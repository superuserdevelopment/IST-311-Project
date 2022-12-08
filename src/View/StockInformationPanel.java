/**
 * IST-311 Object Oriented Design and Software Application
 * Prof. Jesse Middaugh
 * Project
 * Team-2
 */
package View;

import Controllers.DatabaseController;
import Model.Stock;
import Model.User;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.ArrayList;

public class StockInformationPanel extends JPanel{
    private User user;
    private JTable stockTable;
    public StockInformationPanel(int rows, int cols, User user){
        String[] columnNamesAll = { "Scrip", "Name", "About", "Stock Value","CEO", "Headquarters", "Founded" };
        this.user = user;
        String[] columnNames = new String[cols];
        for(int i = 0 ; i < cols ; i++){
            columnNames[i] = columnNamesAll[i];
        }
        String[][] data = new String[rows][cols];
        getStockDetails(data, false);
        // Initializing the JTable
        stockTable = new JTable(data, columnNames);

        stockTable.setBounds(30, 40, 500, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(stockTable);
        this.add(sp);

    }
    public StockInformationPanel(int rows, User user){
        String[] columnNames = { "Scrip", "Stock Value"};
        this.user = user;
        String[][] data = new String[rows][2];
        getStockDetails(data, true);
        // Initializing the JTable
        stockTable = new JTable(data, columnNames);
        stockTable.setSize(100,200);


        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(stockTable);
        sp.setMaximumSize(new Dimension(100,200));
        this.add(sp);

    }

    private void getStockDetails(String[][] data, boolean isSummary){
        ArrayList<String> scrips = user.getHoldings();
        DatabaseController databaseController = new DatabaseController("TradingDatabase.accdb");
        databaseController.makeConnection();
        Stock stock;
        for(int i = 0 ; i < data.length ; i++){
            stock = databaseController.getStockDetails(scrips.get(i));
            if(stock != null) {
                if (isSummary) {
                    data[i] = new String[]{scrips.get(i), stock.getValue() + "",};
                } else {
                    data[i] = new String[]{scrips.get(i), stock.getName(), stock.getAbout(), stock.getValue() + "", stock.getCEO(), stock.getHeadquarters(), stock.getFounded() + ""};
                }
            }

        }
    }
}
