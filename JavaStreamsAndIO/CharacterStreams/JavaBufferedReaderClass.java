package JavaStreamsAndIO.CharacterStreams;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * JAVA BUFFERED READER CLASS
 * Package: java.io
 * Type: concrete class
 * Usage: used to read data in characters from a file more efficiently
 * 
 * Extends the abstract class Reader
 * It provides an internal buffer of 8192 bytes into which during a read operation, chunks of data
 * are read from the disk and stored in the buffer, then from the buffer, characters are read individually, thus
 * reducing trips to the disk and making the read process faster.
 * 
 * CONSTRUCTOR
 * The BufferedReader needs to be connected to an object that knows how to read from files e.g
 * a FileReader object, so using the constructor is a two-step process like this
 *      Step 1: FileReader reader = new FileReader(String file);
 *      Step 2: BufferedReader buffer  = new BufferedReader(reader);
 * This can be shortenned to a oneliner like this:
 *      BufferedReader buffer = new BufferedReader(new FileReader(String path));
 * 
 * We can also change the default size of the buffer by providing a new Integer size to the constructor like this:
 *      BufferedReader buffer = new BufferedReader(new FileReader(String path), Integer size);
 * 
 * METHODS
 * read()- read a single character from the internal buffer of the reader
 * read(char[] array)- reads the characters from the reader buffer and stores in the specified array
 * read(char[] array, int start, int length)- reads the number of characters equal to 'length' from the reader and stores
 * in the specified array starting from the 'start'
 * 
 * OTHER METHODS
 * skip()- discard or specify the mentioned number of bytes
 * close()- close the buffered reader
 * ready()- checks if the file reader is ready to be read
 * mark()- mark the position in file reader up to which data has been read
 * reset()- returns control to the point in the reader where the mark was set
 * 
 * 
 * Example using the input.txt file
 */

public class JavaBufferedReaderClass {
    public static void main(String[] args) {
        //create an array of characters
        char[] array = new char[100];

        try {
            //create a BufferedReader
            BufferedReader buffer = new BufferedReader(new FileReader("JavaExpansionConcepts/OutputFiles/input.txt"));

            //read the characters
            buffer.read(array);
            System.out.print("Data in the file: ");
            System.out.println(array);

            //close the buffer
            buffer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
