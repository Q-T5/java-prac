package JavaExpansionConcepts.JavaStrings;
/**
 * Java's toString() method
 * A member of the Object class, this method is used to represent any object as a string.
 * It returns the string representation of an object- which by default is a hash value(refference value)
 * We have to override to get more useful ouputs related to an object
 */

class Student {
    int rollNo;
    String name;
    String city;

    Student(int rollN, String n, String c) {
        this.rollNo = rollN;
        this.name = n;
        this.city = c;
    }
}

class Students {
    int rollNo;
    String name;
    String city;

    Students(int rollN, String n, String c) {
        this.rollNo = rollN;
        this.name = n;
        this.city = c;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + city;
    }
}

public class JavaToStringMethod {
    public static void main(String[] args) {
        //the toString() default behaviour
        Student s1 = new Student(101, "Martin", "Bikathi");
        System.out.println(s1); //the compiler writes s1.toString()

        //the toString() method with overriden behaviour
        Students s2 = new Students(101, "Martin", "Bikathi");
        System.out.println(s2); //the compiler writes the overriden s1.toString() method
    }
}
