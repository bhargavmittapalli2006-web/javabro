//java program to demonstarte graphic class methods
import java.awt.*; 
public class GraphicsDemo extends Frame{
    public GraphicsDemo(){
        setSize(500,500);
        setVisible(true);
        setTitle("Graphics");
    }
    public void paint(Graphics g){
       g.setColor(Color.red);
       g.drawString("HELLO JAVA",100,100);// it belongs to graphics class.which takes 3 parameters string,x coordinate,y coordinate
       g.setColor(Color.yellow);
       g.drawLine(150, 150, 300, 300);// it belongs to graphics class.which takes 4 parameters x1,y1,x2,y2
       g.drawRect(210, 210, 200, 200);// it belongs to graphics class.which takes 4 parameters x,y,width,height
       g.fillRect(210, 210, 200, 200);// it belongs to graphics class.which takes 4 parameters x,y,width,height and fill the rectangle with color
       g.drawRoundRect(50, 50, 150, 150, 18, 18);
       g.fillRoundRect(50, 50, 150, 150, 18, 18);
       g.setColor(Color.blue);
       g.drawOval(50, 50, 150, 150);
       g.fillOval(300, 300, 150, 150);
        int x[]={130,70,110,118,119};
        int y[]={150,110,170,171,172};
        g.drawPolygon(x,y,5);
        g.fillPolygon(x, y, 5);

    }
    public static void main(String args[]){
        new GraphicsDemo();
        
    }
    
}