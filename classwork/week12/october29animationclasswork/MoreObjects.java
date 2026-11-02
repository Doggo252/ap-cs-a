//imports
import javax.swing.*;
import java.awt.*;

public class MoreObjects extends JPanel {
	// instance variables
	private Color black, white;
    private Cloud cloud1, cloud2;
    private Sun sun;
    private Bunny bunny;

	public MoreObjects() {
		// makes sure focus is in this JPanel
		setFocusable(true);
		// setting to null allows you to control the layout of the JPanel
		setLayout(null);

		// two uniform colors
		black = new Color(0, 0, 0);
		white = new Color(255, 255, 255);
        cloud1 = new Cloud(1, 100, 100);
        cloud2 = new Cloud(0.67, 450, 125);
        sun = new Sun();
        bunny = new Bunny(1, 350, 500);
	}

	@Override
	public Dimension getPreferredSize() {
		// Sets the size of the panel
		return new Dimension(800, 600); // max size 1920 (width) by 1080 (height)
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g; // 2d graphics for lines (cast graphics to g2d)
		// Create a method for each item that you draw
		drawBackground(g, g2d); // draws background for each scene
        // trees
		for (int x=350; x <= 0; x+=70){
			drawTree(g, x, 350, new Color(60, 160, 70), new Color(40, 125, 55), new Color(110, 70, 40), 0.5);
		}
        // grass
        drawGrass(g2d, new Color(60, 140, 55));
        // path
        drawQuad(g, 250, 450, 300, 450, 350, 600, 200, 600, new Color(215, 190, 140));
        drawFlower(g, 50, 525, new Color(255, 105, 180), new Color(255, 220, 0), 1.5);
        drawFlower(g, 150, 525, new Color(255, 105, 180), new Color(255, 220, 0), 1.5);
        drawFlower(g, 100, 525, new Color(150, 90, 200), new Color(255, 220, 0), 1.5);
        drawFlower(g, 425, 525, new Color(150, 90, 200), new Color(255, 220, 0), 1.5);
        drawButterfly(g, g2d, 100, 475, 0.75);
        bunny.drawBunny(g);
        // house
        drawHouse(g, g2d);
	}

	private void drawBackground(Graphics g, Graphics2D g2d) {
		// sky
        drawRect(g, 0, 0, 800, 400, new Color(135, 206, 235));
        //draw sun ---------
        sun.drawSun(g, g2d);
        // clouds
        cloud1.drawCloud(g);
        cloud2.drawCloud(g);
        // far hill right
        drawOval(g, 250, 290, 800, 400, new Color(120, 190, 110));
        // far hill left
        drawOval(g, -250, 300, 800, 400, new Color(120, 190, 110));
        // close hill
        drawOval(g, 0, 315, 850, 450, new Color(95, 170, 85));
		// ground
		drawRect(g, 0, 400, 800, 200, new Color(100, 185, 80));
	}

	// draw an oval given coordinates, dimensions, and color
	private void drawOval(Graphics g, int x, int y, int width, int height, Color color) {
		g.setColor(color); // set color
		g.fillOval(x, y, width, height); // draw the oval
	}

	// draw a rect given coordinates, dimensions, and color
	private void drawRect(Graphics g, int x, int y, int length, int width, Color color) {
		g.setColor(color); // set color
		g.fillRect(x, y, length, width); // draw the rect
	}

