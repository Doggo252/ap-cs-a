// The following 4 imports allow you to draw on a JPanel
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class Scenery extends JPanel {	
	//instance variables
	private String timeOfDay;
	private String season;
	private Color red, orange, yellow, green, blue, purple, grey, black, brown, white;

	public Scenery(String timeOfDay, String season) {
        setFocusable(true); // make sure focus is in this JPanel. This will become more important when we start using buttons.
        setLayout(null);    // setting to null allows you to control the layout of the JPanel.
        
        // add any initialization code to the constructor
		this.timeOfDay = timeOfDay;
		this.season = season;
		red = new Color(255,0,0);
		orange = new Color(255,165,0);
		yellow = new Color(255,255,0);
		green = new Color(60, 179, 113);
		blue = new Color(0,0,255);
		purple = new Color(128,0,128);
		grey = new Color(128,128,128);
		black = new Color(0,0,0);
		brown = new Color(150, 75, 0);
		white = new Color(255,255,255);
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
		drawBackground(g);

		if (season.equalsIgnoreCase("fall")){
			drawTree(g, 40, 200, new Color(235, 175, 40));
		}
		drawHouse(g);
		
		if (season.equalsIgnoreCase("fall")){
			drawTree(g, 600, 200, new Color(180, 40, 30));
			drawTree(g, 450, 350, new Color(215, 95, 30));
		}
		
		
	}

	private void drawBackground(Graphics g) { 
		if (timeOfDay.equalsIgnoreCase("day")){
			if (season.equalsIgnoreCase("spring")){
				g.setColor(new Color(152, 219, 249));
				g.fillRect(0,0, 800, 350);
				g.setColor(yellow);
				g.fillOval(-100, -100, 175, 175);
			}
			else if (season.equalsIgnoreCase("fall")){
				g.setColor(new Color(83, 145, 178));
				g.fillRect(0,0, 800, 350);
				g.setColor(new Color(90, 155, 185));
				g.fillRect(0,120, 800, 350);
				g.setColor(new Color(107, 171, 199));
				g.fillRect(0,240, 800, 350);
				g.setColor(new Color(135, 90, 50));
				g.fillRect(0,350, 800, 250);
			}
			else{
				g.setColor(new Color(186, 222, 241));
				g.fillRect(0,0, 800, 350);
				g.setColor(yellow);
				g.fillOval(-100, -100, 175, 175);
			}
			
		} else{
			if (season.equalsIgnoreCase("spring")){
				g.setColor(new Color(22, 29, 59));
				g.fillRect(0,0, 800, 350);
				g.setColor(new Color(246, 241, 213));
				g.fillOval(-100, -100, 175, 175);
			}
			else if (season.equalsIgnoreCase("fall")){
				g.setColor(new Color(13, 20, 39));
				g.fillRect(0,0, 800, 350);
				g.setColor(new Color(246, 241, 213));
				g.fillOval(-100, -100, 175, 175);
			}
			else{
				g.setColor(new Color(5, 10, 26));
				g.fillRect(0,0, 800, 350);
				g.setColor(new Color(246, 241, 213));
				g.fillOval(-100, -100, 175, 175);
			}
		}
		g.setColor(green);
		g.fillRect(0,350, 800, 250);
	}

	// draw an oval
    private void drawOval(Graphics g, int x, int y, int width, int height, Color color) {
		g.setColor(color);
		g.fillOval(x,y,width,height);
    }

	// draw an oval
    private void drawRect(Graphics g, int x, int y, int length, int width, Color color) {
		g.setColor(color);
		g.fillRect(x,y,length,width);
    }

	//draw a tree
	private void drawTree(Graphics g, int x, int y, Color leaves){
		Color green = new Color(0, 128, 0);
		g.setColor(new Color(85, 50, 30));
		g.fillRect((x+25), (y+65), 25, 100);
		g.setColor(leaves);
		g.fillOval(x-25, y-25, 125, 125);
		
	}

	//draw a triangle
    private void drawTriangle(Graphics g, int x, int y, Color color) {
        // We need 2 arrays to hold the 3 vertices (x, y)
        int[] xArray = new int[3];
        int[] yArray = new int[3];


        // Set up the coordinates of the vertices
        xArray[0] = x;
        xArray[1] = x-100;
        xArray[2] = x+100;
        yArray[0] = y;
        yArray[1] = y+80;
        yArray[2] = y+80;
        // Set a color to draw the polygon
        g.setColor(color);
        // Use drawPolygon to draw the triangle
        g.fillPolygon(xArray, yArray, 3);
    }


	private void drawHouse(Graphics g){
		drawTriangle(g, 200, 200, white);
		drawRect(g, 100, 280, 200, 130, white);
		drawRect(g, 100, 410, 200, 7, new Color(117, 72, 53));
		drawRect(g, 150, 330, 50, 80, new Color(150, 95, 68));
		drawRect(g, 155, 335, 18, 14, new Color(118, 75, 54));
		drawRect(g, 177, 335, 18, 14, new Color(118, 75, 54));
		drawRect(g, 155, 354, 18, 14, new Color(118, 75, 54));
		drawRect(g, 177, 354, 18, 14, new Color(118, 75, 54));
		drawRect(g, 155, 373, 18, 14, new Color(118, 75, 54));
		drawRect(g, 177, 373, 18, 14, new Color(118, 75, 54));
		drawRect(g, 155, 392, 18, 15, new Color(118, 75, 54));
		drawRect(g, 177, 392, 18, 15, new Color(118, 75, 54));
		drawOval(g, 190, 367, 5, 5, new Color(217, 120, 83));
	}
}
