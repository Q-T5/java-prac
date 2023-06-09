package JavaStreamsAndIO.CharacterStreams;

import java.io.StringWriter;

/**
 * JAVA STRING WRITER CLASS
 * Package: java.io
 * Type: concrete class
 * Usage: used to write data in characters to the String buffer
 * 
 * Extends Writer
 * 
 * CONSTRUCTOR
 * Its constructor creates a default string buffer size, which we may or may not override like this:
 *      Option 1: StringWriter writer = new StringWriter();
 *      Option 2: StringWriter writer = new StringWriter(Integer size);
 * 
 * METHODS
 * write()- writes a single character to the string writer
 * write(char[] array)- writes the charcaters from the specified array to the writer
 * write(String data)- writes the specified String to the writer
 * 
 * OTHER METHODS
 * flush()- forces to write all the data present in the writer to the String buffer
 * close()- close the string writer
 *
 * Example
 */

public class JavaStringWriterClass {
    public static void main(String[] args) {
        String data = "Making memes.";

        try {
            //create a string writer with default buffer capacity
            StringWriter writer = new StringWriter();
            
            //write data to the String buffer
            writer.write(data);

            //print the Strig writer
            System.out.println("Data in the string writer: " + writer);

            //close the String writer
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        /**
         * ACCESSING DATA FROM THE STRING BUFFER
         * getBuffer()- returns the data present in the string buffer
         * toString()- return the data present in the string buffer as a String
         * 
         * Example
         */

        try {
            String dataB = "This is some text.";

            StringWriter output = new StringWriter();

            //write data to the String buffer
            output.write(dataB);

            //return the String buffer
            StringBuffer buffer = output.getBuffer();
            System.out.println("String buffer: " + buffer);

            //return the StringBuffer in String form
            String string = output.toString();
            System.out.println("String:" + string);

            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
