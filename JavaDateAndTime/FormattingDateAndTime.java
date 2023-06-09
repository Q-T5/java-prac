package JavaDateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * FORMATING DATE AND TIME
 * The 'T' that appears when you use the now() method of java.time.LocalDateTime is a separator between the two.
 * we can change it by using the ofPattern() method of the DateTimeFormatter class of the same package.
 * 
 * In the following example, we remove the nanoseconds and the 'T' from the LocalDateTime result
 */

public class FormattingDateAndTime {
    public static void main(String[] args) {
        //get the date and time now
        LocalDateTime timeDateNow = LocalDateTime.now();

        //print it out as it is before formatting
        System.out.println("Date and time now: " + timeDateNow);

        //create the pattern we want to use
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        //format it with our desired format
        String formattedDate = timeDateNow.format(dateFormat);

        /**
         * OTHER FORMATTING EXAMPLES
         * The ofPattern() method can take any formatting patterns to display date and time for example:
         * yyyy-MM-dd -> "1988-09-29"
         * dd/MM/yyyy -> "29/09/1988"
         * dd-MMM-yyy -> "29-Sep-1988"
         * E, MMM dd yyy -> Thur Sep 29 1988
         */

        //print the results out
        System.out.println("Date and time now after formatting: " + formattedDate);
    }
}
