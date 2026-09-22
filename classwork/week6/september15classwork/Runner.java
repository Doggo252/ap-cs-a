public class Runner{
    public static void main(String[] args){
        //initialize two instances of both classes to test the default constructor and initialization constructor
        Rectangle rect1 = new Rectangle();
        rect1.printArea();
        Rectangle rect2 = new Rectangle(5, 3);
        rect2.printArea();
        Triangle triangle1 = new Triangle();
        triangle1.printArea();
        Triangle triangle2 = new Triangle(5, 3);
        triangle2.printArea();
    }
}