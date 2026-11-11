import java.util.Scanner;

public class Runner{
    public static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);
        //itemarray, add items
        Item[] itemArray = new Item[8];
        itemArray[0] = new Item("Toilet Paper", 19.99);
        itemArray[1] = new Item("MacBook Pro", 1999.99);
        itemArray[2] = new Item("Chicken", 12.99);
        itemArray[3] = new Item("Tesla", 49995.46);
        itemArray[4] = new Item("Ice Cream", 9.99);
        itemArray[5] = new Item("Mac n Cheese", 5.99);
        itemArray[6] = new Item("Water Bottle", 34.99);
        itemArray[7] = new Item("Yacht", 9999999.99);

        //loop condition
        boolean running = true;
        //which option was chosen
        int option = 0;
        //counter to use inside loop
        int counter = 0;
        while (running){
            //menu of options
            System.out.println("Menu:\n1) Print all items\n2) Find items by price\n3) Find items by name\n4) Exit");
            System.out.print("Choice: ");
            option = sc.nextInt();
            //prints all items
            if (option == 1){
                for (int i = 0; i < itemArray.length; i++){
                    System.out.println("Item Name: " + itemArray[i].getName() + "\t\tPrice: $" + itemArray[i].getPrice());
                }
                System.out.println();
            }
            //prints item by price
            else if (option == 2){
                double price = 0;
                System.out.print("Enter the price by which you would like to search: ");
                price = sc.nextDouble();
                counter = 0;
                for(Item each : itemArray){
                    if(each.getPrice() == price){
                        System.out.println("Item Name: " + each.getName() + "\t\tPrice: $" + each.getPrice());
                        counter += 1;
                    }
                }
                if (counter == 0){
                    System.out.println("Nothing was found.");
                }
                System.out.println();
            }
            //prints item by name
            else if (option == 3){
                String name = "";
                System.out.print("Enter the name by which you would like to search: ");
                sc.nextLine();
                name = sc.nextLine();
                counter = 0;

                for(Item each : itemArray){
                    if(each.getName().toLowerCase().contains(name.toLowerCase())){
                        System.out.println("Item Name: " + each.getName() + "\t\tPrice: $" + each.getPrice());
                        counter += 1;
                    }
                }
                if (counter == 0){
                    System.out.println("Nothing was found.");
                }
                System.out.println();
            }
            //exits
            else if (option == 4){
                sc.close();
                running = false;
            }
            //error
            else{
                System.out.println("An error occurred. Please try again.");
            }
        }
    }
}