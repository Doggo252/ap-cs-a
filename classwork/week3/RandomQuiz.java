import java.util.Scanner;
import java.util.Random;

//Random quiz game
public class RandomQuiz{
    public static void main(String[] args){
        //initialize scanner and rand 
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //ask which type of question
        System.out.print("Would you like a trivia question about:\n1. Fahrenheit to Celsius conversion\n2. Video game trivia\nEnter a number (1-2): ");
        int answer = sc.nextInt();
        if(answer == 1){
            //uses random number for question
            int randomQuestionNum = rand.nextInt(0,100);
            int correct = Math.round((randomQuestionNum - 32) * (5.0f/9.0f));
            System.out.print("Convert " + randomQuestionNum + "°F to Fahrenheit rounded to the nearest integer: ");
            int answer1 = sc.nextInt();
            if (answer1 == correct){
                System.out.println("Congratulations! You got the correct answer.");
            }
            else{
                System.out.println("You got the wrong answer. The correct answer is " + correct + ".");
            }

        }
        else if (answer == 2){
            //asks fixed question
            System.out.print("What year was Minecraft 1.0.0 released? ");
            String answer2 = sc.next();
            String correct = "2011";
            if (answer2.equalsIgnoreCase(correct)){
                System.out.println("Congratulations! You got the correct answer.");
            }
            else{
                System.out.println("You got the wrong answer. The correct answer is " + correct + ".");
            }
        }
        else{
            //message for unsupported option
            System.out.println("You entered an unsupported option. Please try again.\n");
        }

        //close scanner
        sc.close();
    }
}