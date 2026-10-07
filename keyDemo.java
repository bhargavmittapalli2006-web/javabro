import java.awt.*;
import java.awt.event.*;
public class keyDemo extends Frame implements KeyListener {
    public keyDemo() {
        setTitle("Key events demo");
        setVisible(true);
        setSize(500, 500);
        setResizable(false);
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e) {
        //setBackground(Color.red);
    }
    public void keyReleased (KeyEvent e) {
       // setBackground(Color.green);
    }
    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();
        if (ch == 'r' || ch == 'R') {
            setBackground(Color.red);
        } else if (ch == 'g' || ch == 'G') {
            setBackground(Color.green);
        } else if (ch == 'b' || ch == 'B') {
            setBackground(Color.blue);
        }
        else if(ch=='e' || ch=='E'){
            dispose();
            System.exit(0); 

        }
    }
    public static void main(String args[]) {
        keyDemo k = new keyDemo();
    }
}