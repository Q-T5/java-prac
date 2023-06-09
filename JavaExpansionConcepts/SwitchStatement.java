package JavaExpansionConcepts;

/**
 * Java's switch statement is like the laddered if-else.
 * The switched expression could be a char, byte, short, int, long(plus their wrapper types), enums and Strings
 * The case value must be a literal or a constant. It does not allow variables.
 * The case value must also be unique, if duplicated, it produces a runtime error.
 * Each case statement can have an optional break statement , which causes control to jump out of the switch statement.
 * Syntax:
 *      switch(expression) {
 *      case value1:
 *          code to be executed;
 *          optional break;
 *      case value2:
 *          code to be executed;
 *          optional break;
 *      case value3:
 *          code to be executed;
 *          optional break;
 *      ...
 *      default:
 *          code to be executed if all cases are not matched
 * }
 * 
 */
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //example of switch case
        int number = 31; //a variable for the switch expression

        ///switch expression
        switch(number) {
            //case statements
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        testSwitch();
    }

    static void testSwitch() {
        var s1 = new Scanner(System.in);
        System.out.print("Enter multiple of 10 less than 50: ");
        int num = s1.nextInt();

        switch(num) {
            case 10:
                System.out.println("Number is ten");
                break;
            case 20:
                System.out.println("Number is 20");
                break;
            case 30:
                System.out.println("Number is 30");
                break;
            case 40:
                System.out.println("Number is 40");
                break;
            case 50:
                System.out.println("Number is 50");
                break;
            default:
                System.out.println("Not a multiple of 10/ greater than 50");
        }

        s1.close();
    }
}
