package JavaExpansionConcepts.JavaStrings;
/**
 * All wrapper classes and the String class in Java are immutable.
 * To create custom immutable classes, we create a final class, with final instance variables and no setter methods.
 * Here is an example:
 */

final class Employee {
    final String pancardNumber;

    public Employee(String pcNum) {
        this.pancardNumber = pcNum;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }
}

public class CreatingImmutableClasses {
    public static void main(String[] args) {
        Employee e = new Employee("ABC123");
        String s1 = e.getPancardNumber();
        System.out.println("Pancard Number: " + s1);
    }
}
