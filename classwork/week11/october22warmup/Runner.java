public class Runner{
    public static void main(String[] args){
        //instantiate qp and call its methods
        QuizPractice qp = new QuizPractice();
        int result = qp.factorial(10);
        System.out.println("The factorial of 10 is " + result + ".");
        qp.countUpBy5(50);
        qp.countUpBy5(68);
    }
}