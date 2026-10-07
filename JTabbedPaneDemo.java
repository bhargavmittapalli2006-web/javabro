/* is is a swing component that lets user to switch b/w diferent panels or components  by clicking on iconified tabs.it is useful by layering
mutiple interfaces with in a single window shoing one layer at a time.*/
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
class CBox extends JPanel{
    JCheckBox c1,c2,c3;
    public CBox(){
        c3=new JCheckBox("cut");
        c1=new JCheckBox("Copy");
        c2=new JCheckBox("paste");
        add(c1);
        add(c2);   
        add(c3);
    }
}
class BBox extends JPanel{
    JButton b1,b2,b3;
    public BBox(){
        b1=new JButton("vit-a");
        b2=new JButton("vit-b");
        b3=new JButton("vit-c");
        add(b1);
        add(b2);
        add(b3);

    }
}
class ComBox extends JPanel{
    JComboBox cb;
    public ComBox(){
        String s[]={"apple","banana","grapes","mango","orange"};
        cb=new JComboBox(s);
        add(cb);
    }
}
public class JTabbedPaneDemo extends JFrame{
    Container c;
    JTabbedPane tp;
    public JTabbedPaneDemo(){
        c=getContentPane();
        c.setLayout(new FlowLayout());
        tp=new JTabbedPane();
        tp.addTab("CheckBox",new CBox());
        tp.addTab("Button",new BBox());
        tp.addTab("ComboBox",new ComBox());
        c.add(tp);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
        setTitle("Tabbed Pane Demo");
        tp.setBackground(Color.red);
        tp.setForeground(Color.white);
        tp.setEnabledAt(2, false);
    }
    public static void main(String[] args) {
        new JTabbedPaneDemo();
    }
}