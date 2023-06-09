package JavaExpansionConcepts.JavaStrings;
/**
 * SUBSTRINGS
 * Are what we get when we slice a string
 * There are two methods to help us substring a String:
 *      1. public String substring(int startIndex)
 *      2. public String substring(int startIndex, int endIndex)
 * In both cases, startIndex is inclusive, while endIndex is exclusive
 * The other way to substring is to use the split() method that takes a RegEx as an argument
 * It is mostly used to create substrings from sentences and will not be covered here
 */

public class Substrings {
    public static void main(String[] args) {
        String s = "hello";
        //example using the substring(int startIndex) method
        System.out.println(s.substring(2)); //return llo as the substring

        //example using the substring(int startIndex, int endIndex) method
        System.out.println(s.substring(0, 2)); //returns 'he' as the substring
    }
}
