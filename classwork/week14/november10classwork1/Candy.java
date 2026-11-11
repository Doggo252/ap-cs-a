public class Candy{
    //instance variables
    private String type;
    private double size;

    //constructor
    public Candy(String type, double size){
        this.type = type;
        this.size = size;
    }

    //get methods
    public String getType(){
        return this.type;
    }

    public double getSize(){
        return this.size;
    }
}