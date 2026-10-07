import java.awt.*;
public class button2 extends Frame{
    public button2(){
        setLayout(new FlowLayout());
        int i;
        for(i=1; i<=20; i++){
            add(new Button("Login"+i));
        }
        setTitle("flow layout");  // setLayout(new Flowlayout(Flowlayout.LEFT));
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new button2();
    }
}