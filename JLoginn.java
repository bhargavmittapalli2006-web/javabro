import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class JLoginn extends JFrame implements ActionListener{
    Container c;
    JPanel p1;
    JTextField t1,t2;
    JPasswordField t3;
    JButton b1;
    public JLoginn(){
        c=getContentPane();
        p1=new JPanel(new FlowLayout());
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JPasswordField(20);
        t1.setBackground(Color.GRAY);
        t2.setBackground(Color.BLUE);
        t3.setToolTipText("<html><b> Enter min 8  characters</b></html>");
        t1.requestFocusInWindow();
        t1.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 24));
        t2.setFont(new Font("Arial",Font.ITALIC | Font.BOLD,24));
        t1.setHorizontalAlignment(JTextField.CENTER);
        b1=new JButton("login");
        b1.addActionListener(this);
        p1.add(t1);
        p1.add(t3);
        p1.add(t2);
        p1.add(b1);
        c.add(p1,BorderLayout.CENTER);
        setTitle("login using swings");
        setVisible(true);
        setSize(500,500);
        t2.setEditable(false);
    
    }
    
    public void actionPerformed(ActionEvent e){
        String s1 = t1.getText();
        String s2 = t3.getText();
        if(s1.equals("cse")  && s2.equals("hsection"))
        t2.setText("valid");
        else
        t2.setText("Invalid");
        
    }
    public static void main(String[] args) {
        new JLoginn();
    }
}