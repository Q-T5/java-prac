package JavaExpansionConcepts.JavaEnums;
/**
 * ENUM CLASS IN JAVA
 * In Java, enum types are considered to be a special type of class, as of Java 5.
 * An enum class can have methods and fields just like regular classes.
 * 
 * Here is an example
 */

enum Sizes {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize() {
        //'this' will refer to the object small
        switch(this) {
            case SMALL:
                return "small";

            case MEDIUM:
                return "medium";

            case LARGE:
                return "large";

            case EXTRALARGE:
                return "extra large";

            default:
                return null;
        }
    }
}

public class TheEnumClass {
    public static void main(String[] args) {
        //call getSize() using the object SMALL
        System.out.println("The size of the pizza is: " + Sizes.SMALL.getSize());
    }
}
