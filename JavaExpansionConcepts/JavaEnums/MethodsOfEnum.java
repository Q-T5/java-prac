package JavaExpansionConcepts.JavaEnums;

//enum has its own methods
enum Color { RED, GREEN, BLUE, YELLOW, PURPLE }

public class MethodsOfEnum {
    public static void main(String[] args) {
        //1. Enum ordinal()- return position of enum constant
        System.out.println(Color.PURPLE.ordinal());

        //2. Enum compareTo()- compares the enum constants based on their ordinal values
        System.out.println(Color.RED.compareTo(Color.YELLOW)); // RED is behind YELLOW by how many spaces?

        //3. Enum toString()- returns the String representation of the enum constants
        System.out.println((Color.RED.toString()).getClass()); //object of the type String

        //4. Enum name()- returns the defined name of an enum constant in String form- same as Enum toString()
        System.out.println((Color.PURPLE.name()).getClass());

        //5. EnumvalueOf()- takes a String and returns the enum constant having the same name- reverse of toString()
        System.out.println(Color.valueOf("YELLOW"));

        //6. Enum values()- returns an array of type enum containing all the enum constants
        Size[] enumArray = Size.values();
        for(Size s : enumArray) {
            System.out.print(s +", ");
        }
    }
}
