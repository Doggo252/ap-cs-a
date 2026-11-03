public class ForPractice{
    //printEven method, prints all even numbers between 1 and max
    public void printEven(int max){
        for(int i = 1; i <= max; i++){
            if (i % 2 == 1){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //findNum method, finds a number that is divisible by the factor parameter between the minimum and maximum value
    public int findNum(int min, int max, int factor){
        int number = -1;
        for (int i = min; i <= max; i++){
            if (i % factor == 0){
                number = i;
                break;
            }
        }
        return number;
    }
}