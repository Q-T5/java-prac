package JavaStreamsAndIO.Files;

import java.io.File;

/**
 * JAVA FILE CLASS
 * CONSTRUCTOR
 * The constructor expects a String that is the path to the location of the file
 *      File file = new File(String path);
 * 
 * METHODS
 * createNewFile()- used to create new file. Part of java.io.File
 * read()- used to read the file. Part of java.io.FileReader
 * write()- used to write to the file. Part of java.io.FileWriter
 * delete()- used to delete a file. Part of java.io.File
 */

public class JavaCreatingFile {
    public static void main(String[] args) {
        /**
         * CREATING FILES
         * The createNewFile() is used to create a new file.
         * It returns true if a file is created, or false if the file already exists in the specified location
         * 
         * Example
         */
        try {
            //create a file object for the current location
            File file = new File("JavaExpansionConcepts/OutputFiles/test-file1.txt");

            //try to create a file based on the object
            Boolean value = file.createNewFile();
            if(value) {
                System.out.println("The new file is created.");
            } else {
                System.out.println("The file already exists.");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
