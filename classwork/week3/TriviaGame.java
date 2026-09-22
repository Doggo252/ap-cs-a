import java.util.Scanner;

//Trivia Game -- ask six questions and add a point when correct
public class TriviaGame{
    public static void main(String[] args){
        //initialize variables and scanner
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Trivia Game");

        //first question
        System.out.print("\nWhat color is the sky on a sunny day? ");
        String answer1 = sc.next();
        if (answer1.equalsIgnoreCase("blue")){
            score += 1;
            System.out.println("You got it correct. Your score is: " + score);
        }
        else {
            System.out.println("You got it wrong. The correct answer is blue. Your score is: " + score);
        }

        //second question - long response
        System.out.print("\nWhat is the official national anthem of the United States? ");
        sc.nextLine();
        String answer2 = sc.nextLine();
        if (answer2.equalsIgnoreCase("Star Spangled Banner")){
            score += 1;
            System.out.println("You got it correct. Your score is: " + score);
        }
        else {
            System.out.println("You got it wrong. The correct answer is Star Spangled Banner. Your score is: " + score);
        }

        //third question
        System.out.print("\nWhat planet is closest to the sun? ");
        String answer3 = sc.next();
        if (answer3.equalsIgnoreCase("Mercury")){
            score += 1;
            System.out.println("You got it correct. Your score is: " + score);
        }
        else {
            System.out.println("You got it wrong. The correct answer is Mercury. Your score is: " + score);
        }

        //fourth question - long response
        System.out.print("\nWho is the first president of the United States? ");
        sc.nextLine();
        String answer4 = sc.nextLine();
        if (answer4.equalsIgnoreCase("George Washington")){
            score += 1;
            System.out.println("You got it correct. Your score is: " + score);
        }
        else {
            System.out.println("You got it wrong. The correct answer is George Washington. Your score is: " + score);
        }

        //fifth question
        System.out.print("\nWhat is the name of the fictional school in Harry Potter? ");
        String answer5 = sc.next();
        if (answer5.equalsIgnoreCase("Hogwarts")){
            score += 1;
            System.out.println("You got it correct. Your score is: " + score);
        }
        else {
            System.out.println("You got it wrong. The correct answer is Hogwarts. Your score is: " + score);
        }

        //sixth question - long response, print final score
        System.out.print("\nWhat does the tech acronym \"WWW\" stand for? ");
        sc.nextLine();
        String answer6 = sc.nextLine();
        if (answer6.equalsIgnoreCase("World Wide Web")){
            score += 1;
            System.out.println("You got it correct.\nYour final score is: " + score);
        }
        else {
            System.out.println("You got it wrong. The correct answer is World Wide Web.\nYour final score is: " + score);
        }

        //close scanner
        sc.close();
    }
}