package JavaStreamsAndIO.CharacterStreams;

import java.io.FileWriter;
import java.io.Writer;

/**
 * JAVA WRITER CLASS
 * Package: java.io
 * Type: abstract superclass- which means it must be extended by a subclass
 * Use: represents a stream of Characters
 * 
 * Subclasses include: BufferedWriter, OutputStreamWriter, FileWriter, StringWriter
 * 
 * CONSTRUCTOR
 * Its constructor cannot be initialized because it is abstract, but you can use one of it's subclasses e.g
 *      Writer input = new FileWriter();
 * 
 * METHODS
 * write(char[] array)- writes the characters from the specified array to the output stream
 * write(String data)- writes the specified String to the writer
 * append(char c)- inserts the specified character to the current writer
 * flush()- forces to write all the data present in the writer to the corresponding destination
 * close()- closes the writer
 * 
 Example using the FileWriter
 */

public class JavaWriterClass {
    public static void main(String[] args) {
        String sentence = "1 plus 2 equals 3.\n";
        String sentence2 = "3 plus 4 equals 7.";

        try {
            //creates a Writer usig FileWriter
            Writer output = new FileWriter("JavaExpansionConcepts/OutputFiles/output5.txt");

            //write the String to the file
            output.write(sentence);
            output.write(sentence2);

            //close the writer
            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
