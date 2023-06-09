package JavaStreamsAndIO.Files;

import java.io.FileWriter;

public class JavaWriteIntoFile {
    public static void main(String[] args) {
        /**
         * WRITING INTO FILES
         * use the FileWrite object
         * 
         * Example
         */
        String data = "This is a second line.";
        try {
            //create a new FileWriter object
            FileWriter writer = new FileWriter("JavaExpansionConcepts/OutputFiles/test-file1.txt", true);

            //write a string to the file
            writer.write(data);
            System.out.println("Data is written to the file.");

            //close the writer
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
