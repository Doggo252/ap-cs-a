public class Triangle{
    //initialize instance variables
    private int base;
    private int height;

    //default constructor
    public Triangle(){
        base = 0;
        height = 0;
    }

    //initialization constructor
    public Triangle(int bs, int ht){
        base = bs;
        height = ht;
    }

    //print area method
    public void printArea(){
        double area = (1.0/2.0) * base * height;
        System.out.println("The area is " + area);
    }

}