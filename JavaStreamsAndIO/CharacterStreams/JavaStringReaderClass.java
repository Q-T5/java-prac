package JavaStreamsAndIO.CharacterStreams;

import java.io.StringReader;

/**
 * JAVA STRING READER
 * Package: java.io
 * Type: concrete class
 * Usage: used to write data in characters from Strings
 * 
 * Extends the abstract class Reader
 * 
 * NOTE: In StringReader, the specified String acts as a source from where characters are read individually
 * 
 * CONSTRUCTOR
 * Its constructor expects a String as its argument like this:
 *      StringReader reader = new StringReader(String data);
 * 
 * METHODS
 * read()- read a single character from the string reader
 * read(char[] array)- reads the characters from the reader and stores in the specified array
 * read(char[] array, int start, int length)- reads the number of characters equal to 'length' from the reader and stores
 * in the specified array starting from the 'start'
 * 
 * OTHER METHODS
 * skip()- specify the number of characters you want to skip
 * close()- close the string reader
 * ready()- checks if the string reader is ready to be read
 * mark()- mark the position in file reader up to which data has been read
 * reset()- returns control to the point in the reader where the mark was set
 * Example
 */

public class JavaStringReaderClass {
    public static void main(String[] args) {
        String data = "Kittens make me happy.";
        char[] array = new char[100];

        try {
            //create a String reader
            StringReader reader = new StringReader(data);

            //use the read() method
            reader.read(array);
            System.out.print("Data in the String: ");
            System.out.println(array);

            reader.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
