public class ArrayTest{
    //instance variables
    private int[] numArr;

    //constructor to set the length of array and generate random numbers
    public ArrayTest(int length){
        numArr = new int[length];

        for (int i = 0; i < numArr.length; i++){
            numArr[i] = (int) (Math.random() * 9 + 1);
        }
    }

    //prints out all the elements of the array
    public void printArr(){
        System.out.print("The " + numArr.length + " elements are: ");
        for (int i = 0; i < numArr.length; i++){
            if (numArr.length - i == 1){
                System.out.print("and " + numArr[i] + ".");
            }
            else{
                System.out.print(numArr[i] + ", ");
            }
        }
        System.out.println();
    }

    //finds the sum of the array and returns it
    public int getSum(){
        int sum = 0;
        for (int i = 0; i < numArr.length; i++){
            sum += numArr[i];
        }
        return sum;
    }
}