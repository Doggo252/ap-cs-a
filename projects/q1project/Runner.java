import javax.swing.JFrame;
import java.util.Scanner;

// Runner that can be used with JPanel Graphics
public class Runner {
    private void createWindow(String name, String timeOfDay, String season){
        // Create the frame object. Give it a title appropriate to the application
        JFrame frame = new JFrame(name);
        //Create the JPanel object and add it to the frame
        Scenery canvas = new Scenery(timeOfDay, season);
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

	public static void main( String args[] ) {
        //initialize runner for function
        Runner runner = new Runner();
        //ask the user for time of day and season
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to my scenery picture.\nWould you like a day or night scene?: ");
        String timeOfDay = sc.next();
        System.out.print("Pick a season from fall, spring, or winter: ");
        String season = sc.next();
        if (timeOfDay.equalsIgnoreCase("day")){
            if(season.equalsIgnoreCase("winter")){
                runner.createWindow("Scenery: winter, daytime", timeOfDay, season);
            }
            else if(season.equalsIgnoreCase("fall")){
                runner.createWindow("Scenery: fall, daytime", timeOfDay, season);
            }
            else if(season.equalsIgnoreCase("spring")){
                runner.createWindow("Scenery: spring, daytime", timeOfDay, season);
            }
            else {
                System.out.println("Bad input.");
            }
            
        }
        else if (timeOfDay.equalsIgnoreCase("night")){
            if(season.equalsIgnoreCase("winter")){
                runner.createWindow("Scenery: winter, nighttime", timeOfDay, season);
            }
            else if(season.equalsIgnoreCase("fall")){
                runner.createWindow("Scenery: fall, nighttime", timeOfDay, season);
            }
            else if(season.equalsIgnoreCase("spring")){
                runner.createWindow("Scenery: spring, nighttime", timeOfDay, season);
            }
            else {
                System.out.println("Bad input.");
            }
        }
        else{
            System.out.println("Bad input.");
        }
    }
}