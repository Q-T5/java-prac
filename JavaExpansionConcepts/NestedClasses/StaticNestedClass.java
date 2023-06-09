package JavaExpansionConcepts.NestedClasses;
/**
 * NESTED STATIC INNER CLASSES
 * Is a static class defined inside another class
 * It is called a 'static nested class' not a 'static inner class'
 * Unlike an inner class static nested classes CANNOT access the properties
 * of the outer class
 * This is because static nested classes DO NOT NEED you to create an instance of
 * the outer class. We use the '.' operator as with every static property
 * Here is an example
 */
class MotherBoard {
    //static nested class
    static class USB {
        Integer usb2 = 2;
        Integer usb3 = 3;

        Integer getTotalPorts() {
            return usb2 + usb3;
        }
    }
}


public class StaticNestedClass {
    public static void main(String[] args) {
        //create an object of the static nested class using
        //the name of the outer class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total USB ports: " + usb.getTotalPorts());
    }
}
