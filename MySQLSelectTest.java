import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLSelectTest {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "system";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            if (conn != null) {
                System.out.println("Connection established");

                String sql = "SELECT * FROM student";

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String course = rs.getString("course");
                    System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
                }

                rs.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Select failed");
            e.printStackTrace();
        }
    }
}
//java -cp ".;mysql-connector-j-26.7.0.jar" MySQLSelectTest 
