import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDeleteTest {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "system";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            if (conn != null) {
                System.out.println("Connection established");

                String sql = "DELETE FROM student WHERE name = 'Vardhaman'";

                Statement stmt = conn.createStatement();
                int rows = stmt.executeUpdate(sql);
                System.out.println(rows + " row(s) deleted");

                stmt.close();
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Delete failed");
            e.printStackTrace();
        }
    }
}