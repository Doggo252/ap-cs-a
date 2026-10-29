public class Pet {
    //instance variables
    private String name;
    private String species;
    private int hunger;
    private int happiness;
    private boolean isAsleep;

    //constructor using passed in inputs
    public Pet(String name, String species, int hunger, int happiness, boolean isAsleep) {
        this.name = name;
        this.species = species;
        this.hunger = hunger;
        this.happiness = happiness;
        this.isAsleep = isAsleep;
    }

    //checks if the happiness and hunger are past their thresholds
    private void maintainHomeostasis() {
        if (happiness > 100) {
            happiness = 100;
        }
        if (happiness < 0) {
            happiness = 0;
        }
        if (hunger > 100) {
            hunger = 100;
        }
        if (hunger < 0) {
            hunger = 0;
        }
    }

    //walk your pet function, checks for conditions about happiness and hunger
    public void goOnWalk(int miles) {
        if (!isAsleep){
            if (hunger <= 70 && happiness < 90) {
                happiness += (miles * 3);
                hunger += (miles * 5);
                maintainHomeostasis();
                System.out.println(name + " walked " + miles + " miles and they loved going on the walk.");
            } else if (hunger <= 70 && happiness >= 90) {
                System.out.println(name + " was too happy to go on a walk. Their current happiness level is: " + happiness);
            } else if (hunger > 70 && happiness < 90) {
                System.out.println(name + " was too hungry to go on a walk. Their current hunger level is: " + hunger);
            } else {
                System.out.println(name + " was too happy and too hungry to go on a walk.");
            }
        }
        else{
            System.out.println(name + " was asleep and could not go on a walk.");
        }
        
    }

    //feed your pet function, checks for conditions about sleeping status
    public void feed(int amount) {
        if (isAsleep) {
            System.out.println(name + " is asleep and can't be fed.");
        } else {
            hunger -= (amount * 3);
            maintainHomeostasis();
            System.out.println(name + " has been fed. Their current hunger level is " + hunger + ".");
        }
    }

    //play with your pet function, checks for conditions about sleep status and hunger
    public boolean play(int time) {
        if (isAsleep && hunger > 80) {
            System.out.println(name + " is asleep and too hungry to play.");
            return false;
        } else if (isAsleep) {
            System.out.println(name + " is asleep and can't play.");
            return false;
        } else if (hunger > 80) {
            System.out.println(name + " is too hungry to play.");
            return false;
        } else {
            happiness += (time * 3);
            hunger += (time / 2);
            maintainHomeostasis();
            System.out.println(name + " played. Their current hunger level is " + hunger + " and their current happiness level is " + happiness + ".");
            return true;
        }
    }

    //toggle sleep status for your pet
    public void toggleSleep() {
        isAsleep = !isAsleep;
        String text = "";
        if (isAsleep) {
            text = "Asleep";
        } else {
            text = "Awake";
        }
        System.out.println(name + " is now " + text + ".");
    }

    //checks if your pet needs care, checking happiness and hunger
    public boolean needsCare() {
        if (hunger > 70 || happiness < 50) {
            return true;
        } else {
            return false;
        }
    }

    //checks and returns the status of your pet in the current state
    public String getStatus() {
        String text = "";
        if (isAsleep) {
            text = "Asleep";
        } else {
            text = "Awake";
        }
        return ("----------PET SUMMARY----------\nName: " + name + "\nSpecies: " + species + "\nHunger Level: " + hunger + "\nHappiness Level: " + happiness + "\nSleeping status: " + text + "\n-------------------------------");
    }

    //takes your pet to the vet
    public void vetVisit(int time) {
        happiness -= (time * 3);
        maintainHomeostasis();
        System.out.println(name + " visited the vet. Their current happiness level is now " + happiness + ".");
    }

}