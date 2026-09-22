public class UseRadius{
    //instantiate instance variables
    private double pi;
    private double radius;
    private double volume;

    //default constructor
    public UseRadius(){
        this.radius = 0;
        this.pi = 3.14;
        this.volume = 0;
    }

    //initialization constructor
    public UseRadius(double radius){
        this.radius = radius;
        this.pi = 3.14;
        this.volume = 0;
    }

    //calcVol (volume of sphere) method using instance variables
    private void calcVol(){
        this.volume = 1.33 * this.radius * this.radius * this.radius * this.pi;
    }

    //printArea (area of circle) method using instance variables
    public void printArea(){
        double area = pi * this.radius * this.radius;
        System.out.println("The area of the circle is " + area + ".");
    }

    //printArea (area of circle) method using parameters
    public void printArea(double radius){
        double area = pi * radius * radius;
        System.out.println("The area of the circle is " + area + ".");
    }

    //use the instance variables from calcVol to calculate the volume of sphere then print it out
    public void printVol(){
        calcVol();
        System.out.println("The volume of the sphere is " + volume + ".");
    }

    //use parameters to calculate the volume of cylinder then print it out
    public void printVol(double radius, double height){
        double vol = this.pi * radius * radius * height;
        System.out.println("The volume of the cylinder is " + volume + ".");
    }
}