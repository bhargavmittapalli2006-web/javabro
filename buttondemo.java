import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class buttondemo extends Frame implements ActionListener{

    Button b1,b2,b3,b4;
    public buttondemo(){
        setLayout(new FlowLayout());
        b1=new Button("Nokia");
         b2=new Button("Moto");
        b3=new Button("Iphone");
        b4=new Button("Exit");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    add(b1);// add method belongs to Frame class and it is used to add the component to the frame.
    add(b2);
    add(b3);
    add(b4);
    setTitle("button event demo");
    setVisible(true);
    setSize(500,500);
    setResizable(false);

        
    }
    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        if(s.equals("Nokia")){
            setBackground(new Color(110,9,26));
            b1.setForeground(Color.red);
        }
        if(s.equals("Moto")){
            setBackground(new Color(78,32,12));
            b2.setForeground(Color.green);
        }
        if(s.equals("Iphone")){
            setBackground(new Color(32,11,92));
            b3.setForeground(Color.blue);
        }
        if(s.equals("Exit")){
            dispose();
            System.exit(0);
        }

    }
    public static void main(String args[]){
        new buttondemo();
    }
    
}