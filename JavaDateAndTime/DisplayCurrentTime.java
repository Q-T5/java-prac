package JavaDateAndTime;

import java.time.LocalTime;

/**
 * DISPLAY CURRENT TIME
 * We import the java.time.LocalTime class and use its now() method
 * 
 * Example
 */

public class DisplayCurrentTime {
    public static void main(String[] args) {
        //get the local time using the now() method
        LocalTime timeNow = LocalTime.now();

        //print it out
        System.out.println("Time now: " + timeNow);
    }
}
