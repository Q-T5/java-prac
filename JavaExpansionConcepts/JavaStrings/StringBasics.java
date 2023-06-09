package JavaExpansionConcepts.JavaStrings;
/**
 * STRINGS
 * A String is an object that represents sequence of char values.
 * The String class has methods to help manipulate Strings- e.g. build char arrays out of Strings.
 * 
 * HOW TO CREATE STRINGS
 *      1. By String literal- literaly typing the string
 *      2. By using the new keyword- creating a new object of String type
 * Strings are immutable- unmodifiable/ unchangeable once created
 */

public class StringBasics {
    public static void main(String[] args) {
        //creating a String from a sequence of chars
        char[] ch = {'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};
        String s = new String(ch);
        System.out.println(s);

        //creating a String the literal way
        /**
         * When you create a string literal, Java checks the 'string constant pool' first.
         * NB: Litearal Strings live in a special memory area called the 'string constant pool'
         * If that string already exists in the pool, a refference to the pool instance is returned- this helps save on memory.
         * If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
         */
        String str = "welcome";
        System.out.println(str);

        //creating strings using the NEW keyword
        /**
         * In this case, Java will create a new string in the normal(non-pool) heap memory.
         * So string literrals and strings created using the 'new' keyword exist in different memory locations.
         */
        String str2 = new String("Welcome");
        System.out.println(str2);
    }
}
