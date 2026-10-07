import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
class Login extends Frame implements TextListener
{
Label l1,l2,l3;
TextField t1,t2,t3;

public Login()
{
setLayout(new GridLayout(5,4));
l1 = new Label("username");
l2 = new Label("Password");
l3 = new Label("Result");

t1 = new TextField(20);
t2 = new TextField(20);
t3 = new TextField(20);

t2.setEchoChar('*');
t3.setEditable(false);

t2.addTextListener(this);

add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);


setTitle("button events demo");
setVisible(true);
setSize(700,700);
}

public void textValueChanged(TextEvent e)
{
String s1 = t1.getText();
String s2 = t2.getText();
if(s1.equals("vce") && s2.equals("java"))
{
t3.setText("valid");
}
else{
t3.setText("invalid");
}
}   


public static void main(String [] a)
{
new Login();
}
}