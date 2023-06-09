package JavaStreamsAndIO.CharacterStreams;

import java.io.PrintWriter;

/**
 * JAVA PRINT WRITER CLASS
 * Package: java.io
 * Type: concrete class
 * Usage: used to write output data in a commonly readable text from
 * 
 * Extends the abstract class Writer
 * 
 * Unlike other character writers, PrintWriter converst the primitive data like int and float into text format
 * then writes that formatted data to the writer.
 * NOTE: the PrintWriter does not throw any IO exception. Instead, we use the checkError() method to find any error in it.
 * It also supports auto-flushing
 * 
 * CONSTRUCTORS
 * We can create a PrintWriter using other writers like this for example:
 *      PrintWriter output = new PrintWriter(new FileWriter(String path), Boolean autoFlush);
 * 
 * We can also create a PrintWriter using other output streams like this for example:
 *      PrintWriter output = new PrintWriter(new FileOutputStream(String path), Boolean autoFlush);
 * 
 * We can also create a PrintWriter using a String filename like this:
 *      PrintWriter output = new PrintWriter(String file, Boolean autoFlush)
 * 
 * We can also specify the character encoding we want to use along with the constructor like this:
 *      PrintWriter output = new PrintWriter(String file, Boolean autoFlush, Charset cs);
 * 
 * METHODS
 * There are two core methods this class provides:
 * print()- prints specified data to the writer
 * println()- prints the data to the writer along with a new line character at the end
 * 
 * OTHER METHODS
 * close()- closes the print writer
 * checkError()- checks if there is an error in the writer and returns a boolean result
 * append()- appends the specified data to the writer
 * 
 * Example using a new output8.txt file
 */

public class JavaPrintWriterClass {
    public static void main(String[] args) {
        String data = "Cats are better than dogs.";

        try {
            PrintWriter output = new PrintWriter("JavaExpansionConcepts/OutputFiles/output8.txt");

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
            PrintWriter output = new PrintWriter("JavaExpansionConcepts/OutputFiles/output9.txt");

            Integer age = 25;

            output.printf("I am %d years old: ", age);
            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
