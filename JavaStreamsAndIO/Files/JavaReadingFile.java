package JavaStreamsAndIO.Files;

import java.io.FileReader;

public class JavaReadingFile {
    public static void main(String[] args) {
        /**
         * READING FILES
         * we use a FileReader object.
         * 
         * Example using the 
         */
        try {
            char[] array = new char[100];

            FileReader reader = new FileReader("JavaExpansionConcepts/OutputFiles/test-file1.txt");

            //read characters
            reader.read(array);
            System.out.print("Data in the file: ");
            System.out.println(array);

            //close the reader
            reader.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
