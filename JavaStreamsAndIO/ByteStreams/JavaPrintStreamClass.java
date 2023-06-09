package JavaStreamsAndIO.ByteStreams;

import java.io.PrintStream;

/**
 * <h1>JAVA PRINT STREAM</h1>
 * Package: java.io
 * Type: concrete class
 * Use: used to write output data in commonly readable from (text) instead of bytes
 * 
 * Extends the OutputStream abstract class.
 * 
 * Unlike other output streams that use bytes, the PrintStream convert primitive data(int, char) into text, then writes
 * those Strings into the output stream.
 * 
 * <h4>AUTOFLASHING FEATURE OF THE PRINTSTREAM</h4>
 * The PrintStream class auto-forces the output stream to write all the data to the destination under one of the following
 * condition:
 *      if it encounters a \n in the print stream
 *      if the print() method is invoked
 *      if an array of bytes is written in the print stream
 * 
 * <h4>CONSTRUCTOR</h4>
 * Using the constructor is a two-step process, we need the PrintStream itself, and a FileOutputStream/ a
 * way to connect to the file into which to write the object
 * 
 *      Step 1. FileOutputStream fileStream = new FileOutputStream(String file);
 *      Step 2. PrintStream buffer  =new PrintStream(fileStream);
 * NB: This can be shortened to one line:
 *      PrintStream output = new PrintStream(new FileOutputStream(String file), Boolean autoFlash);- autoFlash specifies whether to
 *      perform auto-flushing or not
 * 
 * NOTE:
 * The PrintStream writes data to the file using the default character encoding. We can change this behaviour by using the
 * constructor that allows us to specify an encoding we want
 *      PrintStream out = new PrintStream(new FileOutputStream(String file), Boolean autoFlush, Charset cs);
 * We can also use a String file with the constructor
 *      PrintStream out = new PrintStream(String file);
 * 
 * <h4>METHODS</h4>
 * The two core methods we use are 
 * print()- prints the specified data to the output stream
 * println()- prints data to the output stream along with a newline character at the end
 * 
 * <h4>OTHER METHODS</h4>
 * close()- closes the print stream
 * checkError()- checks if there is an error in the stream and returns a boolean result
 * append()- appends the specified data to the stream
 * 
 * Example
 */

public class JavaPrintStreamClass {
    public static void main(String[] args) {
        String data = "Hello World";
        System.out.println(data);

        /**
         * HOW THIS WORKS WITHOUT CREATING AN INSTANCE OF PRINTSTREAM
         * System is a final class that is responsible for performing STDIO operations
         * out is a class variable of PrintStream type declared in System class
         * 
         * Since out is of PrintStream type, we can use it to call all the methods of the PrintStream class
         *
         *  Example 2
         */

        try {
            PrintStream output = new PrintStream("JavaExpansionConcepts/OutputFiles/output3.txt");

            output.print(data);
            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        /**
         * THE printf() method- PRINTING WITH FORMATTING
         * It can be used to format the string
         * It takes two parameters for example:
         *      printf("I am %d years old", 25);
         *          'I am %d years old' is a formatted String
         *          %d is integer data in the formatted String- it will be replaced by the 25
         *          25 is an argument
         * 
         * Real Example
         */
        try {
            PrintStream out = new PrintStream("JavaExpansionConcepts/OutputFiles/output4.txt");

            Integer age = 25;
            out.printf("I am %d years old.", age);
            out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
