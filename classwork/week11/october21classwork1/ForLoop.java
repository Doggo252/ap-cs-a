// Replace each question with a comment that describes what the code is doing.
public class ForLoop{
	public void test1(){
		//i starts at zero, prints up to 9 incrementing by one
		System.out.println("\n\nTest1");
		for(int i=0; i < 10; i++){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test2(){
		//i starts at 15 and counts down to 3 decreasing by 1
		System.out.println("\n\nTest2");
		for(int i=15; i > 2; i--){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test3(int max){
		//given a maximum value, it will count form zero all the way to max in increments of five
		System.out.println("\n\nTest3");
		for(int i=0; i <= max; i+=5){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test4(int min, int max){
		//counts from max to min decreasing by two each time (min is exclusive)
		System.out.println("\n\nTest4");
		for(int i=max; i > min; i-=2){
			System.out.print(i + " ");
		}
	System.out.println();
	}
	
	//it makes sense to use for loops when you are doing a repeated action for a set number of times instead of based on a condition

}