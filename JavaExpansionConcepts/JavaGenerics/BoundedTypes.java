package JavaExpansionConcepts.JavaGenerics;
/**
 * Generally, the 'T' can be any type that is not primitive
 * However, if we want to restrict it to accept specific types (e.g only data of number types only), we 
 * can use bounded types
 * In case of bounded types, we use the 'extends' keyword for example:
 *      <T extends A>, means T can only accept types that are subtypes of A
 * Here is an example
 */

class GenericsExample<T extends Number> {
    private T data;
    public void display() {
        System.out.println("This is a bounded type generics class.");
    }

    public GenericsExample(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}

public class BoundedTypes {
    public static void main(String[] args) {
        //create an object of GenericsClass
        GenericsExample<Integer> obj = new GenericsExample<Integer>(20);
        System.out.println(obj.getData());
    }
}
