/*list is a component which allows user to select multiple options.it also generates item event must be handled by itemlistner and item ievent.
the methods getSlectedItems() and getSelectedIndexs to display the options and indexes selected by the user*/
import java.awt.*;
import java.awt.event.*;
public class ListDemo extends Frame implements ItemListener{
    List l;
    public ListDemo(){
        setLayout(new FlowLayout());
        l=new List(6,true);
        l.addItem("charminar");
        l.addItem("tank bund");
        l.addItem("secretariat");
        l.addItem("film city");
        l.addItem("airport");
        l.addItem("KRUPA REDDY BOYS HOSTEL");

        l.addItemListener(this);
        add(l);
        setTitle("list demo");
        setVisible(true);
        setSize(500,500);

    }
    public void itemStateChanged(ItemEvent e){
        repaint();
    }
    public void paint(Graphics g){
        String s[]=l.getSelectedItems();
        int n[]=l.getSelectedIndexes();
        int y=180,i;
        for (i = 0; i<n.length; i++,y+=20) {
            g.drawString("most happening places "+(n[i]+1)+":"+s[i],100,y);
            
        }
    }
    public static void main(String[] args) {
        new ListDemo();
    }

}
/*NOTE: the paint method is automatically called when it gets executed the repaint() internally calls update() which interns called paint(). as paint method
method cannot be called directly. the paint() will erase the previous components in container*/