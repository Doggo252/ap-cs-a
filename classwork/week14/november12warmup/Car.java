public class Car{
    //instance variables
    private String model;
    private int numDoors;

    //constructors
    public Car(String model, int numDoors){
        this.model = model;
        this.numDoors = numDoors;
    }

    //getters
    public String getModel(){
        return model;
    }

    public int getNumDoors(){
        return numDoors;
    }
}