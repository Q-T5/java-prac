package JavaExpansionConcepts;

/**
 * The BREAK statement causes a loop to pre-maturely terminate.
 * Control then goes out of the loop and onto the next statement after the loop.
 * It can be used in Java's for loops, while loops, and do-while loops, but in this example,
 * we'll use the for loop.
 * It is mostly asociated with a condition- the condition is nested inside the loop.
 */

public class BreakStatement {
    public static void main(String[] args) {
        //example of the break statement in a for loop
        for(int i = 1; i < 10; i++) {
            //the loop terminates the moment i hits 5
            if(i == 5) {
                break;
            }

            System.out.println(i);
        }

        /**
         * when the break statement inside an inner loop, the inner loop terminates and control
         * goes to the outer loop.
         * Here is an example:
         */
        System.out.println("Example 2: ");
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) {
                    //break both loops
                    break;
                }

                System.out.println(i + " " + j);
            }
        }

        /**
         * JAVA BREAK STATEMENT WITH A LABELLED FOR LOOP
         * Since Java 1.5, we can break any loop in Java- whether inner or outer.
         * Here is an example:
         */

        System.out.println("Example 3 with lablels: ");
        
        //label for the outer loop
        aa:
        for(int i = 1; i <= 3; i++) {
            
            //label for the inner loop
            //bb:
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) {
                    //break the outer loop with the 'aa' label
                    break aa;
                }

                System.out.println(i + " " + j);
            }
        }
    }
}
