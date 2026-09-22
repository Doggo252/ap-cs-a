import java.util.Scanner;

//asks user which formula they would like to use to solve an equation/problem and lets them type in values
public class MathGame{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(
                "There are five formula options: \n1. Quadratic Formula\n2. Pythagorean Theorem\n3. Area of sphere\n4. Average of two numbers\n5. Difference between two numbers\n\nChoose one by entering a number between 1 and 5: ");
        int option = scan.nextInt();
        //5 options separated by an if statement.
        if (option == 1) {
            System.out.println("You chose Quadratic Formula."); //inform the user which one they chose
            //ask for all the values
            System.out.print("Enter the value for a: ");
            double a = scan.nextDouble();
            System.out.print("Enter the value for b: ");
            double b = scan.nextDouble();
            System.out.print("Enter the value for c: ");
            double c = scan.nextDouble();
            //calculate answer
            double x1 = (-b + Math.sqrt(b * b - (4 * a * c))) / 2 * a;
            double x2 = (-b - Math.sqrt(b * b - (4 * a * c))) / 2 * a;
            System.out.println("Equation: " + a + "x\u00B2" + " + " + b + "x + " + c);
            System.out.println("X\u2081 = " + x1 + "\nX\u2082 = " + x2);
        }
        if (option == 2) {
            System.out.println("You chose Pythagorean Theorem."); //inform the user which one they chose
            //ask for all the values
            System.out.print("Enter the value for a: ");
            double a = scan.nextDouble();
            System.out.print("Enter the value for b: ");
            double b = scan.nextDouble();
            //calculate answer
            double c = Math.sqrt(a * a + b * b);
            System.out.println("c = " + c);
        }
        if (option == 3) {
            System.out.println("You chose area of sphere."); //inform the user which one they chose
            //ask for the value
            System.out.print("Enter the value for radius: ");
            double r = scan.nextDouble();
            //calculate answer
            double pi = Math.PI;
            double volume = 4 * pi * r * r;
            System.out.println("Volume = " + volume);
        }
        if (option == 4){
            System.out.println("You chose average of two numbers."); //inform the user which one they chose
            //ask for all the values
            System.out.print("Enter the first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scan.nextDouble();
            //calculate answer
            double avgnum = (num1+num2)/2.0;
            System.out.println("The average of the two numbers provided is " + avgnum);
        }
        if (option == 5){
            System.out.println("You chose difference of two numbers."); //inform the user which one they chose
            //ask for all the values
            System.out.print("Enter the first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scan.nextDouble();
            //calculate answer
            double difnum = Math.abs(num1-num2);
            System.out.println("The difference of the two numbers provided is " + difnum);
        }
    }
}