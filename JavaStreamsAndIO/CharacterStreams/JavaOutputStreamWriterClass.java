package JavaStreamsAndIO.CharacterStreams;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * JAVA OUTPUT STREAM
 * Package: java.io
 * Type: concrete class
 * Use: used to convert data in bytes into data in characters
 * 
 * Extends the class Writer
 * It is designed to work with other output streams so is thought of as a 'bridge' between byte streams and character
 * streams. This is because it converts its characters into bytes
 * 
 * CONSTRUCTORS
 * Its constructor needs to be attached/ chained to a FileOutputStream as a way of connecting to a File
 *      FileOutputStream file = new FileOutputStream(String path);
 *      OutputStreamWriter output = new OutputStreamWriter(file);
 * This can also be shortenned to a one-liner like this:
 *      OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream(String path));
 * 
 * We can also specify the defualt character encoding we want like this:
 *      OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream(String path), Charset cs);
 * 
 * METHODS
 * write()- writes a single character to the writer
 * write(char[] array)- writes the charcaters from the specified array to the writer
 * write(String data)- writes the specified String to the writer
 * 
 * OTHER METHODS
 * getEncoding()- get the encoding that is used to write data to the output stream
 * close()- close the output stream
 * flush()- forces to write all the data present in the writer to the destination
 * append()- inserts the specified character to the current writer
 * 
 * Example using the output1.txt file
 */

public class JavaOutputStreamWriterClass {
    public static void main(String[] args) {
        String data = "This should be a line in this file\n";

        try {
            //create an OutputStreamWriter
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("JavaExpansionConcepts/OutputFiles/output1.txt", true));

            //write the String to the file
            output.write(data);

            //close the writer
            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
