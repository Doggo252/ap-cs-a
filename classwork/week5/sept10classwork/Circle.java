import java.util.Scanner;

public class Circle{
    //instantiate private attributes
    private double pi = 3.14;
    private double radius = 0;

    //setRadius() method that asks the user using scanner for
    //a radius and assigns it to the attribute radius
    public void setRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        radius = sc.nextInt();
        sc.close();
    }

    //printArea() calculates and sets the area variable to
    //pi * radius * radius and prints it out.
    public void printArea(){
        double area = pi * radius * radius;
        System.out.println("The area is " + area);
    }
}