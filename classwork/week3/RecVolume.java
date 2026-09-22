import java.util.Scanner;

//calculates the volume of a rectangular prism with user-inputted dimensions
public class RecVolume{
    public static void main(String[] args){
        System.out.println("Find the volume of a rectangular prism");
        Scanner sc = new Scanner(System.in);
        double width;
        double height;
        double length;
        double volume;
        System.out.print("Enter the width of the base: ");
        width = sc.nextDouble();
        System.out.print("Enter the length of the base: ");
        length = sc.nextDouble();
        System.out.print("Enter the height of the rectangular prism: ");
        height = sc.nextDouble();
        System.out.println("The dimensions are " + width + " x " + length + " x " + height);
        volume = Math.round(width * length * height * 100)/100.0;
        System.out.println("The volume of the rectangular prism is: " + volume);
        sc.close();
    }
}