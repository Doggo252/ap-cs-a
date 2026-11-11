public class Runner{
    public static void main(String[] args){
        //tests all methods of the ArrayTest class
        ArrayTest at = new ArrayTest(5);
        at.printArr();
        int sum = at.getSum();
        System.out.println("The sum is " + sum + ".");
    }
}