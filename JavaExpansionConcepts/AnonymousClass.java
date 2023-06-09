package JavaExpansionConcepts;

/**
 * ANONYMOUS CLASS
 * In Java, it's possible to create a nested class without giving the class a name
 * This is called an anonymous class
 * An anonymous class MUST be defined inside another class, so it's usually called an
 * anonymous inner class.
 * 
 * SYNTAX
 * class OuterClass {
 *      //defining an anonymous class
 *      Object1 = new Type(parameterlist) {
 *          //body of the anonymous class
 *      };
 * }
 * 
 * Anonymous classes susally extend subclasses or implement interfaces
 * The 'TYPE' can be:
 *      1. a superclass that an anonymous class extends
 *      2. an interface that an anonymous class implements
 * 
 * Anonymous classes are created at runtime, e.g Object1 aboove will be created at runtime
 * Anonymous classes sre defined inside an expression, so the semicolon is used at the END of an 
 * anonymous class to indicate the end of the expression
 * 
 * Here is an example of an anonymous class extending a class
 */

class Polygon {
    public void display() {
        System.out.println("Inside the polygon class.");
    }
}

class AnonymousDemo {
    public void createClass() {
        //creation of an anonymous class extending class Polygon
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside anonymous class.");
            }
        };

        //when we run the program, an object p1 of the anonymous class is created, which then calls
        //the display() method of the anonymous class
        p1.display();
    }
}

//Here is an example of an anonymous class implementing an interface
interface Triangle {
    public abstract void display();
}

class TriangleDemo {
    public void createClass() {
        //anonymous class implementing interface
        Triangle p1 = new Triangle() {
            @Override
            public void display() {
                System.out.println("Inside anonymous class.");
            }
        };

        p1.display();
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();

        TriangleDemo t1 = new TriangleDemo();
        t1.createClass();
    }
}
