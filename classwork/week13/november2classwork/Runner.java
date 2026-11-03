public class Runner{
    public static void main(String[] args) {
        //instantiate ForPractice class
        ForPractice fp = new ForPractice();

        //call printEven method with a max of 25
        fp.printEven(25);

        //call findNum method twice checking the output and printing the appropriate statement
        int result1 = fp.findNum(9, 20, 7);
        if (result1 != -1){
            System.out.println("The number " + result1 + " was found.");
        }
        else{
            System.out.println("No number was found.");
        }
        int result2 = fp.findNum(12, 21, 11);
        if (result2 != -1){
            System.out.println("The number " + result2 + " was found.");
        }
        else{
            System.out.println("No number was found.");
        }
    }
}