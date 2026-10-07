import javax.swing.JFrame;
import java.util.Scanner;

// Runner that can be used with JPanel Graphics
public class Runner {
    private static void createWindow(String name, String timeOfDay, String season) {
        // creates the frame object using the title passed in
        JFrame frame = new JFrame(name);
        // creates the JPanel object and adds it to the frame
        Scenery canvas = new Scenery(timeOfDay, season);
        frame.add(canvas);
        // auto exit when clicking the x button on the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // resizes window
        frame.pack();
        // make it visible
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        // colors
        String bold = "\u001B[1m";
        String reset = "\u001B[0m";
        String gold = "\u001B[33m";
        String red = "\u001B[31m";
        String grey = "\u001B[90m";
        String cyan = "\u001B[36m";
        String mint = "\u001B[38;2;123;203;131m";

        // ask the user for time of day and season
        Scanner sc = new Scanner(System.in);
        System.out.print(reset + cyan + bold + "Welcome to my scenery picture." + reset + mint
                + "\nWould you like a day or night scene?: " + reset + grey);
        String timeOfDay = sc.next();

        // check for bad input on time of day
        if (!timeOfDay.equalsIgnoreCase("day") && !timeOfDay.equalsIgnoreCase("night")) {
            System.out.println(reset + red + bold + "\nBad input. Please rerun the program.");
        } else {
            System.out.print(reset + gold + "Pick a season from fall, spring, or winter: " + reset + grey);
            String season = sc.next();

            // check for bad input in season
            if (!season.equalsIgnoreCase("winter") && !season.equalsIgnoreCase("fall")
                    && !season.equalsIgnoreCase("spring")) {
                System.out.println(reset + red + bold + "\nBad input. Please rerun the program.");
            } else {
                // creates the window
                createWindow("Scenery: " + season + ", " + timeOfDay + "time", timeOfDay, season);
            }
        }
        // close scanner
        sc.close();
    }
}