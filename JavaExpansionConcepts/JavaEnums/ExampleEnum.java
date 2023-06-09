package JavaExpansionConcepts.JavaEnums;
/**
 * JAVA ENUMS
 * Enum is short for enumeration (to list). An enum is a type that has a fixed set of constant
 * values.
 * We use the 'enum' keyword to declare enums e.g
 * enum Size {SMALL, MEDIUM, LARGE, EXTRALARGE}
 * 
 * 
 * THINGS TO NOTE
 * An enum is like a class(type), so the name of the enum starts with capital
 * The values inside the enum (between the {}) are called enum constants/ values and are usually
 * capitalized, and are accessed as if they are static properties
 * 
 * WHY ENUMS
 * Enums were created to replace the use of int constants, thus providing compile time safety
 * Here is an example
 */

 enum SizeB2 { SMALL, MEDIUM, LARGE, EXTRALARGE; }
/**
 * CREATING VARIABLES OF ENUM TYPES
 * We can create variables of type enum.
 * Again, enum is just like a class, so the variable is declared just the same way you create
 * instances of a class
 */

public class ExampleEnum {
    public static void main(String[] args) {
        System.out.println(SizeB2.EXTRALARGE);
        System.out.println(SizeB2.SMALL);

        //variable of the type enum
        //note that the cariable can only hold 4 values- total listed in the enum
        //they are also muttable
        SizeB2 pizzaSize;
        pizzaSize = SizeB2.SMALL;
        pizzaSize = SizeB2.EXTRALARGE;
        pizzaSize = SizeB2.MEDIUM;
        pizzaSize = SizeB2.LARGE;

        System.out.println(pizzaSize);
    }
}
