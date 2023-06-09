package JavaStreamsAndIO.ByteStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * JAVA BUFFERED OUTPUT STREAM
 * Package: java.io
 * Type: concrete class
 * Usage: increases the data of writing BYTE data by adding an internal buffer memory of 8192 bytes
 * 
 * During the write operation, the bytes are written to the internal buffer instead of the disk. Once the buffer is filled,
 * or the stream is closed, the whole buffer is written to the disk.
 * This increases the speed of writing bytes as communication with the disk is reduced.
 * 
 * CONSTRUCTOR
 * Using the constructor is a two-step process, we need the BufferedOutputStream itself, and a FileOutpuStream/ a
 * way to connect to the file into which to write the object
 * 
 *      Step 1. FileOutputStream fileStream = new FileOutputStream(String file);
 *      Step 2. BufferedOutputStream buffer  =new BufferedOutputStream(fileStream);
 * NB: This can be shortened to one line:
 *      BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream(String file), int size);- size specifies the 
 *      size of the buffer you want
 * 
 * METHODS- the core method is an overloaded write() method
 * write()- writes the single byte to internal buffer of the output stream
 * write(byte[] array)- writes the bytes from the specified array to the output stream
 * write(byte[] array, int start, int length)- writes the number of bytes equal to 'length' to the output stream from an 
 * array starting from the position start
 * 
 * OTHER METHODS
 * close()- closed the output stream
 * 
 * Example
 */

public class JavaBufferedOutputStreamClass {
    public static void main(String[] args) {
        String data = "Java is the best programming language in the world.\n";
        String random = "This is a cat."; 
        try {
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("JavaExpansionConcepts/OutputFiles/output2.txt"));

            byte[] array = data.getBytes();

            //write the data to the output stream
            output.write(array);
            output.write(random.getBytes());

            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        /**
         * THE flush() METHOD
         * Used to clear the state of the internal buffer, forcing the output stream to write all data present in the buffer
         * to the destination file.
         * 
         * Example
        */

        String data2 = "Followed by Python.";
        try {
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("JavaExpansionConcepts/OutputFiles/output2.txt"));

            byte[] array = data2.getBytes();

            //write the data to the output stream
            output.write(array);

            //flush buffer to the destination
            output.flush();
            System.out.println("Data is flushed to the file.");

            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
