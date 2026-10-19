import java.util.Scanner;

public class Runner{
    public static void main(String[] args){
        //calling divide and slope functions with user inputs
        MathTest mt = new MathTest();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dividing a fraction with integers");
        System.out.print("Enter the numerator (integer): ");
        int numerator = sc.nextInt();
        System.out.print("Enter the denominator (integer): ");
        int denominator = sc.nextInt();
        mt.divide(numerator, denominator);
        System.out.println("Finding the slope of two points");
        System.out.print("Enter the x value of the first point (integer): ");
        int x1 = sc.nextInt();
        System.out.print("Enter the y value of the first point (integer): ");
        int y1 = sc.nextInt();
        System.out.print("Enter the x value of the second point (integer): ");
        int x2 = sc.nextInt();
        System.out.print("Enter the y value of the second point (integer): ");
        int y2 = sc.nextInt();
        mt.slope(x1, y1, x2, y2);
    }
}