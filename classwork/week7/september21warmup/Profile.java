public class Profile{
    //initialize instance variables
    private String name;
    private int age;

    //default constructor
    public Profile(){
        name = "John";
        age = 15;
    }

    //initialization constructor
    public Profile(String nm, int ag){
        name = nm;
        age = ag;
    }

    //prints the ID that is passed in
    public void printInfo(int id){
        System.out.print("ID: " + id + ". ");
        printVars();
    }

    //prints the name and age
    private void printVars(){
        System.out.println("Name: " + name + ". Age: " + age + ". ");
    }
}
