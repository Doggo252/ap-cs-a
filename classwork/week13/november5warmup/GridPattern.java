public class GridPattern{
    public static void main(String[] args) {
        //number between 4 and 10 inclusive
        int num = (int)(Math.random() * (7) + 4);
        //initialize product variable to use inside the loop
        int product = 0;
        //message for what rand was selected
        System.out.println("Grid for a " + num + " by " + num + " table");
        //inner loop prints across, then outer loop goes gown
        for (int outer = 1; outer <= num; outer++){
            for (int inner = 1; inner <= num; inner++){
                //calculate product
                product = outer * inner;

                //check for conditions
                if (product % 4 == 0){
                    System.err.print("--\t");
                    continue;
                }
                
                //don't print rest of max's if there is a max
                if (product > 20){
                    System.out.print("Max\t");
                    break;
                }

                //print regular number
                System.out.print(product + "\t");
            }

            //next row
            System.out.println();
        }
    }
}