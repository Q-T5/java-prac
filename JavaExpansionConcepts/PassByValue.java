package JavaExpansionConcepts;

/**
 *      JAVA IS STRICTLY PASS BY VALUE
 * When a FUNCTION is called, ARGUMENTS can be passed by REFFERENCE or by VALUE
 * Callee is a function called by another, and the caller is the function calling
 * the callee
 * The values passed to the function during calling are called parameters
 * During function declaration, they are called formal parameters
 * During function invocation, they are called actual parameters
 * 
 *      WHAT IS PASS BY VALUE?
 * PASS BY VALUE means that a COPY of the actual parameter's value is made in memory.
 * The caller and the callee thus have two independent variables with the same name.
 * If the callee modifies the parameter value, the effect is not visible to the caller.
 * 
 *      WHAT IS PASS BY REFERENCE?
 * PASS BY REFERENCE means to pass the reference of an argument in the calling function to the
 * corresponding formal parameter of the called function so that a copy of the address of the actual
 * parameter is made in memory.
 * In short, the caller and the callee use the same variable for the parameter.
 * If the callee modiifies the parameter variable, the effect is visible to the caller's variable. 
 */
class Test {
    int x;
    Test(int i) { x = i; }
    Test() { x = 0; }
}


public class PassByValue {
    public static void change(int x) {
        x = 10;
        System.out.println(x);
    }

    public static void change(Test t) {
        t = new Test(); //if we comment out this part, the value of the caller method's x will be 10
        t.x = 10;
    }

    //swap() does not swap i and j- this is just a test to predict the output
    public static void swap(Integer i, Integer j) {
        Integer temp = Integer.valueOf(i);
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        //test pass by value on a primitive type
        int x = 5;
        change(x);
        System.out.println(x);

        //test pass by value on a non-primitive type
        Test t = new Test();
        change(t);
        System.out.println(t.x);

        //test- predict the output
        Integer i = Integer.valueOf(10);
        Integer j = Integer.valueOf(20);
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);

        
    }
}