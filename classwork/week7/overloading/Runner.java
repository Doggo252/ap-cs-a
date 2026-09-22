public class Runner{
	public static void main(String[] args){
		// Instantiates two instances of overloaded using two different constructors with different parameter lists
		Overloaded p1 = new Overloaded(); //default constructor
		Overloaded p2 = new Overloaded(16, "John"); //initialization constructor
		
		// It prints the name and age for both objects then adds a newline
		p1.print();
		p2.print();
		System.out.println();
		
	    // changes both the instance variables of object p1, then prints them, then adds a newline
		p1.update("Ralph", 25);
		System.out.println();
		
		
        // changes only the age of p2 (instance variable) then prints its instance variables then adds a newline
		p2.update(5);
        System.out.println();

        // changes only the name of p2 (instance variable) then prints its instance variables then adds a newline
		p2.update("Henry");

        // it calls the different methods based on the parameters that are passed in
        // it can be a different number of parameters or different types (int, bool, string)
	}
}
