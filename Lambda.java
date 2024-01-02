import java.util.Comparator;

public class Lambda {
    public static void main(String[] args){

        //lambda : anonymous function having no name, no modifier, no return type
        //can be passed as argument to functions
        //functional interfaces are implemented using lambda
        //lambda enabled functional programming in java
        // APIs like stream and collections can be used effectively

        // functional interface : contains only one abstract method
        // ex: Runnable, Callable, Comparable, etc

        // interfaces do not have objects
        Runnable r = () -> {}; // object created here is of child anonymous class
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(()->System.out.print("inside thread run"));

    }
}
