import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        ResourceBundle resourceBundle =  ResourceBundle.getBundle("db");
        Connection connection = DriverManager.getConnection(resourceBundle.getString("url"),resourceBundle.getString("user"),resourceBundle.getString("password"));

//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Problem01", "root", "aman1234");
        System.out.println("connection successfully setup");
        connection.close();
    }
}