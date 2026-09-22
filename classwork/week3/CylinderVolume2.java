import java.util.Scanner;

//calculates the volume of a cylinder with user-inputted radius and height and prints out the answer.
public class CylinderVolume2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        double height;
        double volume;
        System.out.println("Calculate the volume of a cylinder.");
        System.out.print("Enter a value for the radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter a value for the height: ");
        height = sc.nextDouble();
        volume = Math.PI * radius * radius * height;
        volume = Math.round(volume*100)/100.0;
        sc.close();
        System.out.println("The volume of a cylinder with radius " + radius + " and height " + height + " is " + volume);
    }
}