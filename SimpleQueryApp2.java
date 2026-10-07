import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class SimpleQueryApp2 extends JFrame implements ActionListener {

    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "system";

    private JTextField queryField;
    private JButton executeBtn;
    private JButton clearBtn;
    private JTable table;
    private JScrollPane scrollPane;
    private JLabel statusLabel;

    public SimpleQueryApp2() {
        setTitle("Simple MySQL Query Tool");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
     
        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        queryField = new JTextField("SELECT * FROM students");
        queryField.addActionListener(this);     // pressing Enter also runs the query
        executeBtn = new JButton("Execute");
        executeBtn.addActionListener(this);
        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 5, 0));
        buttonPanel.add(executeBtn);
        buttonPanel.add(clearBtn);

        topPanel.add(new JLabel(" SQL: "), BorderLayout.WEST);
        topPanel.add(queryField, BorderLayout.CENTER);
        topPanel.add(buttonPanel, BorderLayout.EAST);

       
        table = new JTable();
        scrollPane = new JScrollPane(table);
        statusLabel = new JLabel(" Ready");
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);
        		setVisible(true);

    }
   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearBtn) {
            clearAll();
        } else {
            runQuery();  
        }
    }
  
    private void clearAll() {
        queryField.setText("");
        table = new JTable();               
        scrollPane.setViewportView(table);
        statusLabel.setText(" Cleared");
        queryField.requestFocus();         
    }
   
    private void runQuery() {
        String sql = queryField.getText().trim();

        if (sql.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a SQL query.");
            return;
        }
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                  ResultSet.CONCUR_READ_ONLY)) {

            boolean isSelect = stmt.execute(sql);

            if (isSelect) {
                ResultSet rs = stmt.getResultSet();
                showInTable(rs);
            } else {
                int count = stmt.getUpdateCount();
                statusLabel.setText(" " + count + " row(s) affected. Run a SELECT to see the changes.");
            }

        } catch (SQLException ex) {
            statusLabel.setText(" Error");
            JOptionPane.showMessageDialog(this, "Database error:\n" + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showInTable(ResultSet rs) throws SQLException {
        ResultSetMetaData meta = rs.getMetaData();
        int cols = meta.getColumnCount();
        rs.last();
        int rows = rs.getRow();
        rs.beforeFirst();

       
        String[] columnNames = new String[cols];
        for (int i = 0; i < cols; i++) {
            columnNames[i] = meta.getColumnLabel(i + 1);
        }
        
        Object[][] data = new Object[rows][cols];
        int r = 0;
        while (rs.next()) {
            for (int c = 0; c < cols; c++) {
                data[r][c] = rs.getObject(c + 1);
            }
            r++;
        }

        
        table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);

        statusLabel.setText(" " + rows + " row(s) returned");
    }

   
    public static void main(String[] args) {
        new SimpleQueryApp2();
       
    }
}