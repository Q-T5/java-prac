package JavaStreamsAndIO.CharacterStreams;

import java.io.FileWriter;

/**
 * JAVA FILE WRITER CLASS
 * Package: java.io
 * Type: concrete class
 * Usage: used to write data in characters to a file
 * 
 * Extends the OutputStreamWriter class, which itself extends Writer
 * 
 * CONSTRUCTOR
 * Its constructor can take either a File object or a String path to the file
 *      FileWriter input = new FileWriter(String name);
 *      FileWriter input = new FileWriter(File file);
 * We can also specify the type of character encoding (UTF8 or UTF-16) in the file as well
 *      FileWriter input = new FileWriter(String file, Charset cs);
 * 
 * METHODS
 * write()- writes a single character to the writer
 * write(char[] array)- writes the charcaters from the specified array to the writer
 * write(String data)- writes the specified String to the writer
 * 
 * OTHER METHODS
 * getEncoding()- used to get the type of encoding that is used to write data
 * close()- used to close the file writer
 * flush()- forces to write all the data present in the writer to the corresponding destination
 * append()- inserts the specified character to the current writer
 * 
 * Example using a new output6.txt file
 * 
 */

public class JavaFileWriterClass {
    public static void main(String[] args) {
        String data = "Till you\'re on your own, you can\'t be free.";

        try {
            //create the FileWriter
            FileWriter writer = new FileWriter("JavaExpansionConcepts/OutputFiles/output6.txt");

            //write the String to the file
            writer.write(data);

            //close the writer
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
