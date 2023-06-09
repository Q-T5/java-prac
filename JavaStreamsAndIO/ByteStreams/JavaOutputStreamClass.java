package JavaStreamsAndIO.ByteStreams;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * JAVA OUTPUT STREAM CLASS
 * Package: java.io
 * Type: abstract superclass- so must be extended by sub-classes
 * Use: represents an output stream of bytes
 * 
 * Subclasses include: FileOutputStream, ByteArrayOutputStream, ObjectOutputStream
 * 
 * METHODS
 * write()- writes the specified byte to the output stream
 * write(byte[] array)- write the bytes from the specified array to the output stream
 * flush()- forces to write all data present in the output stream to the destination
 * close()- closes the output stream
 * 
 * Example creating an output stream using FileOuputStream:
 */

public class JavaOutputStreamClass {
    public static void main(String[] args) {
        String data  = "This is a line of text inside the file.\nThis should be on another line";

        try {
            //we first import the java.io.OutputStream package then build a new subclass object of it
            OutputStream output = new FileOutputStream("JavaExpansionConcepts/OutputFiles/output1.txt");

            //convert the String into bytes
            byte[] dataBytes = data.getBytes();

            //write the data to the output stream
            output.write(dataBytes);
            System.out.println("Data is written to the file.");

            //closes the output stream
            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
