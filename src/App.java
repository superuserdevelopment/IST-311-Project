import Controllers.DatabaseController;

import java.sql.Connection;

public class App {
    public static void main(String[] args){
        Connection connection = null;
        DatabaseController databaseController = new DatabaseController("TradingDatabase.accdb");
        databaseController.makeConnection();
        databaseController.addUser("test", "Doe", "doe@example.com", "987-654-3210", true, true, "SuperSafePassword", true);
    }
}
