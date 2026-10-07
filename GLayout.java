import java.awt.*;
public class GLayout extends Frame{
    public GLayout(){
        setLayout(new GridLayout(4,5));
        int i;
        for(i=1; i<=20; i++){
            add(new Button("Login"+i));
        }
        setTitle("Grid layout");
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GLayout();
    }
}