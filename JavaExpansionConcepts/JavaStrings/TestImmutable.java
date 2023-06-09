package JavaExpansionConcepts.JavaStrings;
/**
 * STRINGS ARE IMMUTABLE
 * Once created, their values cannot be changed.
 * They are designed to be immutable, because if one refference variable changes the value of an object, it will affect all the other refference variables.
 * Here is an example.
 */

public class TestImmutable {
    public static void main(String[] args) {
        //example of string immutability
        String s = "Martin";
        s.concat("Bikathi"); //concat() method appends the string to the end
                            //rather than append, a new object with Martin Bikathi will bre created in the SCP

        System.out.println(s); //will print Martin because strings are immutable

        //instead of being concatenated to s, the 'Martin Bikathi' string is added to the string constant pool
        //the refference s thus points to 'Martin' and not to 'Martin Bikathi'
        //if we explicitly assign it to the refference variable, it will refer to Martin Bikathi
        String b = "Martin";
        b = b.concat(" Bikathi");
        System.out.println(b);
    }
}
