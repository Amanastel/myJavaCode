import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        ResourceBundle resourceBundle =  ResourceBundle.getBundle("db");
        System.out.println(resourceBundle);
    }
}