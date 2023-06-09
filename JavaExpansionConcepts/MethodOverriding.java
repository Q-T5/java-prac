package JavaExpansionConcepts;

/**
 * METHOD OVERRIDING
 * If a SUB-CLASS(CHILD-CLASS) has the same method as declared in the parent, this is called 
 * method overriding.
 * This is special for runtime polymorphism, and also helps provide class-specific implementation of the
 * method defined in the parent class.
 * 
 * RULES FOR OVERRIDING
 * 1. Method must have same name as the parent class
 * 2. Method must have same parameters as the parent class
 * 3. There must be an IS-A relationship between the classes (valid inheritance)
 * 
 * NB: static methods cannot be overriden, they are inherrited yes, but when you try to override it,
 *     the one in the base class will be 'hidden'.
 */

class Vehicle {
    //original method
    void run() { System.out.println("Vehicle is running"); }
}

//implementing the IS-A relationship
class Bike extends Vehicle {
    void run() { System.out.println("Bike is running"); }
}

public class MethodOverriding {
    public static void main(String[] args) {
        //calling the overriden run method in class Bike
        Bike b1 = new Bike();
        b1.run();

        //creating new objects of the three specific Banks
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI rate of interest: " + s.getRateOfInterest());
        System.out.println("ICICI rate of interest: " + i.getRateOfInterest());
        System.out.println("AXIS rate of interest: " + a.getRateOfInterest());
    }
}

//real life example- overriding using a banking scenario
class Bank {
    int getRateOfInterest() { return 0; }
}

//child classes of the Bank class
class SBI extends Bank {
    int getRateOfInterest() { return 8; }
}

class ICICI extends Bank {
    int getRateOfInterest() { return 7; }
}

class AXIS extends Bank {
    int getRateOfInterest() { return 9; }
}