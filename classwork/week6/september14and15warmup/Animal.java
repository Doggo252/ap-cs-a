public class Animal{
    //create the private instance variables
    private String animalType;
    private int age;

    //sets the variables
    public void setVariables(String type, int ageVar){
        animalType = type;
        age = ageVar;
    }

    //prints the variables
    public void printInfo(){
        System.out.println("The animal is a " + animalType + " and their age is " + age + ".");
    }
}