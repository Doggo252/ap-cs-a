import java.awt.Color;
import java.awt.Graphics;

//this class creates and moves one raindrop
public class Raindrop {

	//instance variables
	private int x, y;
	private Color blue;
	int[] xArray, yArray;

	//constructor to initialize instance variables and instantiate the arrays and color
	public Raindrop(int x, int y) {
		this.x = x;
		this.y = y;
		xArray = new int[3];
		yArray = new int[3];
		blue = new Color(0, 125, 255);
	}

	//draw a Raindrop
	public void drawRaindrop(Graphics g) {
		xArray[0] = x;
		xArray[1] = x + 5;
		xArray[2] = x + 10;

		yArray[0] = y + 5;
		yArray[1] = y - 10;
		yArray[2] = y + 5;

		g.setColor(blue);
		g.fillOval(x, y, 10, 15);
		g.fillPolygon(xArray, yArray, 3);
	}

	//move a raindrop down
	public void moveRaindrop(boolean raining){
		if (y > 605){
			if (raining){
				y = -10;
				x = (int)(Math.random() * (801));
			}
		}
		else{
			y += 7;
		}
	}
}