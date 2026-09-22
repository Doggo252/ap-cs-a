public class Runner{
    public static void main(String[] args){
	    //initialize using both constructors
        Profile p1 = new Profile();
        Profile p2 = new Profile("Jennifer", 16);
	    //print the info
        p1.printInfo(1234);
        p2.printInfo(4321);
    }
}
