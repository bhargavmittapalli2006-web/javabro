import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Mevents extends JFrame{
    JLabel l1;
    JPanel p1;
    Container c;
    public Mevents(){
        l1=new JLabel("show coordinator");
        c=getContentPane();
        setTitle("asdfghjkl");
        setSize(500,500);
        setVisible(true);
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent e){
                int x=e.getX();
                int y=e.getY();
                l1.setText("x:"+x+"y:"+y);
            }
        });
        p1=new JPanel();
        p1.add(l1);
        c.add(p1,"South");
 
    }
    public static void main(String[] args) {
        new Mevents();
    }
}