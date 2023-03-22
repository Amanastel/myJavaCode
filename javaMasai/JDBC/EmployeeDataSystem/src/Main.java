import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("hello user: ");
        String url = "jdbc:mysql://localhost:3306/Problem01";
        String name = "root";
        String pass = "aman1234";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,name,pass);
        Statement statement = con.createStatement();
        String query = "select * from st";
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
    }
}