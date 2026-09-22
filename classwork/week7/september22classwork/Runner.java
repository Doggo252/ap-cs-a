public class Runner{
    public static void main(String[] args){
        //instantiate objects of r1 and r2 using both the constructors
        UseRadius r1 = new UseRadius();
        UseRadius r2 = new UseRadius(10.0);

        //call a bunch of different methods to test them out
        r1.printVol();
        r2.printVol();
        r1.printArea();
        r1.printArea(5);
        r2.printArea();
        r2.printArea(5);
        r2.printVol(7,10);
    }
}