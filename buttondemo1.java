import java.awt.*;
import java.awt.event.*;

public class buttondemo1 extends Frame implements ActionListener {

    Button b1, b2, b3, b4;

    public buttondemo1() {

        setLayout(new FlowLayout());

        b1 = new Button("Nokia");
        b2 = new Button("Moto");
        b3 = new Button("Iphone");
        b4 = new Button("Exit");

        // Initially disable Moto and Iphone
        b2.setEnabled(false);
        b3.setEnabled(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setTitle("Button Event Demo");
        setSize(500, 500);
        setResizable(false);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if (s.equals("Nokia")) {
            b2.setEnabled(true);
        }

        if (s.equals("Moto")) {
            b3.setEnabled(true);
        }

        if (s.equals("Iphone")) {
            b2.setEnabled(true);
        }

        if (s.equals("Exit")) {
            dispose();
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new buttondemo1();
    }
}