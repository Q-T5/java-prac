package JavaStreamsAndIO.ByteStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * JAVA BUFFERED INPUT STREAM
 * Package: java.io
 * Type: concrete class
 * Usage: increases the data of reading BYTE data by adding an internal buffer memory of 8192 bytes
 * 
 * So a chunk of bytes is read from the disk and stored in the internal buffer, then from the buffer, bytes
 * are read individually.
 * This increases the speed of reading bytes as communication with the disk is reduced.
 * 
 * Extends the InputStream class
 * 
 * CONSTRUCTOR
 * Using the constructor is a two-step process, we need the BufferedInputStream itself, and a FileInputStream/ a
 * way to connect to the file into which to write the object
 * 
 *      Step 1. FileInputStream fileStream = new FileInputStream(String file);
 *      Step 2. BufferedInputStream buffer  =new BufferedInputStream(fileStream);
 * NB: This can be shortened to one line:
 *      BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(String file), int size);- size specifies the 
 *      size of the buffer you want
 * 
 * METHODS
 * read()- reads a single byte from the input stream
 * read(byte[] array)- reads bytes from the stream and stores in the specified array
 * read(byte[] array, int start, int length)- reads the number of bytes equal to the 'length' from the stream and stores in the
 * specified array starting from the position 'start'
 * 
 * OTHER METHODS
 * available()- check number of bytes available in the input stream
 * skip()- discard/ ignore a specified number of bytes
 * close()- close the input stream
 * mark()- mark the position in the input stream up to which data has been read
 * 
 * Example using out output1.txt
 */

public class JavaBufferedInputStreamClass {
    public static void main(String[] args) {
        try {
            BufferedInputStream input = new BufferedInputStream(new FileInputStream("JavaExpansionConcepts/OutputFiles/output1.txt"));

            //read the first byte from the file
            int i = input.read();

            while(i != -1) {
                System.out.print((char) i);
                //read next byte from the file
                i = input.read();
            }

            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
