package JavaThreads;

class A extends Thread {
    protected void saySomethig() {
        System.out.println("I can say something!");
    }


    //run() method of the Thread class
    public void run() {
        saySomethig();
    }
}

public class SimpleThread {
    public static void main(String[] args) {
        A test1 = new A();

        long startTime = System.nanoTime();

        //the start() method of the Thread class starts the thread
        test1.start();

        long stopTime = System.nanoTime();

        double timeTaken = (stopTime - startTime) / 1000000000;
        System.out.println("Time taken: " + timeTaken);
    }
}