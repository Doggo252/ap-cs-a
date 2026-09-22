import java.util.Scanner;

//check in a user-inputted number is even or odd.
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer;
        System.out.print("Enter any integer: ");
        answer = sc.nextInt();
        if (answer % 2 == 0){
            System.out.println(answer + " is even.");
        }
        else {
            System.out.println(answer + " is odd.");
        }
    }
}