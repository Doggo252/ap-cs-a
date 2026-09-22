public class Rectangle{
    //initialize instance variables
    private int length;
    private int width;

    //default constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }

    //initialization constructor
    public Rectangle(int lt, int wd){
        length = lt;
        width = wd;
    }

    //print area method
    public void printArea(){
        double area = length * width;
        System.out.println("The area is " + area);
    }

}