package JavaDateAndTime;

import java.time.LocalDate;

/**
 * DISPLAYING CURRENT DATE IN JAVA
 * We import the java.time.LocalDate class and use its now() method
 * 
 * Example
 */
public class DisplayCurrentDate {
    public static void main(String[] args) {
        //use the now() method to get the date
        LocalDate dateToday = LocalDate.now();

        //print it out
        System.out.println("Date today: " + dateToday);
    }
}
