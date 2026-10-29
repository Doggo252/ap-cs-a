import java.util.Scanner;

public class Runner{
    public static void main(String[] args) {
        //colors & font settings
        String bold = "\u001B[1m";
        String italic = "\033[3m";
        String reset = "\u001B[0m";
        String gold = "\u001B[33m";
        String red = "\u001B[31m";
        String grey = "\u001B[90m";
        String cyan = "\u001B[36m";
        String mint = "\u001B[38;2;123;203;131m";
        String color1 = "\u001B[38;2;135;185;245m";
        String color2 = "\u001B[38;2;230;230;230m";

        //instantiate pet object and scanner
        Pet petObj = new Pet("Luna", "Phoenix", 30, 70, false);
        Scanner sc = new Scanner(System.in);
        
        //runtime variables
        boolean running = true;
        int option = -1;
        
        //starting text
        System.out.println(gold + bold + "Lab 3: Virtual Pet Companion");
        System.out.println(reset + "Your pet is a phoenix named " + italic + bold + "Luna" + reset + ". Their starting hunger level is " + italic + bold + "30" + reset + " and their happiness level is currently " + italic + bold + "70" + reset + ". They are awake.");
        
        //runtime loop
        while (running){
            //menu message
            System.out.print(cyan + bold + "Menu:\n" + reset + grey + "0)" + color1 + " Exit\n" + grey + "1) " + color2 + "Take your pet for a walk\n" + grey + "2) " + color1 + "Feed your pet\n" + grey + "3) " + color2 + "Play with your pet\n" + grey + "4) " + color1 + "Wake up your pet or have your pet go to sleep\n" + grey + "5) " + color2 + "Get the status of your pet\n" + grey + "6) " + color1 + "Take your pet to the vet\n" + mint + "Which option would you like? " + reset);
            option = sc.nextInt();
            System.out.println();
            if (option == 0){ //exit if user chooses to exit
                System.out.println(red + bold + "Exiting program.");
                running = false;
            }
            else if (option == 1){ //checks for valid input and calls goOnWalk()
                int answer = 0;
                do{
                    System.out.print(reset + "How many miles would you like to walk (between 1 and 5)? ");
                    answer = sc.nextInt();
                    if (!(answer >= 1 && answer <= 5)){
                        System.out.println(red + bold + "Invalid input. Please try again." + reset);
                    }
                }while (!(answer >= 1 && answer <= 5));
                petObj.goOnWalk(answer);
                System.out.println();
            }
            else if (option == 2){ //checks for valid input and calls feed()
                int answer = 0;
                do{
                    System.out.print(reset + "How much would you like to feed your pet (between 3 and 10, 3 is snack, 10 is full meal)? ");
                    answer = sc.nextInt();
                    if (!(answer >= 3 && answer <= 10)){
                        System.out.println(red + bold + "Invalid input. Please try again." + reset);
                    }
                }while (!(answer >= 3 && answer <= 10));
                petObj.feed(answer);
                System.out.println();
            }
            else if (option == 3){ //checks for valid input and calls play()
                int answer = 0;
                do{
                    System.out.print(reset + "How many minutes would you like to play (between 10 and 20)? ");
                    answer = sc.nextInt();
                    if (!(answer >= 10 && answer <= 20)){
                        System.out.println(red + bold + "Invalid input. Please try again." + reset);
                    }
                }while (!(answer >= 10 && answer <= 20));
                petObj.play(answer);
                System.out.println();
            }
            else if (option == 4){ //toggles pet sleep by calling toggleSleep()
                petObj.toggleSleep();
                System.out.println();
            }
            else if (option == 5){
                System.out.println();
                System.out.println(petObj.getStatus());
                System.out.println();
            }
            else if (option == 6){ //checks for valid input and calls vetVisit()
                int answer = 0;
                do{
                    System.out.print(reset + "How severe is the vet visit (between 1 and 5)? ");
                    answer = sc.nextInt();
                    if (!(answer >= 1 && answer <= 5)){
                        System.out.println(red + bold + "Invalid input. Please try again." + reset);
                    }
                }while (!(answer >= 1 && answer <= 5));
                petObj.vetVisit(answer);
                System.out.println();
            }
            else{ //if option isn't any of the other options, print bad input
                System.out.println(red + bold + "Bad input, an error occurred. Please try again.\n" + reset);
            }
            if (option != 0){ //if the user is not exiting, check if the pet needs care
                if (petObj.needsCare()){
                    System.out.println("Your pet needs care.");
                }
            }
        }
    }
}