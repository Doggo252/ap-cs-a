//calculates the volume of a cylinder with given radius and height and prints out the answer.
public class CylinderVolume1{
    public static void main(String[] args) {
        int radius;
        int height;
        double volume;
        radius = 5;
        height = 12;
        volume = Math.PI * radius * radius * height;
        System.out.println("The volume of a cylinder with radius " + radius + " and height " + height + " is " + volume);
    }
}