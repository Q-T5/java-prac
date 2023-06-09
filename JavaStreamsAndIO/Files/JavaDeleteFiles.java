package JavaStreamsAndIO.Files;

import java.io.File;

public class JavaDeleteFiles {
    public static void main(String[] args) {
        /**
         * JAVA DELETE FILES
         * use the delete() method.
         * returns true if file is deleted
         * returns false if file does not exist
         * 
         * Example
         */
        try {
            //create the File object to perform the operation
            File file = new File("JavaExpansionConcepts/OutputFiles/test-file2.txt");

            Boolean value = file.delete();

            if(value) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Target file does not exist.");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
