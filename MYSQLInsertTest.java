import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class MYSQLInsertTest {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "system";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            if (conn != null) {
                System.out.println("Connection established");

                //String sql = "INSERT INTO student (name, course) VALUES ('Vardhaman', 'Java')";
                String sql1 = "INSERT INTO student (name,course) VALUES ('CMR','python')";
                Statement stmt = conn.createStatement();
                int rows = stmt.executeUpdate(sql1);
                System.out.println(rows + " row(s) inserted");

                stmt.close();
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Insert failed");
            e.printStackTrace();
        }
    }
}