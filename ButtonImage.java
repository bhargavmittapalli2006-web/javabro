import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImage extends JFrame implements ActionListener{

    JButton b1,b2,b3,b4;
    ImageIcon i1,i2,i3;
    Container c;

    public ButtonImage(){

        c=getContentPane();
        c.setLayout(new FlowLayout());

        i1=new ImageIcon("Screenshot 2026-09-16 141724.png");
        i2=new ImageIcon("Screenshot 2026-09-16 141717.png");
        i3=new ImageIcon("Screenshot 2026-09-16 141708.png");

        b1=new JButton("CUT",i1);
        b2=new JButton("COPY",i2);
        b3=new JButton("PASTE",i3);
        b4=new JButton("exit");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);

        b4.setToolTipText("exit on click");

        setTitle("button image");
        setSize(500,500);
         //setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
      
    }

    public void actionPerformed(ActionEvent e){

        String s=e.getActionCommand();

        if(s.equals("CUT")){
            b2.setRolloverIcon(i1);
        }

        if(s.equals("PASTE")){
            b2.setRolloverIcon(i3);
        }

        if(s.equals("exit")){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new ButtonImage();
    }
}