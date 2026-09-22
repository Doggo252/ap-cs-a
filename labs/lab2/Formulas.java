public class Formulas{
    //initializes instance variables
    private double pi = 3.14;
    private double gravity = 9.8;

    //method 1/15 -- method 1/10 - alg 2
    public void pythagoreanTheorem(double leg1, double leg2){
        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
        System.out.println("The hypotenuse of the right triangle is: " + hypotenuse + ".");
    }

    //method 2/15 -- method 2/10 - alg 2
    public void volumeOfSphere(double radius){
        double volume = (4.0/3.0) * pi * radius * radius * radius;
        System.out.println("The volume of the sphere is: " + volume + ".");
    }

    //method 3/15 -- method 3/10 - alg 2
    public void surfaceAreaOfSphere(double radius){
        double area = 4 * pi * radius * radius;
        System.out.println("The surface area of the sphere is: " + area + ".");
    }

    //method 4/15 -- method 4/10 - alg 2
    public void areaOfSquare(double sideLength){
        double area = sideLength * sideLength;
        System.out.println("The area of the square is: " + area + ".");
    }

    //method 5/15 -- method 5/10 - alg 2
    public void quadraticFormula(double a, double b, double c){
        System.out.println("Equation: " + a + "x\u00B2" + " + " + b + "x + " + c);
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        
        if (Double.isNaN(x1) || Double.isNaN(x2)){
            System.out.println("There are no real solutions.");
        }
        else if (x1 == x2){
            System.out.println("X = " + x1);
        }
        else{
            System.out.println("X\u2081 = " + x1 + "\nX\u2082 = " + x2);
        }
    }

    //method 6/15 -- method 6/10 - alg 2
    public void areaOfCircle(double radius){
        double area = pi * radius * radius;
        System.out.println("The area of the circle is: " + area + ".");
    }

    //method 7/15 -- method 7/10 - alg 2
    public void circumferenceOfCircle(double radius){
        double circumference = 2 * pi * radius;
        System.out.println("The circumference of the circle is: " + circumference + ".");
    }

    //method 8/15 -- method 8/10 - alg 2
    public void areaOfTriangle(double base, double height){
        double area = (1.0/2.0) * base * height;
        System.out.println("The area of the triangle is: " + area + ".");
    }

    //method 9/15 -- method 9/10 - alg 2
    public void distanceFormula(double x1, double y1, double x2, double y2){
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance of the two points is: " + distance + ".");
    }

    //method 10/15 -- method 10/10 - alg 2
    public void midpointFormula(double x1, double y1, double x2, double y2){
        double x = (x1 + x2)/ 2.0;
        double y = (y1 + y2)/ 2.0;
        System.out.println("The midpoint is (" + x + ", " + y + ").");
    }

    //method 11/15 -- method 1/5 - physics
    public void weightFormula(double mass){
        //mass in kilos
        double weight = mass * gravity;
        System.out.println("The weight is " + weight + " newtons.");
    }

    //method 12/15 -- method 2/5 - physics
    public void potentialEnergyFormula(double mass, double height){
        //mass in kilos, height in meters
        double potentialEnergy = mass * gravity * height;
        System.out.println("The PE is " + potentialEnergy + " joules.");
    }

    //method 13/15 -- method 3/5 - physics
    public void ohmsLaw(double current, double resistance){
        //current in amps, resistance in ohms
        double voltage = current * resistance;
        System.out.println("The voltage is " + voltage + " volts.");
    }

    //method 14/15 -- method 4/5 - physics
    public void kineticEnergyFormula(double mass, double velocity){
        //mass in kilos, velocity in m/s
        double kineticEnergy = (1.0/2.0) * mass * Math.pow(velocity, 2);
        System.out.println("The KE is " + kineticEnergy + " joules.");
    }

    //method 15/15 -- method 5/5 - physics
    public void speedFormula(double distance, double time){
        //distance in miles, time in hours
        double speed = distance/time;
        System.out.println("The speed is " + speed + " mph.");
    }

}