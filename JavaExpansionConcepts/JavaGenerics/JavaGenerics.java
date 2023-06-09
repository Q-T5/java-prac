package JavaExpansionConcepts.JavaGenerics;
/**
 * JAVA GENERICS
 * Generics allow us to create a single class, interface or method that can be used with different types
 * of data (objects).
 * This helps us in code reusabillity.
 * Generics do not work with primitive types e.g int, float etc.
 * Here is an example of a generic class:
 */

class GenericsClass<T> { //the 'T' is called a type parameter, and can be any type that isn't primitive
    //variable of type T
    private T data; //for example if T above is Integer, the T here will be replaced by Integer

    public GenericsClass(T data) { //same as this T
        this.data = data;
    }

    //method that returns T type variable
    public T getData() { //and this T
        return this.data;
    }
}

public class JavaGenerics {
    public static void main(String[] args) {
        //initialize Generic class with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<Integer>(5);
        System.out.println("Generic class returns: " + intObj.getData());

        //initialize Generic class with String data
        GenericsClass<String> stringObj = new GenericsClass<String>("Martin");
        System.out.println("Generic class returns: " + stringObj.getData());

        //initialize Generic class with Float data
        GenericsClass<Float> floatObj = new GenericsClass<Float>(32.4F);
        System.out.println("Generic class returns: " + floatObj.getData());
    }
}
