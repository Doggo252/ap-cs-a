import java.util.Scanner;

//builds a sentence with user-inputted noun and verb.
public class BuildSentence{
    public static void main(String[] args){
        System.out.println("Builds a sentence.");
        Scanner sc = new Scanner(System.in);
        String verb;
        String noun;
        System.out.print("Enter any verb: ");
        verb = sc.next();
        System.out.print("Enter a singular noun: ");
        noun = sc.next();
        sc.close();
        String sentence = "The " + noun + " " + verb + "s.";
        System.out.println(sentence);       
    }
}