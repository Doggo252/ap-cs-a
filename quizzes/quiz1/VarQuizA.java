public class VarQuizA {
    public static void main(String[] args) {
        double pi = 3.14;
        int radius = 10;
        System.out.println("pi: " + pi + "\n" + "radius: " + radius);
        double area = pi*radius*radius;
        System.out.println("The area is " + area);
        double circumference = 2 * pi * radius;
        System.out.println("The circumference is " + circumference);
    }
}