import java.util.Scanner;

public class Runner{
    public static void main(String[] args){
        //instantiate two animal classes & scanner
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Scanner sc = new Scanner(System.in);
        //ask user for animal type and age
        System.out.print("Enter any animal: ");
        String animalType = sc.next();
        System.out.print("Enter the age: ");
        int animalAge = sc.nextInt();
        //set the animal type and age, then print them
        animal.setVariables(animalType, animalAge);
        animal.printInfo();
        //set custom parameters and print those in the second object
        animal2.setVariables("Horse", 7);
        animal2.printInfo();
        sc.close();
    }
}