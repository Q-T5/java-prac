package JavaStreamsAndIO.ByteStreams;

import java.io.FileInputStream;
import java.io.InputStream;
/**
 * JAVA INPUT STREAM CLASS
 * Package: java.io
 * Type: abstract superclass- so must be extended by sub-classes
 * Use: represents an input stream of bytes
 * 
 * Subclasses include: FileInputStream, ByteArrayInputStream, ObjectInputStream
 * 
 * METHODS
 * read()- reads one byte of data from the input stream
 * read(byte[] array)- reads bytes from the stream and stores in the specified array
 * available()- returns the number of bytes available in the input stream
 * mark()- marks the position in the input stream up to which the data has been read
 * reset()- return the control to the point in the stream where the mark was set
 * markSupported()- checks if the mark() and reset() method is supported in the stream
 * skips()- skips and discards the specified number of bytes from the input stream
 * close()- closes the input stream
 * 
 * Example creating an input stream using FileInputStream:
 */

public class JavaInputStreamClass {
    public static void main(String[] args) {
        byte[] array = new byte[100];

        try {
            //we first import the java.io.InputStream package then build a new subclass object of it
            InputStream input = new FileInputStream("JavaExpansionConcepts/OutputFiles/input.txt");
            System.out.println("Available bytes in the file: " + input.available()); //1 character = 1 byte (8 bits), including \n 

            //read byte from the input stream
            input.read(array);
            System.out.print("Data read from the file: ");

            //convert byte array to String
            String data = new String(array);
            System.out.println(data);

            //close the input stream
            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
