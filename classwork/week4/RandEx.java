//calculates two random numbers and performs a series of operations on them
public class RandEx{
    public static void main(String[] args){
        int num1 = (int)(Math.random() * (25) + 1);
        int num2 = (int)(Math.random() * (25) + 1);
        int smaller;
        System.out.println("The first random number between 1 and 25 is: " + num1);
        System.out.println("The second random number between 1 and 25 is: " + num2);
        if (num2 > num1){
            System.out.println(num2 + " is larger than " + num1);
            smaller = num1;
        }
        else if (num1 > num2){
            System.out.println(num1 + " is larger than " + num2);
            smaller = num2;
        }
        else{
            System.out.println("The numbers are equal.");
            smaller = num1;
        }
        double average = (num1 + num2)/2.0;
        System.out.println("The average is " + average);
        System.out.println(smaller + " raised to the power of 4 is " + Math.pow(smaller, 4));
    }
}