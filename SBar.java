import java.awt.*;
import java.awt.event.*;
public class SBar extends Frame implements AdjustmentListener{
    Scrollbar b1,b2,b3;
    public SBar(){
        setLayout(new BorderLayout());
        b1 = new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
        b2 = new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
        b3 = new Scrollbar(Scrollbar.HORIZONTAL,10,10,15,255);
        add(b1,"East");
        add(b3,"West");
        add(b3,"South");
        b1.addAdjustmentListener(this);
        b2.addAdjustmentListener(this);
        b3.addAdjustmentListener(this);
        setTitle("scroll bar");
        setVisible(true);
        setSize(500,500);
        b1.setUnitIncrement(10);
        b2.setBlockIncrement(30);
    }
    public void adjustmentValueChanged(AdjustmentEvent e){
        int x = b1.getValue();
        int y = b2.getValue();
        int z =  b3.getValue();
        Color c = new Color(x,y,z);
        setBackground(c);
    }
    public static void main(String[] args) {
        SBar s = new SBar();
    }
}
/* scrollbar scrolls through a range of values.it generates an adjustment event and must be handled by implementing
    the AdjustmentListener interface. The adjustmentValueChanged() method is called when the scrollbar is adjusted.
     The getValue() method returns the current value of the scrollbar. The setBackground() method sets the background color of the frame based on the scrollbar values. */
    the constructor od scrollbar takes five parameters are Allignment((HORIZONTAL OR VERTICAL)), initial value TO BE SET, size of scroll bar
    , minimum value, and maximum value.The setUnitIncrement() method sets the amount by which the scrollbar value changes when the
     user clicks on the arrow buttons. The setBlockIncrement() method sets the amount by which the scrollbar value changes when 
     the user clicks in the track area of the scrollbar.*/