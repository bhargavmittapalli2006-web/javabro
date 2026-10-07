import java.awt.*;
import java.awt.event.*;    
public class CBox extends Frame implements ItemListener{
    Checkbox c1,c2,c3,c4,c5;
    TextField t1;
    CheckboxGroup cbg;
    Label l1;
    public CBox(){
        setLayout(new FlowLayout());
        c1=new Checkbox("KTM");
        c2=new Checkbox("PULSAR");
        c3=new Checkbox("BULLET");
        cbg=new CheckboxGroup();
        //cb=new CheckboxGroup();
        c4=new Checkbox("ABS",cbg,false);
        c5=new Checkbox("DISC",cbg,false);
        l1=new Label("ENTER YOUR NAME");
        t1=new TextField(50);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this);
        add(l1);
        add(c4);
        add(c5);
        add(c1);
        add(c2);
        add(c3);
        add(t1);
        setTitle("Checkbox");
        setVisible(true);
        setSize(500,500);
    }
    public void itemStateChanged(ItemEvent e){
        String s="Selected";
        if(c4.getState()==true){
            s+=" ABS";
        }
        if(c5.getState()==true){
            s+=" DISC";
        }
        if(c1.getState()==true){
            s+=" KTM";
        }
        if(c2.getState()==true){
            s+=" PULSAR";
        }
        if(c3.getState()==true){
            s+=" BULLET";
        }
        t1.setText(s);
    }
    public static void main(String[] args) {
        new CBox();
    }
}