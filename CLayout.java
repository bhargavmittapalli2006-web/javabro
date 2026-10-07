import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class CLayout extends JFrame implements ActionListener{
    Container c;
    CardLayout cn;
    JButton b1,b2,b3;
    public CLayout(){
        c=getContentPane();
        cn=new CardLayout();
        setLayout(cn);
        b1=new JButton("computer");
        b2=new JButton("Science");
        b3=new JButton("engineering");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        setTitle("asdfghjkl");
        setSize(500,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        cn.previous(c);
        //cn.next(c);
        //cn.last(c);
        //cn.first(c);
    }
    public static void main(String[] args) {
        new CLayout();
    }
}