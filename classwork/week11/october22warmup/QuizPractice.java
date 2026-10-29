public class QuizPractice {
    //factorial of a number
    public int factorial(int num){
        int i = num;
        int answer = num;
        while (i>1){
            answer *= i; 
            i--;
        }
        return answer;
    }
    //counts up by 5 to max
    public void countUpBy5(int max){
        int num = 5;
        do{
            System.out.print(num + " ");
            num += 5;
        }while (num <= max);
        System.out.println();
    }
}