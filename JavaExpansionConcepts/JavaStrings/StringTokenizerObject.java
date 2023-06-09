package JavaExpansionConcepts.JavaStrings;
import java.util.StringTokenizer;
/**
 * STRING TOKENIZER (java.util.StringTokenizer)
 * Allows you to break a String into tokens.
 * It however cannot help you differentiate between numbers, quoted strings, identifiers etc.
 * This class is however depracated and it is recommened to use the split() method of the String class
 * 
 * CONSTRUCTORS
 * It has three constructors:
 *      1. StringTokenizer(String str)- creates StringTokenizer with specified string.
 *      2. StringTokenizer(String str, String delim)- creates StringTokenizer with specified string and delimiter.
 *      3. StringTokenizer(String str, String delim, boolean returnValue)- if the return value is true, delimiter characters are considered to be tokens, else they serve to separate tokens.
 * 
 * METHODS
 * The class has six useful methods:
 *      1. boolean hasMoreTokens()- checks if there is more tokens available
 *      2. String nextToken()- returns the next token from the StringTokenizer object
 *      3. String nextToken(String delim)- returns the next toke based on the delimiter
 *      4. boolean hasMoreElements()- it is the same as hasMoreTokens() method
 *      5. Object nextElement()- same as nextToken() but its return type is Object
 *      6. int countTokens()- returns the total number of tokens
 */

public class StringTokenizerObject {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my name is martin", " ");

        //print each token in the object
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        //example of the nextToken(String delim) method
        StringTokenizer st2 = new StringTokenizer("my,name,is martin");
        System.out.println("Next token is: " + st2.nextToken(" "));
    }
}
