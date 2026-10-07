import java.awt.*;
public class BLayout extends Frame{
    Button b1,b2,b3,b4,b5;
    public BLayout(){
        setLayout(new BorderLayout());
        b1=new Button("name");
        b2=new Button("email"); 
        b3=new Button("phone");
        b4=new Button("address");
        b5=new Button("roll no");
        add(b1,"North");
        add(b2,"South");
        add(b3,"East");
        add(b4,"West");
        add(b5,"Center");
        setTitle("Button layout");
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BLayout();
    }
}