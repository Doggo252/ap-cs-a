//Runner class - instantiate pythagorean and call the method
public class Runner{
    public static void main(String[] args){
        Pythagorean p = new Pythagorean();
        double answer = p.findC(5,12);
        System.out.println("The hypotenuse is " + answer);
    }
}

//pythagorean class - calculate's the hypotenuse of a right triangle
class Pythagorean{
    public double findC(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}