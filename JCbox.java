/*JComboBox which is drop down box which displays list of items from which user can select only one item at a time .as ususally it genertes item event handled by
itemlistener and also action event handled  by actionlistener.the methods getselectedindex and getselecteditem can be used to retrive the option
selected by the user*/
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class JCbox extends JFrame implements ActionListener {
    Container c;
    JComboBox jc;
    public JCbox(){
        c=getContentPane();
        String s[]={"java","python","c++","ruby","c++"};
        jc=new JComboBox(s);
        setVisible(true);
        setSize(500,500);
        setTitle("qwertyuiop");
        setLayout(new FlowLayout());
        c.add(jc);
        jc.addActionListener(this);
    }    
    public void actionPerformed(ActionEvent e){
        String s=(String)jc.getSelectedItem();
        int i=jc.getSelectedIndex();
        JOptionPane.showMessageDialog(this, s+"atIndex"+(i+1),"JCombobox",JOptionPane.INFORMATION_MESSAGE);

    }
    public static void main(String[] args) {
        new JCbox();
    }
}