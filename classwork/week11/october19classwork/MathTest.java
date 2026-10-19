public class MathTest{
    //divide and slope functions using casting
    public void divide(int numerator, int denominator){
        double result = (double) numerator/denominator;
        System.out.println("The result of " + numerator + "/" + denominator + " is " + result + ".");
    }
    public void slope(int x1, int y1, int x2, int y2){
        double slope = ((double) y2-y1) / (x2-x1);
        System.out.println("The slope of the two points (" + x1 + ", " + y1 + "), and (" + x2 + ", " + y2 + ") is " + slope + ".");
    }
}