
// Program that uses nested loops to carry out operations
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NestedLoops nl = new NestedLoops();

        // Drawing 5x5 grid
        System.out.println("Filled box (5x5)");
        nl.drawFilledBox();
        System.out.println();

        // Drawing grid based on user input
        System.out.println("Filled box (custom dimensions)");
        System.out.print("Enter a value for the width of the box: ");
        int width = sc.nextInt();
        System.out.print("Enter a value for the height of the box: ");
        int height = sc.nextInt();
        nl.drawFilledBox(width, height);
        System.out.println();

        // Drawing 3x4 multiplication chart
        System.out.println("Multiplication chart (3x4)");
        nl.drawMultiChart();
        System.out.println();

        // Drawing triangle with custom rows
        System.out.println("Triangle (custom rows)");
        System.out.print("Enter the number of rows for a triangle: ");
        int rows = sc.nextInt();
        nl.drawTriangle(rows);
    }
}