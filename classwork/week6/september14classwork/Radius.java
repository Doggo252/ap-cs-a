public class Radius{
    //instantiate pi as 3.14
    private double pi = 3.14;

    //area of circle
    public void printArea(double radius){
        double area = radius * radius * pi;
        System.out.println("The area is: " + area);
    }

    //circumference of circle
    public void printCir(double radius){
        double circumference = 2 * pi * radius;
        System.out.println("The circumference is: " + circumference);
    }
    
    //volume of cone
    public void printConeVol(double radius, double height){
        double volume = (1.0/3.0)*pi*radius*radius*height;
        System.out.println("The volume is: " + volume);
    }
    
}