public class ForTest{
    //get factorial of a number using for loop
    public int getFactorial(int number){
        int factorial = 1;
        for(int i = number;i>=1;i--){
            factorial *= i;
        }
        return factorial;
    }
}