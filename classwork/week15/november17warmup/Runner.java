public class Runner{
    public static void main(String[] args){
        //instantiate quizPractice and call all its methods
        QuizPractice arrObj = new QuizPractice(5);
        arrObj.print();
        int even = arrObj.getEven();
        if (even == -1){
            System.out.println("There was no even number in the array.");
        }
        else{
            System.out.println("The last even number in the array is "+ even + ".");
        }
    }
}