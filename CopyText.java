//java program to demonstrate text area
import java.awt.*;
import java.awt.event.*;
public class CopyText extends Frame implements TextListener{
    TextArea t1,t2;
    Label l1,l2;
    public CopyText(){
        setLayout(new GridLayout(2,2));
        l1=new Label("original text");
        l2=new Label("copy text");
        t1=new TextArea(10,10);
        t2=new TextArea(10,10);
        t1.addTextListener(this);
        t2.addTextListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        setVisible(true);
        setSize(500,500);
        setTitle("copt text");
    }
    public void textValueChanged(TextEvent e){
        String s1=t1.getText();
        t2.setText(s1);
    }
    public static void main(String args[]){
        new CopyText();
    }
}