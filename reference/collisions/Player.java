import java.awt.Color;
import java.awt.Graphics;

public class Player {

	// location of the player and colors
	private int x, y;
	private Color orange;
	private Color green;

	public Player(int x, int y) {
		// set up instance variables
		this.x = x;
		this.y = y;
		orange = new Color(255, 165, 0);
		green = new Color(0, 255, 0);

	}

	// draw the player
	public void draw(Graphics g) {
		g.setColor(orange);
		g.fillOval(x, y, 50, 50);
		g.setColor(green);
		g.fillRect(x - 5, y + 50, 60, 70);
	}

	// move the player up
	public void moveUp() {
		if (y > 0) {
			y -= 10;
		}

	}

	// move the player down
	public void moveDown() {
		if (y + 120 < 600) {
			y += 10;
		}
	}

	// move the player left
	public void moveLeft() {
		if (x - 5 > 0) {
			x -= 10;
		}
	}

	// move the player right
	public void moveRight() {
		if (x + 55 < 800) {
			x += 10;
		}
	}

	//check to see if the player collided with the rock obstacle
	public void checkCollision(Obstacle o){
		int oX = o.getX();
		int oY = o.getY();
		int oWidth = o.getWidth();
		int oHeight = o.getHeight();

		//based on how the player is drawn
		int pX = x-5;
		int pY = y;
		int pWidth = 60;
		int pHeight = 120;

		//huge boolean statement (check for collision)
		if ((pX + pWidth >= oX) && (pX <= oX + oWidth) && (pY + pHeight >= oY) && (pY <= oY + oHeight)){
			//we hit something!
			System.out.println("Collision!");
		}
	}

}
