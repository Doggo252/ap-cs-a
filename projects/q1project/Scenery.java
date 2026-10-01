// The following 4 imports allow you to draw on a JPanel
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Scenery extends JPanel {	
	//instance variables
	private String timeOfDay;
	private String season;
	private Color black, white;
	

	public Scenery(JFrame frame, String timeOfDay, String season) {
        setFocusable(true); // make sure focus is in this JPanel. This will become more important when we start using buttons.
        setLayout(null);    // setting to null allows you to control the layout of the JPanel.
        
        // add any initialization code to the constructor
		this.timeOfDay = timeOfDay;
		this.season = season;
		black = new Color(0,0,0);
		white = new Color(255,255,255);

		//mouse coordinates
		addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseMoved(MouseEvent e) {
            // Update the window title with the live X and Y coordinates
            frame.setTitle("Current Coordinates -> X: " + e.getX() + ", Y: " + e.getY());
        }
    	});
	}
	

	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);  // max size 1920 (width) by 1080 (height)
	}


	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g; //2d graphics for lines

		// Create a method for each item that you draw
		drawBackground(g, g2d);

		if (timeOfDay.equalsIgnoreCase("day") && season.equalsIgnoreCase("spring")){
			//trees
			drawTree(g, 500, 250, new Color(60, 160, 70), new Color(40, 125, 55), new Color(110, 70, 40), 1.2);
			drawTree(g, 650, 275, new Color(60, 160, 70), new Color(40, 125, 55), new Color(110, 70, 40), 0.75);
			drawTree(g, 715, 385, new Color(60, 160, 70), new Color(40, 125, 55), new Color(110, 70, 40), 0.75);
			//grass
			drawGrass(g2d, new Color(60, 140,55));
			//path
			drawQuad(g, 250, 450, 300, 450, 350, 600, 200, 600, new Color(215, 190, 140));
			drawFlower(g, 50, 525, new Color(255, 105, 180), new Color(255, 220, 0), 1.5);
			drawFlower(g, 150, 525, new Color(255, 105, 180), new Color(255, 220, 0), 1.5);
			drawFlower(g, 100, 525, new Color(150, 90, 200), new Color(255, 220, 0), 1.5);
			drawFlower(g, 425, 525, new Color(150, 90, 200), new Color(255, 220, 0),1.5);
			drawButterfly(g, g2d, 100, 475, 0.75);
			drawBunny(g, 350, 500, 1);
			//house
			drawHouse(g, g2d);
		}
		else if (timeOfDay.equalsIgnoreCase("day") && season.equalsIgnoreCase("fall")){
			//fence
			drawRect(g, 0, 360, 800, 10, new Color(225, 205,170));
			drawRect(g, 0, 390, 800, 10, new Color(225, 205,170));
			//down thingies
			for (int i = 5; i<=810; i+=60){
				drawRect(g, i, 345, 10, 70, new Color(225, 205,170));
			}
			//trees
			drawTree(g, 380, 300, new Color(240, 130, 30), new Color(205, 85, 25), new Color(100, 65, 35), 0.8);
			drawTree(g, 480, 300, new Color(240, 130, 30), new Color(205, 85, 25), new Color(100, 65, 35), 1);
			drawTree(g, 680, 270, new Color(240, 130, 30), new Color(205, 85, 25), new Color(100, 65, 35), 1.1);
			//flowers
			drawFlower(g, 100, 520, new Color(255, 200, 0), new Color(100, 60, 20), 1.5);
			drawFlower(g, 500, 515, new Color(255, 200, 0), new Color(100, 60, 20), 1.5);
			drawFlower(g, 150, 520, new Color(200, 60, 90), new Color(100, 60, 20), 1.25);
			drawFlower(g, 550, 520, new Color(200, 60, 90), new Color(100, 60, 20), 1.25);
			//pumpkins
			drawPumpkin(g, 25, 550);
			drawPumpkin(g, 450, 550);
			//barn
			drawBarn(g, g2d, 75,200);
			//fox
			drawFox(g, 600, 450);
			//squirrel
			drawSquirrel(g, 350, 500);
		}
		else if (timeOfDay.equalsIgnoreCase("day") && season.equalsIgnoreCase("winter")){

		}
	}

	private void drawBackground(Graphics g, Graphics2D g2d) { 
		if (timeOfDay.equalsIgnoreCase("day")){
			if (season.equalsIgnoreCase("spring")){
				//sky
				drawRect(g, 0,0, 800, 400, new Color(135, 206, 235));
				//sun
				drawOval(g, 650, 40, 100, 100, new Color(255, 215, 60));
				//sun lines
				drawLine(g2d, 3, 615, 90, 640, 90, new Color(255, 215, 60)); //9 o'clock
				drawLine(g2d, 3, 760, 90, 785, 90, new Color(255, 215, 60)); //3 o'clock
				drawLine(g2d, 3, 700, 5, 700, 30, new Color(255, 215, 60)); //12 o'clock
				drawLine(g2d, 3, 700, 150, 700, 175, new Color(255, 215, 60)); //6 o'clock
				drawLine(g2d, 3, 730, 37, 745, 16, new Color(255, 215, 60)); //1 o'clock
				drawLine(g2d, 3, 750, 60, 773, 48, new Color(255, 215, 60)); //2 o'clock
				drawLine(g2d, 3, 750, 120, 773, 132, new Color(255, 215, 60)); //4 o'clock
				drawLine(g2d, 3, 730, 143, 745, 164, new Color(255, 215, 60)); //5 o'clock
				drawLine(g2d, 3, 670, 37, 655, 16, new Color(255, 215, 60)); //11 o'clock
				drawLine(g2d, 3, 650, 60, 627, 48, new Color(255, 215, 60)); //10 o'clock
				drawLine(g2d, 3, 650, 120, 627, 132, new Color(255, 215, 60)); //8 o'clock
				drawLine(g2d, 3, 670, 143, 655, 164, new Color(255, 215, 60)); //7 o'clock
				//far hill right
				drawOval(g, 250, 290, 800, 400, new Color(120,190,110));
				//far hill left
				drawOval(g, -250, 300, 800, 400, new Color(120, 190, 110));
				//close hill
				drawOval(g, 0, 315, 850, 450, new Color(95,170,85));
				//ground
				drawRect(g, 0,400, 800, 200, new Color(100, 185, 80));
				//clouds
				drawCloud(g2d, 1, 100, 100);
				drawCloud(g2d, 0.67, 450, 125);
			}
			else if (season.equalsIgnoreCase("fall")){
				//sky
				drawRect(g, 0, 0, 800, 350, new Color(135, 206, 235));
				//ground
				drawRect(g, 0, 350, 800, 250, new Color(150, 105, 65));
				//clouds
				drawCloud(g, 1, 300, 50);
				drawCloud(g, 0.75, 600, 100);
				//sun
				drawOval(g, 50, 50, 75, 75, new Color(255, 200, 70));
				//mountains
				drawTriangle(g, 200, 150, -20, 350, 420, 350, new Color(125, 135, 160));
				drawTriangle(g, 200, 150, 300, 350, 420, 350, new Color(100, 110, 135));
				drawTriangle(g, 200, 150, 153, 190, 247, 190, white);
				drawTriangle(g, 400, 150, 525, 350, 200, 350, new Color(125, 135, 160));
				drawTriangle(g, 400, 150, 525, 350, 600, 300, new Color(100, 110, 135));
				drawQuad(g, 400, 145, 355, 200, 390, 200, 435, 173, white);
				drawQuad(g, 435, 173, 415, 180, 430, 200, 455, 190, white);
				drawTriangle(g, 525, 350, 700, 200, 850, 350, new Color(125, 135, 160));
				drawQuad(g, 700, 200, 680, 220, 700, 230 ,720, 220, white);
			}
			else{ //winter
				g.setColor(new Color(186, 222, 241));
				g.fillRect(0,0, 800, 350);
				//g.setColor(yellow);
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
			else{ //winter
				g.setColor(new Color(5, 10, 26));
				g.fillRect(0,0, 800, 350);
				g.setColor(new Color(246, 241, 213));
				g.fillOval(-100, -100, 175, 175);
			}
		}
	}

	//draw an oval given coordinates, dimensions, and color
    private void drawOval(Graphics g, int x, int y, int width, int height, Color color) {
		g.setColor(color); //set color
		g.fillOval(x,y,width,height); //draw the oval
    }

	//draw a rect given coordinates, dimensions, and color
    private void drawRect(Graphics g, int x, int y, int length, int width, Color color) {
		g.setColor(color); //set color
		g.fillRect(x,y,length,width); //draw the rect
    }
	
	//uses graphics2D to draw a line - since Graphics doesn't have this. It takes the width of the line, end points, and color
	private void drawLine(Graphics2D g2d, int width, int x1, int y1, int x2, int y2, Color color){
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //smooth diagonal lines
		g2d.setStroke(new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)); //thickness 20, rect like edges, chained lines
		g2d.setColor(color); //set color
		g2d.drawLine(x1, y1, x2, y2); //draw the line
	}

	//writes text (using graphics2d), given location, text, font/size, and color
	private void writeText(Graphics2D g2d, int x, int y, String text, String fontName, int fontSize, Color color){
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); //smooth text
		g2d.setFont(new Font(fontName, Font.BOLD, fontSize));
		g2d.setColor(color);
		g2d.drawString(text, x, y);
	}

	//draws a cloud given the scale and position
	private void drawCloud(Graphics g, double scale, int x, int y){
		//middle rect
		drawRect(g, x, y, (int) (55 * scale), (int) (35 * scale), white);
		//left circle
		drawOval(g, (int) (x-(25 * scale)), y, (int) (50 * scale), (int) (35 * scale), white);
		///right circle
		drawOval(g, (int) (x+(30) * scale), (int) (y-(10 * scale)), (int) (60 * scale), (int) (45 * scale), white);
		//top circle
		drawOval(g, x, (int) (y-(15 * scale)), (int) (40 * scale), (int) (35 * scale), white);
	}

	//draws a tree given position, colors, and scale
	private void drawTree(Graphics g, int x, int y, Color crown, Color shade, Color trunk, double scale){
		//trunk
		drawRect(g, (int) (x+(42 * scale)), (int) (y+(100 * scale)), (int) (21 * scale), (int) (100 * scale), trunk);
		//left shade
		drawOval(g, (int) (x-(5 * scale)), (int) (y+(45 * scale)), (int) (67 * scale), (int) (67 * scale), shade);
		//right shade
		drawOval(g, (int) (x+(42 * scale)), (int) (y+(45 * scale)), (int) (67 * scale), (int) (67 * scale), shade);
		//top crown
		drawOval(g, (int) (x+(10 * scale)), y, (int) (86 * scale), (int) (86 * scale), crown);
		//left crown
		drawOval(g, x, (int) (y+(50 * scale)), (int) (57 * scale), (int) (57 * scale), crown);
		//right crown
		drawOval(g, (int) (x+(47 * scale)), (int) (y+(50 * scale)), (int) (57 * scale), (int) (57 * scale), crown);
	}

	//draws grass at the bottom of the screen given color
	private void drawGrass(Graphics2D g2d, Color color){
		//down blade
		for (int i = 0; i<=800; i+=10){
			drawLine(g2d, 2, i, 580, i+5, 600, color);
		}
		//up blade
		for (int i = 5; i<=800; i+=10){
			drawLine(g2d, 2, i, 600, i+5, 583, color);
		}
	}

	//draws a window given position and scale
	private void drawWindow(Graphics g, int x, int y, double scale, Color glassColor){
		//white bg
		drawRect(g, x, y, (int) (51 * scale), (int) (51 * scale), white);
		//top left
		drawRect(g, (int) (x+(4 * scale)), (int) (y+(4 * scale)), (int) (20 * scale), (int) (20 * scale), glassColor);
		//top right
		drawRect(g, (int) (x+(27 * scale)), (int) (y+(4 * scale)), (int) (20 * scale), (int) (20 * scale), glassColor);
		//bottom left
		drawRect(g, (int) (x+(4 * scale)), (int) (y+(27 * scale)), (int) (20 * scale), (int) (20 * scale), glassColor);
		//bottom right
		drawRect(g, (int) (x+(27 * scale)), (int) (y+(27 * scale)), (int) (20 * scale), (int) (20 * scale), glassColor);
	}

	//draws a triangle given 3 points and color
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

	//draw a quadrilateral given 4 points and color
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

	//quad outline
	private void outlineQuad(Graphics2D g2d, int thickness, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, Color color){
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

	//draw a house (no params)
	private void drawHouse(Graphics g, Graphics2D g2d){
		//house rect
		drawRect(g, 100, 280, 200, 130, new Color(245, 222, 179));
		//door
		drawRect(g, 175, 330, 50, 80, new Color(139, 69, 19));
		//doorknob
		drawOval(g, 215, 367, 5, 5, new Color(255, 215, 0));
		//windows
		drawWindow(g, 115, 295, 0.8, new Color(173, 216, 230));
		drawWindow(g, 240, 325, 0.8, new Color(173, 216, 230));
		//chimney
		drawRect(g, 250, 200, 25, 50, new Color(160, 82, 45));
		//roof
		drawTriangle(g, 75,280,325,280,200,200, new Color(178, 34, 34));
		//name
		writeText(g2d, 160, 305, "Johnny Appleseed", "SansSerif", 12, black);
	}

	//draw a flower given position, colors, and scale
	private void drawFlower(Graphics g, int x, int y, Color petals, Color core, double scale){
		Color stem = new Color(40, 120, 40);
		drawRect(g, (int) (x+(12 * scale)), (int) (y+(20 * scale)), (int) (3 * scale), (int) (20 * scale), stem);
		drawOval(g, (int) (x+(6 * scale)), y, (int) (14 * scale), (int) (14 * scale), petals);
		drawOval(g, (int) (x+(6 * scale)), (int) (y+(10 * scale)), (int) (14 * scale), (int) (14 * scale), petals);
		drawOval(g, x, (int) (y+(5 * scale)), (int) (14 * scale), (int) (14 * scale), petals);
		drawOval(g, (int) (x+(12 * scale)), (int) (y+(5 * scale)), (int) (14 * scale), (int) (14 * scale), petals);
		drawOval(g, (int) (x+(8 * scale)), (int) (y+(7 * scale)), (int) (10 * scale), (int) (10 * scale), core);
	}

	private void drawButterfly(Graphics g, Graphics2D g2d, int x, int y, double scale){
		//body
		drawOval(g, (int) (x+(25 * scale)), (int) (y+(10 * scale)), (int) (5 * scale), (int) (30 * scale), black);
		//left orange wing
		drawOval(g, x, y, (int) (25 * scale), (int) (25 * scale), new Color(255, 150, 40));
		//right orange wind
		drawOval(g, (int) (x+(30 * scale)), y, (int) (25 * scale), (int) (25 * scale), new Color(255, 150, 40));
		//left yellow wing
		drawOval(g, (int) (x+(8 * scale)), (int) (y+(23 * scale)), (int) (17 * scale), (int) (17 * scale), new Color(255, 210, 60));
		//right yellow wing
		drawOval(g, (int) (x+(30 * scale)), (int) (y+(23 * scale)), (int) (17 * scale), (int) (17 * scale), new Color(255, 210, 60));
		//antennae
		drawLine(g2d, (int) (2 * scale), (int) (x+(27 * scale)), (int) (y+(10 * scale)), (int) (x+(20 * scale)), (int) (y-(2 * scale)), black);
		drawLine(g2d, (int) (2 * scale), (int) (x+(27 * scale)), (int) (y+(10 * scale)), (int) (x+(34 * scale)), (int) (y-(2 * scale)), black);
	}

	private void drawBunny(Graphics g, int x, int y, double scale){
		Color bunny = new Color(175, 155, 135);
		//body
		drawOval(g, x, y+30, 50, 30, bunny);
		//head
		drawOval(g, x+38, y+12, 30, 30, bunny);
		//eye
		drawOval(g, x+58, y+22, 5, 5, black);
		//right ear
		drawOval(g, x+58, y-10, 8, 30, bunny);
		//left ear
		drawOval(g, x+45, y-10, 8, 30, bunny);
	}

	private void drawPumpkin(Graphics g, int x, int y){
		drawOval(g, x, y, 50, 40, new Color(240, 120, 20));
		drawRect(g, x+25, y, 2, 40, new Color(205, 85, 25));
		drawRect(g, x+23, y-10, 5, 10, new Color(80, 110, 40));
	}

	//draws the barn for fall season
	private void drawBarn(Graphics g, Graphics2D g2d, int x, int y){
		outlineQuad(g2d, 25, x, y+73, x+230, y+73, x+180, y+20, x+50, y+20, new Color(85, 35, 30));
		drawRect(g, x, y+75, 230, 180, new Color(170, 40, 40));
		drawQuad(g, x, y+73, x+230, y+73, x+180, y+20, x+50, y+20, new Color(170, 40, 40));
		drawRect(g, x, y+73, 230, 4, new Color(85, 35, 30));
		drawRect(g, x+115, y+150, 3, 105, white);
		drawRect(g, x+65, y+150, 5, 105, white);
		drawRect(g, x+165, y+150, 5, 105, white);
		drawRect(g, x+65, y+150, 100, 5, white);
		drawLine(g2d, 4, x+66, y+151, x+164, y+254, white);
		drawLine(g2d, 4, x+164, y+151, x+66, y+254, white);
		drawWindow(g, x+20, y+100, 0.8, new Color(60, 45, 40));
		drawWindow(g, x+170, y+100, 0.8, new Color(60, 45, 40));
		drawWindow(g, x+100, y+25, 0.8, new Color(60, 45, 40));
	}

	private void drawFox(Graphics g, int x, int y){
		Color fox = new Color(225, 110, 40);
		drawOval(g, x+5, y+5, 60, 30, fox);
		drawOval(g, x+52, y-12, 25, 25, fox);
		drawOval(g, x+65, y-5, 5, 5, black);
		drawTriangle(g, x+10, y+15, x-20, y, x-10, y+30, fox);
		drawTriangle(g, x-20, y, x-10, y+30, x-25, y+15, white);
		drawTriangle(g, x+72, y+8, x+86, y+4, x+72, y-4, fox);
		drawTriangle(g, x+72, y+8, x+86, y+4, x+72, y-4, fox);
		drawTriangle(g, x+58, y-7, x+58, y-22, x+64, y-11, fox);
		drawTriangle(g, x+72, y-7, x+72, y-22, x+66, y-11, fox);
	}

	private void drawSquirrel(Graphics g, int x, int y){
		//squirrel color
		Color squirrel = new Color(135, 135, 140);
		//tail
		drawOval(g, x+5, y, 35, 70, squirrel);
		//body
		drawOval(g, x+30, y+30, 40, 40, squirrel);
		//head
		drawOval(g, x+60, y+14, 30, 30, squirrel);
		//eye
		drawOval(g, x+78, y+21, 6,6, black);
		//head top thingy
		drawTriangle(g, x+65, y+22, x+81, y+19, x+70, y+4, squirrel);
	}
}