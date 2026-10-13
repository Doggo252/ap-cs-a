import java.util.Scanner;

public class WhichWhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num = 0;
        while (num <= 5){
            System.out.print("Enter a number that is greater than 5: ");
            num = sc.nextDouble();
        }
        System.out.println("Congrats! You entered a number greater than 5. You entered: " + num);
    }
}