//print the area of a triangle
public class Triangle {
    public static void main(String args[]) {
        int base;
        int height;
        base = 7;
        height = 11;
        System.out.print("Base: " + base + "\nHeight: " + height + "\n");
        double area = (base * height) / 2.0; //using 2.0 avoids integer division
        System.out.println("The area of the triangle is: " + area);
    }
}
