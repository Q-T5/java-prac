package JavaExpansionConcepts;

/**
 * METHOD OVERLOADING
 * When ONE class has multiple methods with the same name, we call this method overloading
 * This helps improve readability of the program
 * There are two ways to overload a method in Java:
 *      1.by changing number of arguments
 *      2.by changing data type of the arguments- which may cause a change in method return type
 * 
 * NB: Changing only the method return type is NOT a way of overloading because it leads
 *     to ambiguity- the compiler does not know what method to call
 * The main() method can also be overloaded, although the one with String array args will always be called. 
 */
class Adder {
    //overloading by changing number of arguments
    static public int add(int a, int b) { return a + b; }
    static public int add(int a, int b, int c) { return a + b + c; }
}

class Subtractor {
    //overloading by changing data type of arguments (usually just called 'data type')
    //this MAY cause the return type of the method to change too
    static int sub(int a, int b) { return a - b; }
    static float sub(float a, float b) { return a - b; }
}

public class MethodOverloading {
    public static void main(String[] args) {
        //call the overloaded 'add' methods in the Adder class
        System.out.println(Adder.add(20, 30));
        System.out.println(Adder.add(20, 30, 40));

        //call the overloaded 'sub' methods in the Subtractor class
        System.out.println(Subtractor.sub(1.3f, 23.4f));
        System.out.println(Subtractor.sub(30, 45));
    }
}
