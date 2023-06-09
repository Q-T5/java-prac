package JavaStreamsAndIO.CharacterStreams;

import java.io.FileReader;

/**
 * JAVA FILE READER CLASS
 * Package: java.io
 * Type: concrete class
 * Usage: used to read data in characters from files
 * 
 * Extends the InputStreamReader class, which itself extends Reader
 * 
 * CONSTRUCTOR
 * Its constructor can take either a File object or a String path to the file
 *      FileReader input = new FileReader(String name);
 *      FileReader input = new FileReader(File file);
 * We can also specify the type of character encoding (UTF8 or UTF-16) in the file as well
 *      FileReader input = new FileReader(String file, Charset cs);
 * 
 * METHODS
 * read()- read a single character from the reader
 * read(char[] array)- reads the characters from the reader and stores in the specified array
 * read(char[] array, int start, int length)- reads the number of characters equal to 'length' from the reader and stores
 * in the specified array starting from the 'start'
 * 
 * OTHER METHODS
 * getEncoding()- can be used to get the type of encoding that is used to store data in the file
 * close()- close the file reader
 * ready()- checks if the file reader is ready to be read
 * mark()- mark the position in file reader up to which data has been read
 * reset()- returns control to the point in the reader where the mark was set
 * 
 * Example using the input.txt file
 */

public class JavaFileReaderClass {
    public static void main(String[] args) {
        //create a char array
        char[] array = new char[100];

        try {
            //create the FileReader object
            FileReader input =  new FileReader("JavaExpansionConcepts/OutputFiles/input.txt");

            //read characters
            input.read(array);
            System.out.print("Data in the array: ");
            System.out.println(array);

            //close the reader
            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
