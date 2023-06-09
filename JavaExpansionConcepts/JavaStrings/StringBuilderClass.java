package JavaExpansionConcepts.JavaStrings;
/**
 * STRING BUILDER
 * It is used to create mutable (modifiable) strings.
 * This class is the same as the StringBuffer class, except that it is non-synchronized.
 * It was introduced in Java 1.5(Java 5)
 * It has the same constructors and most of the same methods as the StringBuffer class.
 * It is more efficient than StringBuffer since there is no delays caused by thread safety,
 */

public class StringBuilderClass {
    public static void main(String[] args) {
        //here is an example use case of the append() method- used for concatenation
        StringBuilder str = new StringBuilder("Martin");
        str.append(" Bikathi");
        System.out.println(str);
    }
}
