package JavaExpansionConcepts;

/**
 * The CONTINUE statement causes the current iteration of a loop to end prematurely.
 * Every statement inside the loop below the continue statement will be ignored.
 * The next iteration then runs.
 * It can be used with for loop, do-while or while loop.
 */

public class ContinueStatement {
    public static void main(String[] args) {
        //example of CONTINUE with for loop
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                continue;
                //the number 5 will not be printed out
            }

            System.out.println(i);
        }

        //with an inner loop the effect of the CONTINUE statement only happens with the inner loop.
        //Here is an example:
        System.out.println("Example 2 with nested loops: ");
        for(int i = 1; i <= 3; i++) {
            //inner loop
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) {
                    continue;
                }

                System.out.println(i  + " " + j);
            }
        }

        /**
         * You can use CONTINUE with a labelled loop.
         * The effect of continue will be implemented on the labelled loop
         * Here is an example:
         */

        //outer loop label

        System.out.println("Example 3 with labels: ");
        aa:
        for(int i = 1; i <= 3; i++) {
            //inner loop labelSystem.out.println(i + " " + j);
            //bb:
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) {
                    continue aa;
                }

                System.out.println(i + " " + j);
            }
        }
    }
}
