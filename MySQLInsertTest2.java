import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MySQLInsertTest2 {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "system";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            if (conn != null) {
                System.out.println("Connection established");

                String sql = "INSERT INTO student (name, course) VALUES (?, ?)";

                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, course);

                int rows = ps.executeUpdate();
                System.out.println(rows + " row(s) inserted");

                ps.close();
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Insert failed");
            e.printStackTrace();
        }

        sc.close();
    }
}