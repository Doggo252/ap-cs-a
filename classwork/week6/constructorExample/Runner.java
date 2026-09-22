public class Runner {
	public static void main(String args[]) {
        //Comment: instantiates animal 1 using default constructor (5 year old dog)
		Animal animal1 = new Animal();
        //Comment: instantiates animal 2 using initialization constructor and creates a 7 year old cat
		Animal animal2 = new Animal("cat", 7);
        //Comment: instantiates animal 3 using initialization constructor and creates a 2 year old goat
		Animal animal3 = new Animal("goat", 2);
		//Comment: instantiates animal 4 using new initialization constructor and creates a 2 year old rabbit named Bob
		Animal animal4 = new Animal("rabbit", 2, "Bob");

        //Comment: calls print info using animal 1's info
		animal1.printInfo();


        //Comment: sets animal 2's name to Roco then prints the info
		animal2.setName("Roco");
		animal2.printInfo();


        //Comment: sets animal 3's name to Fluffy then prints the info
		animal3.setName("Fluffy");
		animal3.printInfo();

        //Comment: prints animal 4's info
        animal4.printInfo();
	}
}
