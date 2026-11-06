public class ArrayDemo{
    public static void main(String[] args) {
        //demo 1 -- 5 length integer array with random numbers, no for loop
        System.out.println("Demo 1:");
        int[] demo1 = new int[5];
        demo1[0] = (int) (Math.random() * 20 + 1);
        demo1[1] = (int) (Math.random() * 20 + 1);
        demo1[2] = (int) (Math.random() * 20 + 1);
        demo1[3] = (int) (Math.random() * 20 + 1);
        demo1[4] = (int) (Math.random() * 20 + 1);
        System.out.print(demo1[0] + " ");
        System.out.print(demo1[1] + " ");
        System.out.print(demo1[2] + " ");
        System.out.print(demo1[3] + " ");
        System.out.print(demo1[4] + " ");

        
        //same thing, but this time a length of 25 and using for loops
        System.out.println("\n\nDemo 2:");
        int[] demo2 = new int[25];
        for(int index = 0; index < demo2.length; index ++){
            demo2[index] = (int) (Math.random() * 9 + 1);
        }
        for(int index = 0; index < demo2.length; index ++){
            System.out.print(demo2[index] + " ");
        }

        //demo 3 -- string array with for loops
        System.out.println("\n\nDemo 3:");
        String[] demo3 = {"Potato", "Whiteboard", "Antidisestablishmentarianism", "Cat", "Mason"};

        int index = 0;
        while (index < demo3.length){
            System.out.println(demo3[index]);
            index++;
        }
    }
}