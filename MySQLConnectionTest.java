import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySQLConnectionTest {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "system"; //"Anil@#123";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            //System.out.println(conn);
                
            if (conn != null) {
                System.out.println("Connection established");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}