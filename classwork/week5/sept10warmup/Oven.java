public class Oven{

//Oven class - 3 methods to mimic an oven
    public void checkTemp(){
        //makes a random temperature and checks if it's too hot
        System.out.println("[Oven] Checking Temperature");
        double temperature = (Math.floor(((Math.random() * 250) + 250)*100))/100.0;
        if (temperature <= 425){
            System.out.println("\tThe oven is ready.");
        }
        else{
            System.out.println("\tThe oven is too hot.");
        }

        System.out.println("\tThe temperature is " + temperature + "°F.");
    }

    public void checkTimer(){
        //makes a random number and prints it out as a timer. If it is less than 2 minutes left, adds a beep beep.
        System.out.println("[Oven] Checking Timer");
        int timer = (int) (Math.random() * 11);
        if (timer < 2){
            System.out.println("\tBeep Beep! There's " + timer + " minutes left.");
        }
        else {
            System.out.println("\t" + timer + " minutes left on the timer.");
        }
    }

    public void bakePizza(){
        //makes a random number of minutes and checks if the pizza has been in
        //for more than 15 minutes, and if it is prints that tha pizza is in danger
        //of burning. If not, prints the amount of minutes and that the pizza
        //will cook nicely
        System.out.println("[Oven] Baking Pizza");
        int minutes = (int) ((Math.random() * 16) + 5);
        if (minutes > 15){
            System.out.println("\tThe pizza is in danger of burning.");
        }
        else{
            System.out.println("\tThe pizza will cook nicely. It has been " + minutes + " minutes.");
        }
    }
}