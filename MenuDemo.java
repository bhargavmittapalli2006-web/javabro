import java.awt.*;
import java.awt.event.*;
{
    public class MenuDemo extends Frame implements ActionListener{
        TextField t;
        public MenuDemo(){
            new TextArea();
            add(t);
            Menu m=new Menu();
            MenuBar mb=new MenuBar();
            MenuItem newItem=new MenuItem("New");
            MenuItem openItem=new MenuItem("Open");
            MenuItem saveItem=new MenuItem("Save");
            MenuItem exitItem=new MenuItem("Exit");
           
            mb.add(m);
            setMenuBar(mb);
             setTitle("menu");
            setSize(500,500);
            setVisible(true);
            setMenuBar(mb);
        }        
       
        public void actionPerformed(ActionEvent e){
            String s=e.getActionCommand();
            if(s.equals("New")){
                t.setText("new file created");
            }
            else if(s.equals("Open")){
                t.setText("file opened");
            }
            else if(s.equals("Save")){
                t.setText("file saved");
            }
            else if(s.equals("Exit")){
                System.exit(0);
            }
        }}
        public static void main(String[] args) {
            new MenuDemo();
        }
    
}