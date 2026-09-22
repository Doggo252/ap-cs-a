// The following 4 imports allow you to draw on a JPanel
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class Scenery extends JPanel {
	
	public Scenery() {
        setFocusable(true); // make sure focus is in this JPanel. This will become more important when we start using buttons.
        setLayout(null);    // setting to null allows you to control the layout of the JPanel.
        
        // add any initialization code to the constructor

		
	}

	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);  // max size 1920 (width) by 1080 (height)
	}


        /* Call all of your drawing methods from paintComponent(Graphics). You must pass the Graphics reference variable, g, to your
           draw methods. */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);   // DO NOT REMOVE THIS LINE

		// Create a method for each item that you draw
		drawSomething(g);

	}

        // Make methods that are just called from within this class private
	private void drawSomething(Graphics g) {
		// need the graphics object to invoke the draw methods
	}
}
