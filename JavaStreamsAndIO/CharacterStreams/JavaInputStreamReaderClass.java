package JavaStreamsAndIO.CharacterStreams;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * JAVA INPUT STREAM READER
 * Package: java.io
 * Type: concrete class
 * Use: used to convert data in bytes into data in characters
 * 
 * Extends the abstract class Reader
 * It is designed to work with other input streams so is thought of as a 'bridge' between byte streams and character
 * streams. This is because it reads bytes from the input streams as characters
 *
 * CONSTRUCTORS
 * Its constructor needs to be attached/ chained to a FileInputStream as a way of connecting to a File
 *      FileInputStream file = new FileInputStream(String path);
 *      InputStreamReader input = new InputStreamReader(file);
 * This can also be shortenned to a one-liner like this:
 *      InputStreamReader input = new InputStreamReader(new FileInputStream(String path));
 * 
 * NOTE: the data in the file is stored using some default character encoding, but we can specify the type of character
 * encoding e.g UTF8 or UTF16 as well like this:
 *      InputStreamReader input = new InputStreamReader(file, Charset cs);
 * 
 * METHODS
 * read()- reads a single character from the reader
 * read(char[] array)- reads the characters from the reader and stores in the specified array
 * read(char[] array, int start, int length)- reads the number of characters equal to 'length' from the reader and stores
 * in the specified array starting from the 'start'
 * 
 * OTHER METHODS
 * close()- close the input stream reader
 * ready()- checks if the stream is ready to be read
 * reset()- returns control to the point in the stream where the mark was set
 * 
 * Example using the input.txt file
 * 
 */

public class JavaInputStreamReaderClass {
    public static void main(String[] args) {
        //create an array of characters
        char[] array = new char[100];

        //create an InputStreamReader
        try {
            InputStreamReader input = new InputStreamReader(new FileInputStream("JavaExpansionConcepts/OutputFiles/input.txt"));

            //reads the characters from the file
            input.read(array);
            System.out.print("Data in the stream: ");
            System.out.println(array);

            //close the reader
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * The getEncoding() method
         * Can be used to get the type of encoding that was used to store data from the input stream
         * 
         * Note that the Charset class is part of the nio package- java.nio
         * Example
         */

        try {
            //create an input stream reader with default encpding
            InputStreamReader input = new InputStreamReader(new FileInputStream("JavaExpansionConcepts/OutputFiles/input.txt"));

            //create an input stream reader specifying the encoding
            InputStreamReader input2 = new InputStreamReader(new FileInputStream("JavaExpansionConcepts/OutputFiles/input.txt"), Charset.forName("UTF16"));

            //return the character encoding of the input stream
            System.out.println("Character encoding of input1: " + input.getEncoding());
            System.out.println("Character encoding of input2: " + input2.getEncoding());

            input.close();
            input2.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
