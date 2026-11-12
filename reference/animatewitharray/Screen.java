import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//this class creates and draws a rainy day scene on a JPanel
public class Screen extends JPanel implements KeyListener{
	
	//instance variables
	private Raindrop[] rain;
	private Tree[] trees;
	private boolean raining;

	//constructor that initializes a Screen object
	public Screen() {
		setLayout(null);
		setFocusable(true);
		addKeyListener(this);
		raining = true;

		//instantiate the Raindrop array
		rain = new Raindrop[200];
		for (int i = 0; i<rain.length; i++){
			rain[i] = new Raindrop((int)(Math.random() * (801)), (int)(Math.random() * (601)));
		}

		//instantiate the tree array
		trees = new Tree[10];
		int wide = 40;
		for (int i = 0; i<trees.length; i++){
			trees[i] = new Tree(wide, 350, 0.5);
			wide += 75;
		}
	}

	//JPanel method that sets the size of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//sets the size of the panel
		return new Dimension(800, 600);
	}

	//JPanel method that invokes methods that draw on the JPanel
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//sky
		drawRect(g, 0, 0, 800, 400, new Color(135, 206, 235));
		// ground
		drawRect(g, 0, 350, 800, 250, new Color(150, 105, 65));
		//trees
		drawForest(g);
		//draw the rain
		for (Raindrop each : rain){
			each.drawRaindrop(g);
		}
	}

	//method runs continuously to simulate object movement
	public void animate() {
		while (true) {
			//wait for .01 second
			try {
				Thread.sleep(10);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

			//add move methods here
			for (Raindrop each : rain){
				each.moveRaindrop(raining);
			}

			//repaint the graphics drawn
			repaint();
		}
	}

	@Override
	public void keyPressed(KeyEvent e){
		if (e.getKeyCode() == 32){ //space bar
			raining = !raining;
			if (raining){
				for (int i = 0; i<rain.length; i++){
					rain[i] = new Raindrop((int)(Math.random() * (801)), (int)(Math.random() * (601)- 700));
				}
			}
		}
	}

	// draw a rect given coordinates, dimensions, and color
	private void drawRect(Graphics g, int x, int y, int length, int width, Color color) {
		g.setColor(color); // set color
		g.fillRect(x, y, length, width); // draw the rect
	}

	private void drawForest(Graphics g){
		for (Tree each : trees){
			each.drawTree(g);
		}
	}

	@Override 
	public void keyReleased(KeyEvent e){}
	@Override 
	public void keyTyped(KeyEvent e){}
}