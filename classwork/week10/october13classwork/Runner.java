import java.util.Scanner;
import java.util.InputMismatchException;

public class Runner{
    public static void main(String[] args){
        //while
        int sum = 0;
        int i = 2;
        while (i<=19){
            sum += i;
            i++;
        }
        System.out.println("The sum of all numbers between 2 and 19 inclusive is (using a while loop): " + sum + ".");

        //do while
        sum = 0;
        i = 2;
        do{
            sum += i;
            i++;
        } while (i<=19);
        System.out.println("The sum of all numbers between 2 and 19 inclusive is (using a do-while loop): " + sum + ".");

        //custom, using do while and catching exceptions.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer greater than 1: ");
        int max = 0;
        try{
            max = sc.nextInt();
            if (max >= 1){
                i = 1;
                do {
                    System.out.print(i + " ");
                    i++;
                }while (i<=max);
                System.out.println();
                i = max;
                do {
                    System.out.print(i + " ");
                    i--;
                }while (i>=1);
                System.out.println();
            } else{
                System.out.println("You entered a number that wasn't greater than 1.");
            }
        }
        catch(InputMismatchException e){
            System.out.println("You didn't enter an integer or you entered an integer that is bigger than 32 bit integer limit.");
        }
        sc.close();
    }
}