package JavaStreamsAndIO.ByteStreams;

import java.io.ByteArrayInputStream;

/**
 * JAVA BYTE ARRAY INPUT STREAM CLASS
 * Package: java.io
 * Type: concrete class
 * Use: used to read an array of input data in bytes
 * Extends from the InputStream class
 * 
 * NOTE: In ByteArrayInputStream, the input stream is created using the array of bytes. It includes and internal array
 * to store data of that particular byte array
 * 
 * CONSTRUCTORS
 * The two prevalent constructors are as follows:
 *      1. ByteArrayInputStream(byte[] arr)- an input stream that reads entire data from the arr array
 *      2. ByteArrayInputStream(byte[] arr, int start, int len)- an input stream that reads only some data from the array,
 *      equal to 'length' and starting from the 'start' position
 * 
 * METHODS- the core method is an overloaded read() method
 * read()- reads a single byte from the array present in the input stream
 * read(byte[] array)- reads bytes from the input stream and stores in the specified array
 * read(byte[] array, int start, int length)- reads the number of bytes equal to 'length' and stores in the specified array
 * starting from the position start
 * 
 * OTHER METHODS
 * close()- used to close the input stream
 * finalize()- ensures that the close() method is called
 * mark()- marks the position in the input stream up to which data has been read
 * reset()- returns control to the point in the input stream where the mark was set
 * markSupported()- checks if the input stream supports mark() and supported()
 * 
 * Example using ByteArrayInputStream
 */

public class JavaByteArrayInputStreamClass {
    public static void main(String[] args) {
        //create an array of bytes
        byte[] array = { 1, 2, 3, 4, 5 };

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            System.out.println("The bytes read from the input stream: ");

            for(int i = 0; i < array.length; i++) {
                //read the bytes
                int data = input.read();
                System.out.print(data + ", ");
            } 
            
            System.out.println("\n");
            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        /**
         * THE available() method
         * Used to get the number of available bytes in the input stream
         * Example
         */

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            //returns the available number of bytes
            System.out.println("Avaiable bytes at the beginning: " + input.available());

            //read two bytes from the stream
            input.read();
            input.read();

            //the return th number of bytes
            System.out.println("Available number of bytes at the end: " + input.available());

            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        /**
         * THE skip() METHOD
         * To discard/ skip the specified number of bytes, we can use the skip() method
         * Example:
         */

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            //use the skip method
            input.skip(2);
            System.out.println("Input stream after skipping 2 bytes: ");

            int data = input.read();
            while(data != -1) {
                System.out.print(data + ", ");
                data = input.read();
            }

            System.out.println("\n");
            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
