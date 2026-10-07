import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginApp extends JFrame implements ActionListener {
  
    private static final String URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String USER = "root";
    private static final String PASSWORD = "system";
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginBtn;
    private JButton clearBtn;
    private JLabel statusLabel;

    public LoginApp() {
        setTitle("Login");
        setSize(340, 220);
        setLocationRelativeTo(null);
		setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        JPanel formPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 5, 20));
        userField = new JTextField();
        passField = new JPasswordField();
        formPanel.add(new JLabel("Username:"));
        formPanel.add(userField);
        formPanel.add(new JLabel("Password:"));
        formPanel.add(passField);      
        JPanel buttonPanel = new JPanel(new FlowLayout());
        loginBtn = new JButton("Login");
        clearBtn = new JButton("Clear");
        loginBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        buttonPanel.add(loginBtn);
        buttonPanel.add(clearBtn);        
        statusLabel = new JLabel("Enter your username and password", JLabel.CENTER);
        JPanel bottomPanel = new JPanel(new GridLayout(2, 1));
        bottomPanel.add(buttonPanel);
        bottomPanel.add(statusLabel);
        add(formPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);   
        passField.addActionListener(this);
    }
   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearBtn) {
            userField.setText("");
            passField.setText("");
            statusLabel.setForeground(Color.BLACK);
            statusLabel.setText("Enter your username and password");
            userField.requestFocus();
        } else {
            login();  
        }
    }
       private void login() {
        String username = userField.getText().trim();
        String password = new String(passField.getPassword());
        if (username.length() == 0 || password.length() == 0) {
           statusLabel.setForeground(Color.RED);
            statusLabel.setText("Please enter both username and password");
            return;
        }
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    
                    statusLabel.setForeground(new Color(0, 130, 0));
                    statusLabel.setText("Login successful. Welcome, " + username + "!");
                    JOptionPane.showMessageDialog(this, "Welcome, " + username + "!");
                } else {
                    
                    statusLabel.setForeground(Color.RED);
                    statusLabel.setText("Invalid username or password");
                    passField.setText("");
                    passField.requestFocus();
                }
            }

        } catch (SQLException ex) {
            statusLabel.setForeground(Color.RED);
            statusLabel.setText("Database error");
            JOptionPane.showMessageDialog(this, "Database error:\n" + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
       new LoginApp();
            }
}