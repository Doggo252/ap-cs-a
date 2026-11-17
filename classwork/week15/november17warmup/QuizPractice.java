public class QuizPractice{
    //instance variables
    private int[] numArray;

    //constructor that initializes the array and fills it with random elements
    public QuizPractice(int size){
        numArray = new int[size];

        for (int i = 0; i < numArray.length; i++){
            numArray[i] = (int) (Math.random() * 9 + 1);
        }
    }

    //prints all the elements
    public void print(){
        for (int each : numArray){
            System.out.print(each + " ");
        }
        System.out.println();
    }

    //returns the last even number in the array
    public int getEven(){
        int even = -1;
        for (int each : numArray){
            if (each % 2 == 0){
                even = each;
            }
        }
        return even;
    }
}