import javax.swing.JFrame;
import java.util.Scanner;

// Runner that can be used with JPanel Graphics
public class Runner {
    private static void createWindow(String name, String timeOfDay, String season){
        // Create the frame object. Give it a title appropriate to the application
        JFrame frame = new JFrame(name);
        //Create the JPanel object and add it to the frame
        Scenery canvas = new Scenery(frame, timeOfDay, season);
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

	public static void main( String args[] ) {
        //initialize runner for function

        /* 
        //ask the user for time of day and season
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to my scenery picture.\nWould you like a day or night scene?: ");
        String timeOfDay = sc.next();
        
        
        
        if (!timeOfDay.equalsIgnoreCase("day") && !timeOfDay.equalsIgnoreCase("night")){
            System.out.println("Bad input.");
        }
        else{
            System.out.print("Pick a season from fall, spring, or winter: ");
            String season = sc.next();
            
            if(!season.equalsIgnoreCase("winter") && !season.equalsIgnoreCase("fall") && !season.equalsIgnoreCase("spring")){
                System.out.println("Bad input.");
            }
            else{
                createWindow("Scenery: " + season + ", " + timeOfDay + "time", timeOfDay, season);
            }
        }

        sc.close();
        */
        String timeOfDay = "day";
        String season = "fall";
        createWindow("Scenery: " + season + ", " + timeOfDay + "time", timeOfDay, season);
    }
}