package JavaStreamsAndIO.ByteStreams;

import java.io.ByteArrayOutputStream;

/**
 * JAVA BYTE ARRAY OUTPUT STREAM
 * Package: java.io
 * Type: concrete class
 * Use: used to write an array of output data IN BYTES
 * 
 * Extends the OutputStream class
 * NOTE: The ByteArrayOutputStream maintains an internal array of bytes to store the data
 * 
 * CONSTRUCTORS
 * The two core constructors of this class are:
 *      1. ByteArrayOutputStream()- an output stream that will write data to an array of bytes with default size of 32 bytes
 *      2. ByteArrayOutputStream(Integer size)- change the default size/ length of the array
 * 
 * METHODS- the core method is an overloaded write() method
 * write(int byte)- write the specified byte to the output stream
 * write(byte[] array)- writes the bytes from the specified array to the output stream 
 * write(byte[] arr, int start, int length)- write the number of bytes equal to 'length' to the output stream from an array
 * starting from the position 'start'
 * writeTo(ByteArrayOutputStream out1)- writes the entire data of the the current output stream to the specified output 
 * 
 * OTHER METHODS
 * close()- close the output stream
 * size()- returns the size of the array in the output stream
 * flush()- clears the output stream
 */

public class JavaByteArrayOutputStreamClass {
    public static void main(String[] args) {
        String data = "The fourth best movie is Red";
        System.out.println("Size of String: " + data.length());

        try {
            //create an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = data.getBytes();

            //write data to the output stream
            out.write(array);
            System.out.println("Size of the output stream: " + out.size());

            //retrieve data from the output stream in String form
            String streamData = out.toString();
            System.out.println("Output stream: " + streamData);

            out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        /**
         * ACCESS DATA FROM THE BYTEARRAYOUTPUTSTREAM
         * toByteArray()- return the array present inside the output stream
         * toString()- return the entire data of the output stream in String form
         * 
         * Example
         */

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            //write data to the output stream
            out.write(data.getBytes());

            //return an array of bytes
            byte[] byteData = out.toByteArray();

            System.out.print("Data using toByteArray(): ");
            for(int i = 0; i < byteData.length; i++) {
                System.out.print((char)byteData[i]);
            }

            //returns a String
            String stringData = out.toString();
            System.out.println("\nData using toString(): " + stringData);

            out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
