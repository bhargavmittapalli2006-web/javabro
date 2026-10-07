import java.awt.*;   
import java.awt.event.*;

public class MouseEvents extends Frame implements MouseListener,MouseMotionListener {  //frame class extended to create a frame,frame is a container which holds the component
    public MouseEvents() {
        setTitle("Mouse events demo");  //method of frame class to set the Title of a frame
        setVisible(true); 
        setSize(500, 500); //to create the size of the frame
        setResizable(false); 
        addMouseListener(this); //registration to that Mouselistner interface for getting notification
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON3){
            setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
        } 
        
        //setBackground(Color.magenta);     
    } 
   // or setBackground(new Color(0 ,0 ,0));  

    public void mouseEntered(MouseEvent e) {
        setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
        //setBackground(Color.blue);
    }

    public void mouseExited(MouseEvent e) {
        setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
        //setBackground(Color.cyan);
    }

    public void mouseReleased(MouseEvent e) {
        setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
        //setBackground(Color.red);
    }

    public void mousePressed(MouseEvent e) {
        setBackground(Color.black);
    }
    public void mouseDragged(MouseEvent e){
        setBackground(Color.yellow);
   }
   public void mouseMoved(MouseEvent e){
        setBackground(Color.green);
   }

    public static void main(String args[]) {
        MouseEvents m = new MouseEvents();
    }
    
    
}