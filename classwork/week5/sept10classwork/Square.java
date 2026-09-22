public class Square{
    //instantiate private attributes
    private int side = 7;

    //changeSide() sets the side to 5.
    public void changeSide(){
        side = 5;
    }

    //printArea() calculates and prints the area of the square with side 'side'
    public void printArea(){
        int area = side * side;
        System.out.println("The area is: " + area);
    }
}