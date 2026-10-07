import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JText extends JFrame implements ActionListener{
    Container c;
    JTextArea jt;
    JButton b1;
    public JText(){
        c=getContentPane();
        setLayout(new FlowLayout());
        String s="coding is fun.\n it should be practiced by\n doing lot of solving problems in different coding platforms.\n yesterday java27 version was launched in quantum computing";
        jt=new JTextArea(s,10,30);
        jt.setBackground(Color.blue);
        b1=new JButton("Select");
        b1.addActionListener(this);
        add(jt);
        add(b1);
        setVisible(true);
        setSize(500,500);
        setTitle("text area");
    }
    public void actionPerformed(ActionEvent e){
        String a=jt.getSelectedText();
        JOptionPane.showMessageDialog(this, a,"Display the selected text",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        new JText();
    }
}