	// uses graphics2D to draw a line - since Graphics doesn't have this. It takes
	// the width of the line, end points, and color
	private void drawLine(Graphics2D g2d, int width, int x1, int y1, int x2, int y2, Color color) {
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // smooth diagonal lines
		g2d.setStroke(new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)); // thickness set to width, rect like edges, chained lines
		g2d.setColor(color); // set color
		g2d.drawLine(x1, y1, x2, y2); // draw the line
	}

	// writes text (using graphics2d), given location, text, font/size, and color
	private void writeText(Graphics2D g2d, int x, int y, String text, String fontName, int fontSize, Color color) {
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); // smooth text
		g2d.setFont(new Font(fontName, Font.BOLD, fontSize));
		g2d.setColor(color);
		g2d.drawString(text, x, y);
	}

	// draws a cloud given the scale and position
	private void drawCloud(Graphics g, double scale, int x, int y) {
		// middle rect
		drawRect(g, x, y, (int) (55 * scale), (int) (35 * scale), white);
		// left circle
		drawOval(g, (int) (x - (25 * scale)), y, (int) (50 * scale), (int) (35 * scale), white);
		/// right circle
		drawOval(g, (int) (x + (30) * scale), (int) (y - (10 * scale)), (int) (60 * scale), (int) (45 * scale), white);
		// top circle
		drawOval(g, x, (int) (y - (15 * scale)), (int) (40 * scale), (int) (35 * scale), white);
	}

	// draws a tree given position, colors, and scale
	private void drawTree(Graphics g, int x, int y, Color crown, Color shade, Color trunk, double scale) {
		// trunk
		drawRect(g, (int) (x + (42 * scale)), (int) (y + (100 * scale)), (int) (21 * scale), (int) (100 * scale),
				trunk);
		// left shade
		drawOval(g, (int) (x - (5 * scale)), (int) (y + (45 * scale)), (int) (67 * scale), (int) (67 * scale), shade);
		// right shade
		drawOval(g, (int) (x + (42 * scale)), (int) (y + (45 * scale)), (int) (67 * scale), (int) (67 * scale), shade);
		// top crown
		drawOval(g, (int) (x + (10 * scale)), y, (int) (86 * scale), (int) (86 * scale), crown);
		// left crown
		drawOval(g, x, (int) (y + (50 * scale)), (int) (57 * scale), (int) (57 * scale), crown);
		// right crown
		drawOval(g, (int) (x + (47 * scale)), (int) (y + (50 * scale)), (int) (57 * scale), (int) (57 * scale), crown);
	}


	// draws grass at the bottom of the screen given color
	private void drawGrass(Graphics2D g2d, Color color) {
		// down blade
		for (int i = 0; i <= 800; i += 10) {
			drawLine(g2d, 2, i, 580, i + 5, 600, color);
		}
		// up blade
		for (int i = 5; i <= 800; i += 10) {
			drawLine(g2d, 2, i, 600, i + 5, 583, color);
		}
	}

	// draws a window given position and scale
	private void drawWindow(Graphics g, int x, int y, double scale, Color glassColor) {
		// white bg
		drawRect(g, x, y, (int) (51 * scale), (int) (51 * scale), white);
		// top left
		drawRect(g, (int) (x + (4 * scale)), (int) (y + (4 * scale)), (int) (20 * scale), (int) (20 * scale),
				glassColor);
		// top right
		drawRect(g, (int) (x + (27 * scale)), (int) (y + (4 * scale)), (int) (20 * scale), (int) (20 * scale),
				glassColor);
		// bottom left
		drawRect(g, (int) (x + (4 * scale)), (int) (y + (27 * scale)), (int) (20 * scale), (int) (20 * scale),
				glassColor);
		// bottom right
		drawRect(g, (int) (x + (27 * scale)), (int) (y + (27 * scale)), (int) (20 * scale), (int) (20 * scale),
				glassColor);
	}

	// draws a triangle given 3 points and color
	private void drawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, Color color) {
		int[] xArray = new int[3];
		int[] yArray = new int[3];
		xArray[0] = x1;
		xArray[1] = x2;
		xArray[2] = x3;
		yArray[0] = y1;
		yArray[1] = y2;
		yArray[2] = y3;
		g.setColor(color);
		g.fillPolygon(xArray, yArray, 3);
	}

	// draw a quadrilateral given 4 points and color
	private void drawQuad(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, Color color) {
		int[] xArray = new int[4];
		int[] yArray = new int[4];
		xArray[0] = x1;
		xArray[1] = x2;
		xArray[2] = x3;
		xArray[3] = x4;
		yArray[0] = y1;
		yArray[1] = y2;
		yArray[2] = y3;
		yArray[3] = y4;
		g.setColor(color);
		g.fillPolygon(xArray, yArray, 4);
	}

	// quad outline
	private void outlineQuad(Graphics2D g2d, int thickness, int x1, int y1, int x2, int y2, int x3, int y3, int x4,
			int y4, Color color) {
		int[] xArray = new int[4];
		int[] yArray = new int[4];
		xArray[0] = x1;
		xArray[1] = x2;
		xArray[2] = x3;
		xArray[3] = x4;
		yArray[0] = y1;
		yArray[1] = y2;
		yArray[2] = y3;
		yArray[3] = y4;
		g2d.setColor(color);
		g2d.setStroke(new BasicStroke(thickness));
		g2d.drawPolygon(xArray, yArray, 4);
	}

	// draw a house (no params)
	private void drawHouse(Graphics g, Graphics2D g2d) {
		// house rect
		drawRect(g, 100, 280, 200, 130, new Color(245, 222, 179));
		// door
		drawRect(g, 175, 330, 50, 80, new Color(139, 69, 19));
		// doorknob
		drawOval(g, 215, 367, 5, 5, new Color(255, 215, 0));
		// windows
		drawWindow(g, 115, 295, 0.8, new Color(173, 216, 230));
		drawWindow(g, 240, 325, 0.8, new Color(173, 216, 230));
		// chimney
		drawRect(g, 250, 200, 25, 50, new Color(160, 82, 45));
		// roof
		drawTriangle(g, 75, 280, 325, 280, 200, 200, new Color(178, 34, 34));
		// name
		writeText(g2d, 160, 305, "Johnny Appleseed", "SansSerif", 12, black);
	}

	// draw a flower given position, colors, and scale
	private void drawFlower(Graphics g, int x, int y, Color petals, Color core, double scale) {
		Color stem = new Color(40, 120, 40);
		drawRect(g, (int) (x + (12 * scale)), (int) (y + (20 * scale)), (int) (3 * scale), (int) (20 * scale), stem);
		drawOval(g, (int) (x + (6 * scale)), y, (int) (14 * scale), (int) (14 * scale), petals);
		drawOval(g, (int) (x + (6 * scale)), (int) (y + (10 * scale)), (int) (14 * scale), (int) (14 * scale), petals);
		drawOval(g, x, (int) (y + (5 * scale)), (int) (14 * scale), (int) (14 * scale), petals);
		drawOval(g, (int) (x + (12 * scale)), (int) (y + (5 * scale)), (int) (14 * scale), (int) (14 * scale), petals);
		drawOval(g, (int) (x + (8 * scale)), (int) (y + (7 * scale)), (int) (10 * scale), (int) (10 * scale), core);
	}

	// draw a butterfly given its position and scale
	private void drawButterfly(Graphics g, Graphics2D g2d, int x, int y, double scale) {
		// body
		drawOval(g, (int) (x + (25 * scale)), (int) (y + (10 * scale)), (int) (5 * scale), (int) (30 * scale), black);
		// left orange wing
		drawOval(g, x, y, (int) (25 * scale), (int) (25 * scale), new Color(255, 150, 40));
		// right orange wing
		drawOval(g, (int) (x + (30 * scale)), y, (int) (25 * scale), (int) (25 * scale), new Color(255, 150, 40));
		// left yellow wing
		drawOval(g, (int) (x + (8 * scale)), (int) (y + (23 * scale)), (int) (17 * scale), (int) (17 * scale),
				new Color(255, 210, 60));
		// right yellow wing
		drawOval(g, (int) (x + (30 * scale)), (int) (y + (23 * scale)), (int) (17 * scale), (int) (17 * scale),
				new Color(255, 210, 60));
		// antennae
		drawLine(g2d, (int) (2 * scale), (int) (x + (27 * scale)), (int) (y + (10 * scale)), (int) (x + (20 * scale)),
				(int) (y - (2 * scale)), black);
		drawLine(g2d, (int) (2 * scale), (int) (x + (27 * scale)), (int) (y + (10 * scale)), (int) (x + (34 * scale)),
				(int) (y - (2 * scale)), black);
	}

	// draw a bunny given its position and scale
	private void drawBunny(Graphics g, int x, int y, double scale) {
		Color bunny = new Color(175, 155, 135);
		// body
		drawOval(g, x, y + 30, 50, 30, bunny);
		// head
		drawOval(g, x + 38, y + 12, 30, 30, bunny);
		// eye
		drawOval(g, x + 58, y + 22, 5, 5, black);
		// right ear
		drawOval(g, x + 58, y - 10, 8, 30, bunny);
		// left ear
		drawOval(g, x + 45, y - 10, 8, 30, bunny);
	}

    public void animate(){
        while(true){
            try {
                Thread.sleep(50);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            // Add the code that "moves" your objects here. 
            cloud1.moveRight();
            cloud2.moveRight();
            sun.moveDown();
            bunny.moveRight();
            
            /* Repaint the graphics drawn. You MUST have this in your code
              because each time an object is moved, the panel needs to 
              be updated. */
            repaint();
        }
    }
}

