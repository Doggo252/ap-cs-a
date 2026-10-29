public class Runner{
    public static void main(String[] args) {
        //instantiate ForTest and get factorial of 5
        ForTest ft = new ForTest();
        int factorial = ft.getFactorial(5);
        System.out.println("The factorial of 5 is " + factorial + ".");
    }
}