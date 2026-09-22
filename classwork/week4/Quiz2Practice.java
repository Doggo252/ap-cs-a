import java.util.Scanner;


//calculates the area or perimeter of a rectangle based on user-inputted dimensions and choice of area or perimeter
public class Quiz2Practice{
    public static void main(String[] args){
        double length;
        double width;
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the area or perimeter of a rectangle.");
        System.out.print("Enter a length: ");
        length = sc.nextDouble();
        System.out.print("Enter a width: ");
        width = sc.nextDouble();
        double area = length * width;
        double perimeter = 2 * length + 2 * width;
        System.out.print("Would you like to calculate area or perimeter?\nEnter 1 for area and 2 for perimeter: ");
        int answer = sc.nextInt();
        if(answer == 1){
            System.out.println("The area of the rectangle is: " + area);
        }
        else if (answer == 2){
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
        else {
            System.out.println("You entered an unsupported option.");
        }
        sc.close();
    }
}