import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

//moves rectangle across screen, left to right
public class AnimateScreen extends JPanel {
    //instance variables
    Triangle tri1, tri2, tri3, tri4, tri5, tri6, tri7, tri8, tri9, tri10;

    // Constructor
    public AnimateScreen() {
       setFocusable(true);
       setLayout(null);
       
       //instantiate triangle objects
       tri1 = new Triangle(25, 40, new Color(255, 150, 150));
       tri2 = new Triangle(250, 140, new Color(255, 190, 140));
       tri3 = new Triangle(25, 240, new Color(255, 235, 150));
       tri4 = new Triangle(250, 340, new Color(170, 230, 160));
       tri5 = new Triangle(25, 440, new Color(150, 195, 255));
       tri6 = new Triangle(250, 140, new Color(200, 180, 240));
       tri7 = new Triangle(450, 140, new Color(150, 225, 225));
       tri8 = new Triangle(250, 340, new Color(255, 205, 175));
       tri9 = new Triangle(450, 340, new Color(210, 240, 150));
       tri10 = new Triangle(250, 540, new Color(170, 180, 250));
    }

    // Set the dimension of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}

    // Call methods that will draw on the JPanel
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        tri1.drawTriangle(g);
        tri2.drawTriangle(g);
        tri3.drawTriangle(g);
        tri4.drawTriangle(g);
        tri5.drawTriangle(g);
        tri6.drawTriangle(g);
        tri7.drawTriangle(g);
        tri8.drawTriangle(g);
        tri9.drawTriangle(g);
        tri10.drawTriangle(g);
	}
    
    /* This runs until you exit your JPanel. A try catch exception handler is needed in case
       an exception is thrown during the pause. Copy this code exactly as is. You will add calls to your methods 
       that move your objects. */
    public void animate(){
        while(true){
            //pause for .01 second
            try {
                Thread.sleep(10);    // 10 milliseconds
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            // Add the code that "moves" your objects here. 
           tri1.moveRight();
           tri2.moveDown();
           tri3.moveRight();
           tri4.moveDown();
           tri5.moveRight();
           tri6.moveRight();
           tri7.moveDown();
           tri8.moveRight();
           tri9.moveDown();
           tri10.moveRight();
            
            /* Repaint the graphics drawn. You MUST have this in your code
              because each time an object is moved, the panel needs to 
              be updated. */
            repaint();
        }
    }
}
