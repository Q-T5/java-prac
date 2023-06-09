package JavaStreamsAndIO.CharacterStreams;

import java.io.FileReader;
import java.io.Reader;

/**
 * JAVA READER CLASS
 * Package: java.io
 * Type: abstract superclass- which means it must be extended by a subclass
 * Use: represents a stream of Characters
 * 
 * Subclasses include: BufferedReader, InputStreamReader, FileReader, StringReader
 * 
 * CONSTRUCTOR
 * Its constructor cannot be initialized because it is abstract, but you can use one of it's subclasses e.g
 *      Reader input = new FileReader();
 * 
 * METHODS
 * ready()- checks if the reader is ready to be read
 * ready(char[] array)- reads the characters from the stream and stores in the specified array
 * read(char[] array, int start, int length)- reads the number of characters equal to 'length' from the stream and stpres into 
 * the specified array starting from the 'start'
 * mark()- marks the position in the stream upt to which data has been read
 * reset()- returns control to the point in the stream where the mark is set
 * skip()- discards the specified number of characters from the stream
 * 
 * Example using FileReader, with the input.txt file as source
 */

public class JavaReaderClass {
    public static void main(String[] args) {
        char[] array = new char[100];

        try {
            //creates a reader using the FileReader
            Reader input = new FileReader("JavaExpansionConcepts/OutputFiles/input.txt");

            //checks if the reader is ready
            System.out.println("Is there data in the stream? " + input.ready());

            //reads characters
            input.read(array);

            System.out.print("Data in the stream: ");
            System.out.println(array);

            //close the reader
            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
