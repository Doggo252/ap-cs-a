import java.util.Scanner;
public class Runner{
    public static void main(String[] args){
        //instantiations
        Scanner sc = new Scanner(System.in);
        Formulas f = new Formulas();

        //colors
        String bold = "\u001B[1m";
        String reset = "\u001B[0m";
        String gold = "\u001B[33m";
        String red = "\u001B[31m";
        String grey = "\u001B[90m";
        String cyan = "\u001B[36m";
        String mint = "\u001B[38;2;123;203;131m";

        //menu
        System.out.println(bold + gold + "Formula Solver" + reset);
        System.out.print(
            grey + "Choose a formula:\n" + cyan + "1. " + reset + "Pythagorean Theorem\n"
             + cyan + "2. " + reset + "Volume of Sphere\n"
             + cyan + "3. " + reset + "Surface Area of Sphere\n"
             + cyan + "4. " + reset + "Area of Square\n"
             + cyan + "5. " + reset + "Quadratic Formula\n"
             + cyan + "6. " + reset + "Area of Circle\n"
             + cyan + "7. " + reset + "Circumference of Circle\n"
             + cyan + "8. " + reset + "Area of Triangle\n"
             + cyan + "9. " + reset + "Distance Formula\n"
             + cyan + "10. " + reset + "Midpoint Formula\n"
             + cyan + "11. " + reset + "Weight Formula\n"
             + cyan + "12. " + reset + "Potential Energy Formula\n"
             + cyan + "13. " + reset + "Ohm's Law\n"
             + cyan + "14. " + reset + "Kinetic Energy Formula\n"
             + cyan + "15. " + reset + "Speed Formula\n"
             + mint + bold + "Enter a number from 1-15: " + reset + bold
        );
        int option = sc.nextInt(); //get option from menu
        System.out.print(reset); //reset colors
        if (option == 1){ //option 1 - hypotenuse
            System.out.print("\nYou chose to solve for the hypotenuse of a right triangle.\nEnter the length of the first leg: ");
            double leg1 = sc.nextDouble();
            System.out.print("Enter the length of leg 2: ");
            double leg2 = sc.nextDouble();
            f.pythagoreanTheorem(leg1,leg2);
        }
        else if (option == 2){ //option 2 - volume of sphere
            System.out.print("\nYou chose to solve for the volume of a sphere.\nEnter the length of the radius: ");
            double radius = sc.nextDouble();
            f.volumeOfSphere(radius);
        }
        else if (option == 3){ //option 3 - surface area of sphere
            System.out.print("\nYou chose to solve for the surface area of a sphere.\nEnter the length of the radius: ");
            double radius = sc.nextDouble();
            f.surfaceAreaOfSphere(radius);
        }
        else if (option == 4){ //option 4 - area of square
            System.out.print("\nYou chose to solve for the area of a square.\nEnter the length of a side: ");
            double sideLength = sc.nextDouble();
            f.areaOfSquare(sideLength);
        }
        else if (option == 5){ //option 5 - quadratic formula
            System.out.print("\nYou chose to solve for the quadratic formula.\nEnter the value for a: ");
            double a = sc.nextDouble();
            System.out.print("Enter the value for b: ");
            double b = sc.nextDouble();
            System.out.print("Enter the value for c: ");
            double c = sc.nextDouble();
            f.quadraticFormula(a, b, c);
        }
        else if (option == 6){ //option 6 - area of circle
            System.out.print("\nYou chose to solve for the area of a circle.\nEnter the length of the radius: ");
            double radius = sc.nextDouble();
            f.areaOfCircle(radius);
        }
        else if (option == 7){ //option 7 - circumference of circle
            System.out.print("\nYou chose to solve for the circumference of a circle.\nEnter the length of the radius: ");
            double radius = sc.nextDouble();
            f.circumferenceOfCircle(radius);
        }
        else if (option == 8){ //option 8 - area of triangle
            System.out.print("\nYou chose to solve for the area of a triangle.\nEnter the length of the base: ");
            double base = sc.nextDouble();
            System.out.print("Enter the length of the height: ");
            double height = sc.nextDouble();
            f.areaOfTriangle(base, height);
        }
        else if (option == 9){ //option 9 - distance formula
            System.out.print("\nYou chose to solve for the distance of two points.\nEnter the x coordinate of the first point: ");
            double x1 = sc.nextDouble();
            System.out.print("Enter the y coordinate of the first point: ");
            double y1 = sc.nextDouble();
            System.out.print("Enter the x coordinate of the second point: ");
            double x2 = sc.nextDouble();
            System.out.print("Enter the y coordinate of the second point: ");
            double y2 = sc.nextDouble();
            f.distanceFormula(x1, y1, x2, y2);
        }
        else if (option == 10){ //option 10 - midpoint formula
            System.out.print("\nYou chose to solve for the midpoint of two points.\nEnter the x coordinate of the first point: ");
            double x1 = sc.nextDouble();
            System.out.print("Enter the y coordinate of the first point: ");
            double y1 = sc.nextDouble();
            System.out.print("Enter the x coordinate of the second point: ");
            double x2 = sc.nextDouble();
            System.out.print("Enter the y coordinate of the second point: ");
            double y2 = sc.nextDouble();
            f.midpointFormula(x1, y1, x2, y2);
        }
        else if (option == 11){ //option 11 - weight formula
            System.out.print("\nYou chose to solve for the weight of something.\nEnter the mass of the object (in kilos): ");
            double mass = sc.nextDouble();
            f.weightFormula(mass);
        }
        else if (option == 12){ //option 12 - PE formula
            System.out.print("\nYou chose to solve for the potential energy of an object.\nEnter the mass (in kilos): ");
            double mass = sc.nextDouble();
            System.out.print("Enter the height of the object (in meters): ");
            double height = sc.nextDouble();
            f.potentialEnergyFormula(mass, height);
        }
        else if (option == 13){ //option 13 - ohms law
            System.out.print("\nYou chose to solve for the voltage of a circuit.\nEnter the current (in amps): ");
            double current = sc.nextDouble();
            System.out.print("Enter the resistance (in ohms): ");
            double resistance = sc.nextDouble();
            f.ohmsLaw(current, resistance);
        }
        else if (option == 14){ //option 14 - KE formula
            System.out.print("\nYou chose to solve for the kinetic energy of an object.\nEnter the mass (in kilos): ");
            double mass = sc.nextDouble();
            System.out.print("Enter the velocity (in m/s): ");
            double velocity = sc.nextDouble();
            f.kineticEnergyFormula(mass, velocity);
        }
        else if (option == 15){ //option 15 - speed formula
            System.out.print("\nYou chose to solve for the speed of an object.\nEnter the distance it has traveled (in miles): ");
            double distance = sc.nextDouble();
            System.out.print("Enter the time it took (in hours): ");
            double time = sc.nextDouble();
            f.speedFormula(distance, time);
        }
        else{ //bad input
            System.out.println(red + bold + "You entered an unsupported option. Please re-run the program." + reset);
        }

        //close the scanner
        sc.close();
    }
}