class Cloud{
    // Instance Variables
    private int x, y, startX, startY;
    private double scale;
    private int[] xArray, yArray;
    private Graphics g;
    private Color white;

    // Constructor
    public Cloud(double scale, int x, int y) {
        //assign and instantiate instance variables
        this.x = x;
        this.y = y;
        startX = 0;
        startY = 0;
        this.scale = scale;
		white = new Color(255, 255, 255);
    }

    // draw an oval given coordinates, dimensions, and color
	private void drawOval(Graphics g, int x, int y, int width, int height, Color color) {
		g.setColor(color); // set color
		g.fillOval(x, y, width, height); // draw the oval
	}

	// draw a rect given coordinates, dimensions, and color
	private void drawRect(Graphics g, int x, int y, int length, int width, Color color) {
		g.setColor(color); // set color
		g.fillRect(x, y, length, width); // draw the rect
	}

    public void drawCloud(Graphics g) {
		// middle rect
		drawRect(g, x, y, (int) (55 * scale), (int) (35 * scale), white);
		// left circle
		drawOval(g, (int) (x - (25 * scale)), y, (int) (50 * scale), (int) (35 * scale), white);
		/// right circle
		drawOval(g, (int) (x + (30) * scale), (int) (y - (10 * scale)), (int) (60 * scale), (int) (45 * scale), white);
		// top circle
		drawOval(g, x, (int) (y - (15 * scale)), (int) (40 * scale), (int) (35 * scale), white);
	}

