public class Runner{
    public static void main(String[] args) {
        //initialize the array
        Candy[] candyBag = new Candy[5];
        //set five different candies
        candyBag[0] = new Candy("Twix", 8);
        candyBag[1] = new Candy("Hersheys", 12);
        candyBag[2] = new Candy("Kit-Kat", 4);
        candyBag[3] = new Candy("Snickers", 2);
        candyBag[4] = new Candy("M&Ms", 16);

        //print out the information about all the candies
        for (int i = 0; i < candyBag.length; i++){
            System.out.println("Candy Type: " + candyBag[i].getType() + "\tCandy Size: " + candyBag[i].getSize() + " ounces");
        }
    }
}