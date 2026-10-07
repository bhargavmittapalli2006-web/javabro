import java.awt.*;
public class Button1 extends Frame{
    Button b1;
    public Button1(){
        setLayout(null);
        b1=new Button("hello");
        b1.setBounds(100,100,100,50);
        add(b1);
        setSize(400,400);
        setVisible(true);
        setTitle("asdfghj");
        }
        public static void main(String[] args) {
            new Button1();
        }
}