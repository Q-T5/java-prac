package JavaRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * REGULAR EXPRESSION EXAMPLE 
 * We will be searching for any occurence of 'Martin' in a sentence
 */

public class RegExExample {
    public static void main(String[] args) {
        //first we create the pattern we're searching for using the compile() method
        //the first parameter is the pattern being searched for
        //the second is a flag indicating that the search should be case insensitive- it's optional
        Pattern pattern = Pattern.compile("Martin", Pattern.CASE_INSENSITIVE);

        //the matcher() method is used to search for the pattern in a String
        //it returns a Matcher object which contains information about the search that was performed
        Matcher matcher = pattern.matcher("My name is Martin, not martin.");

        //the find() method returns a boolean indicating whether a match was found in the String or not
        Boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found.");
        } else {
            System.out.println("Match not found.");
        }
    }
}
