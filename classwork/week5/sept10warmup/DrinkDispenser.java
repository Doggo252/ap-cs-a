public class DrinkDispenser {
    //Randomizes syrup levels and tells the user if it is good or not
    public void checkSyrup(){
        System.out.println("[Drink Dispenser] Checking Syrup levels");
        double syrup = Math.floor((Math.random() * 100) * 100)/100.0;
        System.out.println("\tThe syrup levels are " + syrup + "%");
        if (syrup >= 30) {
            System.out.println("\tSyrup levels look good!");
        }
        else{
            System.out.println("\tSyrup levels are at a critically low level.");
        } 
    }
    //Randomizes Ice levels and tells the user if they are good or not
    public void checkIce(){
        System.out.println("[Drink Dispenser] Checking Ice levels");
        int weight = (int) (Math.random() * 51);
        System.out.println("\tThe weight is " + weight + " lbs.");
        if (weight >= 15){
            System.out.println("\tThe ice bin is full.");
        }
        else {
            System.out.println("\tThe ice bin is low.");
        }
    }
    //Tells the user the number of Drinks and if they will need a carrier or not
    public void numDrinks(){
        System.out.println("[Drink Dispenser] Checking if drink carrier is needed");
        int numOfDrinks = (int) ((Math.random() * 10) + 1);
        if (numOfDrinks >= 4){
            System.out.println("\tThere are " + numOfDrinks + " drinks and the customer will need a drink carrier.");
        }
        else if (numOfDrinks > 1){
            System.out.println("\tThere are " + numOfDrinks + " drinks.");
        }
        else {
            System.out.println("\tThere is " + numOfDrinks + " drink.");
        }
    }
}
