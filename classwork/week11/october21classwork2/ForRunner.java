public class ForRunner {
    public static void main(String[] args) {
        //For loop 1-25 inclusive
        System.out.print("For loop 1: ");

        for (int i = 1; i <= 25; i++) {
            System.out.print(i + ", ");
        }

        //For loop 25-1 inclusive
        System.out.print("\b\b  \nFor loop 2: ");

        for (int i = 25; i >= 1; i--) {
            System.out.print(i + ", ");
        }

        //do while loop sum of 1-25 inclusive
        System.out.print("\b\b  \nDo while loop 1: ");

        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 25);
        System.out.println("\nThe sum is " + sum);

    }
}