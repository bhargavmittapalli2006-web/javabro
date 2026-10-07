/*JTable is the component which displays the data in two dimensional format that is in table.data in horizontal and columns in vertical 
the table can be resized and moved by the user. The JTable class is present in javax.swing package. JTable is sadded to the JScrollPane which
is used to make scrollable view of a component.it scrolls the content of the component.JTable is added to JScrollPane and intern JScrollPane is added 
to the conatiner */
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
//import javax.swing.JTable;
public class JTableDemo extends JFrame {
    Container c;
    JTable jt;
    JScrollPane jsp;
    public JTableDemo(){
        c=getContentPane();
        c.setLayout(new FlowLayout());
        String data[][]={{"1","abc","CSE","II","98.5"},{"2","xyz","ECE","III","98.5"},{"3","pqr","EEE","IV","98.5"},{"4","lmn","CSE","I","98.5"},{"5","stu","ECE","II","98.5"},{"1","abc","CSE","II","98.5"},{"2","xyz","ECE","III","98.5"},{"3","pqr","EEE","IV","98.5"},{"4","lmn","CSE","I","98.5"},{"5","stu","ECE","II","98.5"},{"1","abc","CSE","II","98.5"},{"2","xyz","ECE","III","98.5"},{"3","pqr","EEE","IV","98.5"},{"4","lmn","CSE","I","98.5"},{"5","stu","ECE","II","98.5"},{"1","abc","CSE","II","98.5"},{"2","xyz","ECE","III","98.5"},{"3","pqr","EEE","IV","98.5"},{"4","lmn","CSE","I","98.5"},{"5","stu","ECE","II","98.5"},{"1","abc","CSE","II","98.5"},{"2","xyz","ECE","III","98.5"},{"3","pqr","EEE","IV","98.5"},{"4","lmn","CSE","I","98.5"},{"5","stu","ECE","II","98.5"},{"1","abc","CSE","II","98.5"},{"2","xyz","ECE","III","98.5"},{"3","pqr","EEE","IV","98.5"},{"4","lmn","CSE","I","98.5"},{"5","stu","ECE","II","98.5"},{"1","abc","CSE","II","98.5"},{"2","xyz","ECE","III","98.5"},{"3","pqr","EEE","IV","98.5"},{"4","lmn","CSE","I","98.5"},{"5","stu","ECE","II","98.5"},{"1","abc","CSE","II","98.5"},{"2","xyz","ECE","III","98.5"},{"3","pqr","EEE","IV","98.5"},{"4","lmn","CSE","I","98.5"},{"5","stu","ECE","II","98.5"},{"1","abc","CSE","II","98.5"},{"2","xyz","ECE","III","98.5"},{"3","pqr","EEE","IV","98.5"},{"4","lmn","CSE","I","98.5"},{"5","stu","ECE","II","98.5"},{"1","abc","CSE","II","98.5"},{"2","xyz","ECE","III","98.5"},{"3","pqr","EEE","IV","98.5"},{"4","lmn","CSE","I","98.5"},{"5","stu","ECE","II","98.5"}};
        String col[]={"S.No","Name","Branch","Semester","Percentage"};
        jt=new JTable(data,col);
        jsp=new JScrollPane(jt);
        c.add(jsp);
        setSize(500,500);
        setVisible(true);
        setTitle("asdfghjk");
    }
    public static void main(String[] args) {
        new JTableDemo();   
    }
}
