import java.util.Scanner;

public class MathLibrary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //cylinder volume
        double pi = Math.PI;
        double radius;
        double height;
        double volume;
        System.out.println("Calculating the volume of a cylinder.");
        
        System.out.print("Enter a radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter a height: ");
        height = sc.nextDouble();
        volume = Math.pow(radius, 2) * height * pi;
        System.out.println("The volume is: " + volume);

        //quadratic formula
        System.out.println("\nSolving the quadratic formula.");
        System.out.print("Enter the value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value for c: ");
        double c = sc.nextDouble();
        System.out.println("Equation: " + a + "x\u00B2" + " + " + b + "x + " + c);
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
        
        if (Double.isNaN(x1) || Double.isNaN(x2)){
            System.out.println("There are no real solutions.");
        }
        else{
            System.out.println("X\u2081 = " + x1 + "\nX\u2082 = " + x2);
        }

        //pythagorean theorem
        System.out.println("\nSolving Pythagorean Theorem.");
        System.out.print("Enter the value for a: ");
        a = sc.nextDouble();
        System.out.print("Enter the value for b: ");
        b = sc.nextDouble();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("c = " + c);
    }
}