public class Item{
    //instance variables
    private String name;
    private double price;

    //constructor
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    //getters
    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}