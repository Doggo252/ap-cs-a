import javax.swing.JFrame;
import java.util.Scanner;

// Runner that can be used with JPanel Graphics
public class Runner {
    public static void main(String args[]) {
        // creates the frame object using the title passed in
        JFrame frame = new JFrame("Animation");
        // creates the JPanel object and adds it to the frame
        MoreObjects canvas = new MoreObjects();
        frame.add(canvas);
        // auto exit when clicking the x button on the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // resizes window
        frame.pack();
        // make it visible
        frame.setVisible(true);
        canvas.animate();
    }
}