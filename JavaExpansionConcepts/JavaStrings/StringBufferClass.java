package JavaExpansionConcepts.JavaStrings;
/**
 * STRING BUFFER
 * It is used to create Strings that are mutable(changeable)
 * It is like the String class, but creates mutable strings.
 * It existed since Java 1.0 (Java 1).
 * It has three main constructors:
 *      1. StringBuffer()- creates an empty String buffer with an init cap of 16
 *      2. StringBuffer(String str)- creates a StringBuffer with the specified string
 *      3. StringBuffer(int capacity)- creates an empty String buffer with the specified capacity as length
 * This class is synchronized(thread safe)- two threads can't call the methods of StringBuffer simultaneously.
 * Here are some important methods of this class:
 * 1. append(String s)- used to concatenate the argument String to the current string. Argument can be any data type i.e. method is overriden.
 * 2. insert(int offset, String s)- used to insert the provided string at the said position. It is overloaded to accept all other data types.
 * 3. replace(int startIndex, int stopIndex, String str)- used to replace the String from specified start position to end position
 * 4. delete(int startIndex, int endIndex)- used to delete string from start position to end position
 * 5. reverse()- used to reverse the String
 * 6. capacity()- used to return current capacity
 * 7. ensureCapacity(int minCapacity)- used to ensure the capacity is at least equal to the given minimum
 * 8. charAt(int index)- returns the character at a given index
 * 9. length()- return length of the String(total number of characters)
 * 10. substring(int beginIndex) / substring(int beginIndex, int stopIndex)- used to create substrings
 */

public class StringBufferClass {
    public static void main(String[] args) {
        //example use case of replace() method
        StringBuffer str = new StringBuffer("Martin");
        str.replace(1, 4, "BIM");
        System.out.println(str);

        //example of the reverse() method
        StringBuffer str2 = new StringBuffer("My name is Martin");
        StringBuffer str3 = new StringBuffer(str2.reverse());
        System.out.println(str3);
    }
}
