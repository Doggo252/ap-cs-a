/*
The code compiled before turning it into good form because Java doesn't care about 
indentation and line breaks (it uses semicolons to separate lines), 
but it's very hard for humans to read code without them. The code also doesn't necessarily need
to follow coding conventions as they are conventions and not requirements.
*/
import java.util.Scanner;

//calculate the area of a circle
public class GoodForm { //change class and file name to GoodForm
    public static void main(String args[]) {
        Scanner keyBoard = new Scanner(System.in); // make keyboard camel case
        System.out.print("I will calculate the area of a circle. Please provide a radius: ");
        double radius = keyBoard.nextDouble(); // change cat variable name to radius
        double pi = 3.14; //change cow variable name to pi
        double area = pi * radius * radius; //change dog variable name to area
        System.out.println("The area of this circle is " + area); 
        keyBoard.close() //close the scanner
    }
}