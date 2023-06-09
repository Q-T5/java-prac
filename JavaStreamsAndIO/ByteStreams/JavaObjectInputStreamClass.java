package JavaStreamsAndIO.ByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * JAVA OBJECT INPUT STREAM
 * Package: java.io
 * Type: concrete class
 * Usage: used to read OBJECTS that were previously written by ObjectOutputStream/ deserialize objects
 * 
 * Extends InputStream class
 * 
 * CONSTRUCTOR
 * Using the constructor is a two-step process, we need the ObjectInputStream itself, and a FileInputStream/ a
 * way to connect to the file into which the ObjectOutputStream wrote the object
 * 
 *      Step 1. FileInputStream fileStream = new FileInputStream(String file);
 *      Step 2. ObjectInputStream objStream  =new ObjectInputStream(fileStream);
 * NB: This can be shortened to one line:
 *      ObjectInputStream objStream = new ObjectInputStream(new FileInputStream(String file));
 * 
 * METHODS- the core method is an overriden read() method
 * read()- read a byte of data from the input stream
 * readBoolean()- read data in boolean form
 * readChar()- read data in character form
 * readInt()- read data in integer form
 * readObject()- read the object in the input stream
 * 
 * OTHER METHODS
 * available()- returns the number of bytes available in the input stream
 * mark()- marks the position in input stream up to which data has been read
 * reset()- returns control to the point in the input stream where the mark was set
 * skipBytes()- skips and discards the specified bytes from the input stream
 * close()- closes the input stream
 * 
 * Example using both OIS and OOS
 */

class Dog implements Serializable {
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog() {
        //defualt constructor
    }
}

 public class JavaObjectInputStreamClass {
    public static void main(String[] args) {
        Integer data1 = 5;
        String data2 = "This is programiz";

        try {
            FileOutputStream file = new FileOutputStream("JavaExpansionConcepts/OutputFiles/file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            //writing to the file using ObjectOutputStream
            output.writeInt(data1);
            output.writeObject(data2);

            output.close();

            FileInputStream fileStream = new FileInputStream("JavaExpansionConcepts/OutputFiles/file.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);
            
            //objects must be read in the same way they were written out
            //Using the readInt() method
            System.out.println("Integer data: " + objStream.readInt());

            //using the readObject() method
            System.out.println("String data: " + objStream.readObject());

            objStream.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        /**
         * EXAMPLE 2- In this example, we will try and serialize and deserialize an object of the Dog class above
         * //the object must come from a class that implements Serializable
         * //if a field in the class is marked Transient or static, it will not be serialized
         */

        Dog dog = new Dog("Tyson", "Labrador");
        Dog dog2 = new Dog("Shawnna", "Bulldog");

        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("JavaExpansionConcepts/OutputFiles/file2.ser"));

            //write the first object to the output stream
            output.writeObject(dog);

            //then the second object
            output.writeObject(dog2);

            output.close();

            ObjectInputStream input = new ObjectInputStream(new FileInputStream("JavaExpansionConcepts/OutputFiles/file2.ser"));

            //reading the object using readObject()
            //the object will come morphed into an object of type Object, so we have to typecast it
            //serialized objects are read/ deserialized in the order in which they were serialized
            Dog newDog = (Dog) input.readObject();
            Dog newDog2 = (Dog) input.readObject();

            System.out.println("Dog 1 name: " + newDog.name);
            System.out.println("Dog 1 breed: " + newDog.breed);

            System.out.println("Dog 2 name: " + newDog2.name);
            System.out.println("Dog 2 breed: " + newDog2.breed);

            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
