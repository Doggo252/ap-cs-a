public class Rect{
    //instance variables
    private int length;
    private int width;
    private int area;
    
    //default constructor
    public Rect(){
	length = 7;
	width = 7;
    }

    //initialization constructor
    public Rect(int length, int width){
	this.length = length;
	this.width = width;
    }

    //prints the area using the area instance variable
    private void printArea(){
	System.out.println("The area is " + area + ".");
    }

    //calculates the area using instance variables
    public void calcArea(){
	    area = width * length;
	    this.printArea();
    }
}
