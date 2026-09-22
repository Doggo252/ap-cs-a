public class Runner{
//runs all the methods of Square.java and Circle.java to test them thoroughly.
    public static void main(String[] args){
        Square square = new Square();
        Circle circle = new Circle();

        square.printArea();
        square.changeSide();
        square.printArea();

        circle.printArea();
        circle.setRadius();
        circle.printArea();
    }   
}