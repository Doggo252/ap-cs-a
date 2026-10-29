import java.awt.Color;
import java.awt.Graphics;

public class Triangle {
    // Instance Variables
    private int x, y;
    private int[] xArray, yArray;
    private Color purple;

    // Constructor
    public Triangle(int x, int y) {

}

    // Draw a Triangle
    public void drawTriangle(Graphics g) {
        // set the color
        g.setColor(purple);
        

        // Set up the coordinate arrays
        xArray[0] = x;
        xArray[1] = x - 50;
        xArray[2] = x + 50;
        yArray[0] = y;
        yArray[1] = y + 100;
        yArray[2] = y + 100;
        // Draw the triangle
        g.fillPolygon(xArray, yArray, 3);
    }


    // Move a Triangle
    public void moveRight() {

    }

}
