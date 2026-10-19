import java.util.Scanner;

public class BooLean{
    public static void main(String[] args){
        // colors
        String bold = "\u001B[1m";
        String reset = "\u001B[0m";
        String gold = "\u001B[33m";
        String red = "\u001B[31m";
        String grey = "\u001B[90m";
        String cyan = "\u001B[36m";
        String mint = "\u001B[38;2;123;203;131m";

        //variables for game + scanner
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int num1, num2;
        String answer;
        int score = 20;

        //start messages
        System.out.println(cyan + bold + "BooLean Game");
        System.out.println(reset + mint + "Your score is " + score + reset);
        
        //loop
        while (running){
            //game
            num1 = (int)(Math.random()*10+1);
            num2 = (int)(Math.random()*10+1);
            System.out.println(reset + gold + "Your numbers are " + num1 + " and " + num2 + "." + reset);
            if ((num1 == 5) && (num2 == 5)){
                System.out.println("Both the random numbers were 5, so you win 10 points!");
                score += 10;
            }
            else{
                System.out.println("Both the random numbers were not 5, so you lose 1 point.");
                score -= 1;
            }
            if (num1 == num2){
                System.out.println("Both the random numbers were equal, so you win 3 points!");
                score += 3;
            }
            else{
                System.out.println("Both the random numbers were not the same, so you lose 1 point.");
                score -= 1;
            }
            if ((num1 % 2 == 0) || (num2 % 2 == 0)){
                System.out.println("At least one of the numbers was even, so you win 2 points!");
                score += 2;
            }
            else{
                System.out.println("Neither of the numbers were even, so you lose 1 point.");
                score -= 1;
            }
            if ((num1 > 3) || (num2 > 3)){
                System.out.println("At least one of the numbers was greater than 3, so you win 1 point!");
                score += 1;
            }
            else{
                System.out.println("Neither of the numbers were greater than 3, so you lose 1 point.");
                score -= 1;
            }
            System.out.println(mint + "Your current score is: " + score + reset);

            //play again check
            System.out.print("Do you want to play again (yes or no)? " + grey);
            answer = sc.next();
            if (answer.equalsIgnoreCase("no")){
                System.out.println(reset + gold + bold + "Thanks for playing! Your final score is " + score + "." + reset);
                running = false;
            }
            else if (!answer.equalsIgnoreCase("yes")){
                System.out.println(red + bold + "Bad input. Ending program.");
                running = false;
            }
        }
    }
}