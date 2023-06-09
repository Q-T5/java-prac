package JavaExpansionConcepts.JavaStrings;
/**
 * STRING CONCATENATION
 * This forms a new String that is a combination of multiple Strings
 * There are two ways of concatinating string in Java
 *      1. Using the '+' operator (concatenation operator)
 *      2. Using the concat() method
 */

public class StringConcatenation {
    public static void main(String[] args) {
        //using the + operator- example
        /**
         * This operator will assume that primitive numbers are also strings (only if they appear AFTER a string literall)
         */
        String s = "Martin" + " Bikathi";
        System.out.println(s);
        String j = 80 + 80 + " Martin" + " Bikathi " + 110; //the '80 + 80' is actual math
        System.out.println(j);

        //using the concat method
        /**
         * It concatenates the specified string to the end of the current string
         */
        String s1 = "Martin";
        String s2 = " Bikathi";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
