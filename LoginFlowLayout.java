import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class LoginFlowLayout extends Frame implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1;
public LoginFlowLayout(){
setLayout( new FlowLayout(FlowLayout.LEFT));
l1= new Label("USERNAME");
l2= new Label("PASSWORD");
l3= new Label("RESULT");
t1 = new TextField(20);
t2 = new TextField(20);
t3 = new TextField(20);
b1 = new Button("Login");
t2.setEchoChar('@');
t3.setEditable(false);
b1.addActionListener(this);
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);
setTitle("Login Page");
setSize(1000,500);
setVisible(true);
}
public void actionPerformed(ActionEvent e )
{
String s = e.getActionCommand();
if(s.equals("Login"))
{
String s1 = t1.getText();
String s2 = t2.getText();
if(s1.equals("VCE") && s2.equals("JAVA"))
{
t3.setText("Valid");
}
else
{
t3.setText("Invalid");
}
}
}
public static void main(String ar[])
{
new LoginFlowLayout();
}
}