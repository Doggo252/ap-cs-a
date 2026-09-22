public class Runner{
    //runs cat, dog, and chicken class and all of their methods
	public static void main(String[] args){
        //instantiates all of the classes
		Chicken chicken = new Chicken();
        Dog dog = new Dog();
        Cat cat = new Cat();

        //chicken speak three times
		chicken.speak();
		chicken.speak();
		chicken.speak();

        //dog methods
        dog.sayName();
        dog.speak();
        dog.emoji();

        //cat methods
        cat.sayName();
        cat.speak();
        cat.emoji();
 	}	
}