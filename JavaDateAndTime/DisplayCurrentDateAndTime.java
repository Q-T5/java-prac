package JavaDateAndTime;

import java.time.LocalDateTime;

/**
 * DISPLAY BOTH CURRENT DATE AND TIME
 * We import the java.time.LocalDateTime and use its now() method
 * 
 * Example
 */
public class DisplayCurrentDateAndTime {
    public static void main(String[] args) {
        //use the now() method to get current date and time
        LocalDateTime currentDateAndTime = LocalDateTime.now();

        //print it out- notice the 'T' in the output. It works like a separator between the date and the time
        System.out.println("Current date and time: " + currentDateAndTime);
    }
}
