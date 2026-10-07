//wajp to demonstrate choice and list components
/* choice displays a drop down menu ,which allows user to select only one item.it generates item event must be hanled by item listner 
.the methods getSelectedItem() and getSlectedIndexes() can be used to retrive user selection*/
import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo extends Frame implements ItemListener{
    Choice v;
    TextField t;
    public ChoiceDemo(){
        setLayout(new FlowLayout());
        v=new Choice();
        t=new TextField(50);
        v.addItem("JAVA");
        v.addItem("PYTHON");
        v.addItem("C++");
        v.addItem("RUBY");
        v.addItem("Dot.Net");
        v.addItemListener(this);
        add(v);
        add(t);
        setTitle("choice demo");
        setVisible(true);
        setSize(500,500);

    }
    public void itemStateChanged(ItemEvent e){
        String s=v.getSelectedItem();
        int x=v.getSelectedIndex();
        t.setText("i you love selected language it s.no"+(x+1)+"which is "+s);
    }
    public static void main(String[] args) {
        new ChoiceDemo();
    }

    
}