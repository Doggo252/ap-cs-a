// Kitchen simulator that checks the status of an oven and drink dispenser
public class Runner {
    public static void main(String[] args) {
        System.out.println("=== DINNER SERVICE INITIATED ===");


        // Instantiating the kitchen hardware
        Oven myOven = new Oven();
        DrinkDispenser myDispenser = new DrinkDispenser();


        // Station Prep
        myDispenser.numDrinks();
        myDispenser.checkSyrup();
        myDispenser.checkIce();
        System.out.println();


        // Cooking Service
        myOven.checkTemp();
        myOven.bakePizza();
        myOven.checkTimer();


        System.out.println();
        System.out.println("=== DINNER SERVICE COMPLETE ===");
    }
}
