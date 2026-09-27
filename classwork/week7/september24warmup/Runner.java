public class Runner{
    public static void main(String[] args){
        //instantiate two objects and use calcArea() on both of them
        Rect obj1 = new Rect();
        obj1.calcArea();
        Rect obj2 = new Rect(5, 2);
        obj2.calcArea();
    }
}
