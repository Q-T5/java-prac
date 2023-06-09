package JavaStreamsAndIO.ByteStreams;

import java.io.FileInputStream;

/**
 * JAVA FILE INPUT STREAM CLASS
 * Package: java.io
 * Type: concrete class that extends the InputStream class
 * Use: to read data IN BYTES from source files
 * 
 * USAGE
 * The defacto constructors must have one of two things:
 *      1. stringPath- a path to the source file- including the file extension
 *      2. File fileObject- an input stream that's linked to file via a File object- see the 'Files' for tutorials
 * 
 * METHODS- the core method is an overloaded read() method
 * read()- reads a single byte from the file.
 * read(byte[] array)- reads the bytes from the file and stores in the specified array
 * read(byte[] array, int start, int length)- reads the number of bytes equal to 'length' from the file and stores in the
 * specified array starting from position 'start'
 * 
 * OTHER METHODS
 * close()- closes the FIS
 * finalize()- ensures that the FIS is closed i.e that the close() method is called
 * getChannel()- returns an object of FileChannel associated with the input stream
 * getFD()- returns the file descriptor associated with the input stream
 * mark()- mark the position in the input stream up to which data has been read
 * reset()- reset the control to the point in the input stream where the mark was set
 * 
 * Example using the FileInputStream. Note that the type can also be the super abstract class InputStream
 */

public class JavaFileInputStreamClass {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("JavaExpansionConcepts/OutputFiles/input.txt");

            System.out.println("Data in the file: ");
            
            //read the first byte
            int i = input.read(); //because a byte is just an integer number anyway

            while(i != -1) { //when there's nothing more to read, it (the FIS) returns a -1
                System.out.print((char)i);

                //read the next byte from the file
                i = input.read();
            }

            System.out.println();
            input.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        /**
         * THE available() method
         * Returns the number of available bytes
         * 
         * Example
         */
        try {
            FileInputStream input = new FileInputStream("JavaExpansionConcepts/OutputFiles/input.txt");

            //return the number of available bytes
            System.out.println("Available bytes at the beginning: " + input.available());

            //read three bytes from the file
            System.out.print((char)input.read());
            System.out.print((char)input.read());
            System.out.print((char)input.read() + "\n");

            //return the number of available bytes
            System.out.println("Available bytes at the end: " + input.available());

            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        /**
         * THE skip() method
         * To skip/ discard the specified number of bytes, we can use the skip() method
         * 
         * Example
         */
        try {
            FileInputStream input = new FileInputStream("JavaExpansionConcepts/OutputFiles/input.txt");

            //skip the first 5 bytes
            input.skip(5);

            System.out.println("Input stream after skipping 5 bytes: ");

            //read the first byte
            int i = input.read();

            while(i != -1) {
                System.out.print((char)i);

                //read the next byte from the file
                i = input.read();
            }

            //close() method
            input.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
