import java.awt.*;

public class Tree{
    Color crown, shade, trunk;
    int x,y;
    double scale;

    public Tree(int x, int y, double scale){
        crown = new Color(60, 160, 70);
        shade = new Color(40, 125, 55);
        trunk = new Color(110, 70, 40);
        this.x = x;
        this.y = y;
        this.scale = scale;
    }

    public void drawTree(Graphics g) {
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

    // draw a rect given coordinates, dimensions, and color
	private void drawRect(Graphics g, int x, int y, int length, int width, Color color) {
		g.setColor(color); // set color
		g.fillRect(x, y, length, width); // draw the rect
	}

    // draw an oval given coordinates, dimensions, and color
	private void drawOval(Graphics g, int x, int y, int width, int height, Color color) {
		g.setColor(color); // set color
		g.fillOval(x, y, width, height); // draw the oval
	}

}