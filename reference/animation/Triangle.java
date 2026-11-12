import java.awt.Color;
import java.awt.Graphics;

public class Triangle {
    // Instance Variables
    private int x, y, startX, startY;
    private int[] xArray, yArray;
    private Color color;

    // Constructor
    public Triangle(int x, int y, Color color) {
        //assign and instantiate instance variables
        this.x = x;
        this.y = y;
        startX = x;
        startY = y;
        xArray = new int[3];
        yArray = new int[3];
        this.color = color;
    }

    // Draw a Triangle
    public void drawTriangle(Graphics g) {
        // set the color
        g.setColor(color);
        

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


    //move a triangle right
    public void moveRight() {
        //condition for off screen
        if (x >= 800){
            x = startX;
        }
        else{
            //speed
            x += 5;
        }
    }

    //move triangle down
    public void moveDown() {
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
