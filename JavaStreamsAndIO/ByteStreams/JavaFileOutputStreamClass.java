package JavaStreamsAndIO.ByteStreams;

import java.io.FileOutputStream;

/**
 * JAVA OUTPUT STREAM CLASS
 * Package: java.io
 * Type: concrete class
 * Use: used to write data IN BYTES to a target file
 * 
 * CONSTRUCTORS
 * The class has three prevalent constructors
 *      1. FileOutputStream(String path, Boolean value)- path to a file and a boolean value indicating(if true) whether to
 *      append data to end of the one already in a file, or (if false) to overwrite the existing data
 *      2. FileOutputStream(String path)- without the boolean value
 *      3. FileOutputStream(File fileObject)- link it to a File object 
 * 
 * METHODS- the core method is an overloaded write() method
 * write()- writes the single byte to the target file
 * write(byte[] array)- writes the bytes from the specified array to the output stream
 * write(byte[] array, int start, int length)- writes the number of bytes equal to 'length' to the output stream from an 
 * array starting from the position start
 * 
 * OTHER METHODS
 * close()- used to close the output stream once we're done using it
 * finalize()- ensures that the close() method is called
 * getChannel()- returns the object of FileChannel associated with the output
 * getFD()- returns the file descriptor associated with the output stream
 * 
 * Example creating an output stream using FileOutputStream:
 */

public class JavaFileOutputStreamClass {
    public static void main(String[] args) {
        String data = "Transformers is the best movie ever written.\n";

        try {
            FileOutputStream output = new FileOutputStream("JavaExpansionConcepts/OutputFiles/movies.txt");

            byte[] array = data.getBytes();
            
            //write the byte array to the target file
            output.write(array);
            
            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        String data2 = "The second best movie ever written in Home 2015\n";
        try {
            FileOutputStream output = new FileOutputStream("JavaExpansionConcepts/OutputFiles/movies.txt", true);

            byte[] array2 = data2.getBytes();

            output.write(array2);
            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        /**
         * THE flush() METHOD
         * Is used to clear the output stream, forcing it to write all data to the destination
         */

        FileOutputStream out = null;
        String data3 = "The third best movie ever written is Maleficent";

        try {
            out = new FileOutputStream("JavaExpansionConcepts/OutputFiles/movies.txt", true);

            //using the write method
            out.write(data3.getBytes());

            //using the flush() method
            out.flush();
            out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