    public void moveRight(){
        //condition for off screen
        if (x >= 800){
            x = startX;
        }
        else{
            //speed
            x += 5;
        }
    }
}

class Sun{
    // Instance Variables
    private int x, y, startX, startY;
    private int[] xArray, yArray;
    private Graphics g;

    // Constructor
    public Sun() {
        //assign and instantiate instance variables
        x = 650;
        y = 40;
        startX = 0;
        startY = 0;
    }

    // draw an oval given coordinates, dimensions, and color
	private void drawOval(Graphics g, int x, int y, int width, int height, Color color) {
		g.setColor(color); // set color
		g.fillOval(x, y, width, height); // draw the oval
	}

    private void drawLine(Graphics2D g2d, int width, int x1, int y1, int x2, int y2, Color color) {
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // smooth diagonal lines
		g2d.setStroke(new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)); // thickness set to width, rect like edges, chained lines
		g2d.setColor(color); // set color
		g2d.drawLine(x1, y1, x2, y2); // draw the line
	}

    public void drawSun(Graphics g, Graphics2D g2d) {
		// sun
        drawOval(g, x, y, 100, 100, new Color(255, 215, 60));
        // sun lines
        drawLine(g2d, 3, x-35, y+50, x-10, y+50, new Color(255, 215, 60)); // 9 o'clock
        drawLine(g2d, 3, x+110, y+50, x+135, y+50, new Color(255, 215, 60)); // 3 o'clock
        drawLine(g2d, 3, x+50, y-35, x+50, y-10, new Color(255, 215, 60)); // 12 o'clock
        drawLine(g2d, 3, x+50, y+110, x+50, y+135, new Color(255, 215, 60)); // 6 o'clock
        drawLine(g2d, 3, x+80, y-3, x+95, y-24, new Color(255, 215, 60)); // 1 o'clock
        drawLine(g2d, 3, x+100, y+20, x+123, y+8, new Color(255, 215, 60)); // 2 o'clock
        drawLine(g2d, 3, x+100, y+80, x+123, y+92, new Color(255, 215, 60)); // 4 o'clock
        drawLine(g2d, 3, x+80, y+103, x+95, y+124, new Color(255, 215, 60)); // 5 o'clock
        drawLine(g2d, 3, x+20, y-3, x+5, y-24, new Color(255, 215, 60)); // 11 o'clock
        drawLine(g2d, 3, x, y+20, x-23, y+8, new Color(255, 215, 60)); // 10 o'clock
        drawLine(g2d, 3, x, y+80, x-23, y+92, new Color(255, 215, 60)); // 8 o'clock
        drawLine(g2d, 3, x+20, y+103, x+5, y+124, new Color(255, 215, 60)); // 7 o'clock
	}

    public void moveDown(){
        //condition for off screen
        if (y >= 600){
            y = startY;
        }
        else{
            //speed
            y += 5;
        }
    }
}


class Bunny{
    // Instance Variables
    private int x, y, startX, startY;
    private double scale;
    private int[] xArray, yArray;
    private Graphics g;
    private Color black;

    // Constructor
    public Bunny(double scale, int x, int y) {
        //assign and instantiate instance variables
        this.x = x;
        this.y = y;
        startX = 0;
        startY = 0;
        this.scale = scale;
		black = new Color(0, 0, 0);
    }

    // draw an oval given coordinates, dimensions, and color
	private void drawOval(Graphics g, int x, int y, int width, int height, Color color) {
		g.setColor(color); // set color
		g.fillOval(x, y, width, height); // draw the oval
	}

	// draw a rect given coordinates, dimensions, and color
	private void drawRect(Graphics g, int x, int y, int length, int width, Color color) {
		g.setColor(color); // set color
		g.fillRect(x, y, length, width); // draw the rect
	}

    public void drawBunny(Graphics g) {
		Color bunny = new Color(175, 155, 135);
		// body
		drawOval(g, x, y + 30, 50, 30, bunny);
		// head
		drawOval(g, x + 38, y + 12, 30, 30, bunny);
		// eye
		drawOval(g, x + 58, y + 22, 5, 5, black);
		// right ear
		drawOval(g, x + 58, y - 10, 8, 30, bunny);
		// left ear
		drawOval(g, x + 45, y - 10, 8, 30, bunny);
	}

    public void moveRight(){
        //condition for off screen
        if (x >= 800){
            x = startX;
        }
        else{
            //speed
            x += 5;
        }
    }
}