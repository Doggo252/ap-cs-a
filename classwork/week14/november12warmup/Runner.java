public class Runner{
    public static void main(String[] args) {
        //create list of cars
        Car[] cars = new Car[5];
        cars[0] = new Car("Tesla Roadster", 2);
        cars[1] = new Car("Tesla Cybertruck", 4);
        cars[2] = new Car("Lamborghini", 2);
        cars[3] = new Car("Ford F-150 Lightning", 4);
        cars[4] = new Car("Mercedes Benz GLC", 4);

        //print all the models
        for (Car each : cars){
            System.out.println("The " + each.getModel() + " has " + each.getNumDoors() + " doors.");
        }
    }
}