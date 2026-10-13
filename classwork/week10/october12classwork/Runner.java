import java.util.Scanner;

//while loops
public class Runner{
    public static void main(String[] args){
        System.out.print("First iteration: ");
        int i = 1;
        while (i <= 12){
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\nSecond iteration: ");
        i = 2;
        while (i <= 20){
            System.out.print(i + " ");
            i += 2;
        }
        
        System.out.print("\nThird iteration: ");
        i = 15;
        while (i >= -10){
            System.out.print(i + " ");
            i -= 5;
        }

        //use custom input
        System.out.println("\n\nCustom iteration");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 20 that I will count to: ");
        double start = sc.nextInt();
        if (start > 20){
            System.out.print("\nWhat should I count by? ");
            double count = sc.nextInt();
            if (count != 0){
                i = 0;
                System.out.print("Custom iteration: ");
                while (i<=start){
                    System.out.print(i + " ");
                    i += count;
                }
                System.out.print("\n");
            }
            else{
                System.out.println("You can't count by zero.");
            }
            
        }
        else{
            System.out.println("The number must be greater than 20.");
        }
        sc.close();
    }
}