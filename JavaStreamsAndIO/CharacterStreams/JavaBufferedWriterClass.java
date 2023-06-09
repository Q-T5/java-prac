package JavaStreamsAndIO.CharacterStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * JAVA BUFFERED WRITER CLASS
 * Package: java.io
 * Type: concrete class
 * Usage: used to write data in characters to a file more efficiently- provides an internal buffer of 8192 bytes
 * 
 * Extends the abstract class Writer
 * 
 * During the write operation, the characters are written to the buffer instead of directly to the file/ disk.
 * Once the buffer is filled or the writer is close, the whole character set in the buffer is written to the disk. This
 * reduces the number of trips to the disk, hence increases write efficiency
 * 
 * CONSTRUCTOR
 * The BufferedWriter needs to be connected to an object that knows how to write into files e.g
 * a FileWriter object, so using the constructor is a two-step process like this
 *      Step 1: FileWriter reader = new FileWriter(String file);
 *      Step 2: BufferedWriter buffer  = new BufferedWriter(reader);
 * This can be shortenned to a oneliner like this:
 *      BufferedWriter buffer = new BufferedWriter(new FileWriter(String path));
 * 
 * We can also change the default size of the buffer by providing a new Integer size to the constructor like this:
 *      BufferedWriter buffer = new BufferedWriter(new FileWriter(String path), Integer size);
 * 
 * METHODS
 * write()- writes a single character to the writer internal buffer
 * write(char[] array)- writes the charcaters from the specified array to the writer
 * write(String data)- writes the specified String to the writer
 * 
 * OTHER METHODS
 * flush()- clears the internal buffer forcing the writer to write all its content to the destination file
 * close()- close the buffered writer
 * newLine()- inserts a new line character
 * append()- inserts the specified character to the current writer
 * 
 * Example using a new output7.txt file
 */

public class JavaBufferedWriterClass {
    public static void main(String[] args) {
        String sentence = "Too much sauce";

        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter("JavaExpansionConcepts/OutputFiles/output7.txt"));

            //write the string to the file
            buffer.write(sentence);

            //close the buffer
            buffer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
