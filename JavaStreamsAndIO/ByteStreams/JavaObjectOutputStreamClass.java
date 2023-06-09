package JavaStreamsAndIO.ByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * JAVA OBJECT OUTPUT STREAM
 * Package: java.io
 * Type: concrete class
 * Usage: used to write OBJECTS that can be ready by ObjectInputStream/ deserialize objects
 * 
 * Extends the OutputStream class
 * It only writes objects that implement the Serializable interface
 * 
 * CONSTRUCTOR
 * Using the constructor is a two-step process, we need the ObjectOutputStream itself, and a FileOutputStream/ a
 * way to connect to the file into which to write the object
 * 
 *      Step 1. FileOutputStream fileStream = new FileOutputStream(String file);
 *      Step 2. ObjectOutputStream objStream  =new ObjectOutputStream(fileStream);
 * NB: This can be shortened to one line:
 *      ObjectOutputStream objStream = new ObjectOutputStream(new FileOutputStream(String file));
 * 
 * METHODS- the core method is an overriden read() method
 * write()- writes a byte of data to the output stream
 * writeBoolean()- writes data in boolean form
 * writeChar()- writes data in character form
 * writeInt()- writes data in integer form
 * writeObject()- writes objects to the output stream
 * 
 * OTHER METHODS
 * flush()- clears all the data from the output stream
 * drain()- puts all the buffered data in the output stream
 * close()- closes the output stream
 * 
 * Example
 */

class Person implements Serializable {
    String name;
    Integer age;
    Double height;

    public Person(String name, Integer age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

public class JavaObjectOutputStreamClass {
    public static void main(String[] args) {
        String sentence = "My name is Martin";
        Integer myAge = 20;

        //let's serialize the String and integers above first
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("JavaExpansionConcepts/OutputFiles/file3.ser"));

            //serialize the String
            output.writeObject(sentence);

            //then the integer
            output.writeInt(myAge);

            Person person1 = new Person("Martin Bikathi", 21, 104.5);

            //then the person object
            output.writeObject(person1);

            output.close();

            //deserializing the String
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("JavaExpansionConcepts/OutputFiles/file3.ser"));

            System.out.println("Deserialized sentence: " + input.readObject());
            System.out.println("Deserialized age: " + input.readInt());

            Person myPerson = (Person) input.readObject();
            System.out.println("Person name: " + myPerson.name);
            System.out.println("Person age: " + myPerson.age);
            System.out.println("Person height: " + myPerson.height);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
