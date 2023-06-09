package JavaExpansionConcepts.JavaGenerics;
/**
 * GENERIC METHODS
 * Like generic classes, generic methods are designed to work with any data type
 * Here is an example:
 */

class Demo {
    //create a generic method
    public <T> void  genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data passed: " + data);
    }
}

public class GenericMethods {
    public static void main(String[] args) {
        //initialize the method with Integer type
        Demo demo = new Demo();
        demo.<Integer>genericsMethod(45);

        //initialize the method with String type
        demo.<String>genericsMethod("Martin");

        //we can call the generic method without including the type parameter
        demo.genericsMethod(45.44f);

        //initialize the generic method with a Character type
        demo.<Character>genericsMethod('s');
    }
}
