import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class MySQLConnectionCreate {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "system";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            if (conn != null) {
                System.out.println("Connection established");

                String sql = "CREATE TABLE IF NOT EXISTS student ("
                           + "id INT AUTO_INCREMENT PRIMARY KEY, "
                           + "name VARCHAR(50), "
                           + "course VARCHAR(50))";

                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
                System.out.println("Table 'student' created (or already existed)");

                stmt.close();
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
