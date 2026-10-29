public class Runner{
    public static void main(String[] args) {
        int total = 0;
        //runs twice
        for(int r = 0; r < 2; r++){
            //runs once
            for(int c  = 1; c < 2; c++){
                total += 2;
            }
        }
        //outer loop runs twice, inner loop runs once, so two times adding 2 outputs four
        System.out.println(total);
    }
}