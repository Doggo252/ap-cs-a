import java.util.Scanner;

//Converts integer numbers between 1 and 127 to binary.
public class BinConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Imports scanner to ask user what number to convert
        System.out.print("Enter a number between 1-127 to convert to binary: "); // Asks what number to convert
        int number = sc.nextInt(); // Stores the integer
        // Creates variables used in calculation
        int remainder = 0;
        float result = 0f;
        String finalNumber = "";
        result = number; // Sets the first result to be the number the user gave

        while (result >= 1) {
            result /= 2; // divides result by 2
            // converts result to string and extracts the last digit and converts it back to
            // an integer
            String resultString = Float.toString(result);
            char lastDigit = resultString.charAt(resultString.length() - 1);
            int lastDigitNum = Character.getNumericValue(lastDigit);
            // checks if the remainder is 1 or 0 using the last decimal digit (which would
            // be x.5 or x.0)
            if (lastDigitNum == 5) {
                remainder = 1;
            } else {
                remainder = 0;
            }
            // converts the remainder to a string and place it at the front of the result
            // (binary reads backwards)
            String stringnum = Integer.toString(remainder);
            finalNumber = stringnum + finalNumber;
            resultString = Float.toString(result);

            // strips the decimals
            result = (int) result;
            result = (float) result;
        }
        if (number == 0){
            finalNumber = "0";
        }
        // Output the final binary number
        System.out.println(number + " in binary is: " + finalNumber);

    }
}