import java.util.Scanner;

public class Runner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] itemArray = new Item[8];
        itemArray[0] = new Item("Toilet Paper", 99.99);
        itemArray[1] = new Item("MacBook Pro", 1999.99);
        itemArray[2] = new Item("Chicken", 12.99);
        itemArray[3] = new Item("Tesla", 49995.46);
        itemArray[4] = new Item("Ice Cream", 9.99);
        itemArray[5] = new Item("Mac n Cheese", 5.99);
        itemArray[6] = new Item("Water Bottle", 34.99);
        itemArray[7] = new Item("Yacht", 9999999.99);

        boolean running = true;
        int option = 0;
        while (running){
            System.out.println("Menu:\n1) Print all items\n2) Find items by price\n3) Find items by name\n4) Exit");
            System.out.print("Choice: ");
            option = sc.nextInt();
            if (option == 1){
                for (int i = 0; i < itemArray.length; i++){
                    System.out.println("Item Name: " + itemArray[i].getName() + "\t\tPrice: $" + itemArray[i].getPrice());
                }
                System.out.println();
            }
            else if (option == 2){
                
            }
            else if (option == 3){
                
            }
            else if (option == 4){
                sc.close();
                running = false;
            }
            else{
                System.out.println("An error occurred. Please try again.");
            }
        }
    }
}