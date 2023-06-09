package JavaExpansionConcepts.JavaStrings;
/**
 * COMPARING STRINGS
 * We can compare two strings on the basis of content and refference (variable)
 * Comparisons are important in:
 *      1. Authentication: by equals() method
 *      2. Sorting: by compareTo() method
 *      3. Refference matching: by == operator
 */

public class ComparingTwoStrings {
    public static void main(String[] args) {
        //comparison using the equals() method
        /**
         * This method compares the content of the Strings
         * It has two variations:
         *      1. public boolean equals(Object obj)- compares the String to the specified object
         *      2. public boolean equalsIgnoreCase(String str)- ignores the case when comparing
         */
        String s1 = "Martin";
        String s2 = "Martin";
        String s3 = "martin";

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false- case sensitive
        System.out.println(s1.equalsIgnoreCase(s3));//true- not case sensitive

        //comparison using the == operator
        /**
         * This method compares the refference, (not the values) of the String
         */
        String s4 = "Martin";
        String s5 = "MArtin";
        System.out.println(s4 == s5);//false- refferences point to different locations in the SCP

        //comparison using the compareTo() method
        /**
         * This method compares the string values lexicographically and returns an integer  value that
         * describes if first string is <(returns -ve value), ==(returns 0) or >(returns +ve value) the second string
         */
        String s6 = "Martin";
        String s7 = "Martin";
        String s8 = "MArtin";
        System.out.println(s6.compareTo(s7)); //returns 0
        System.out.println(s6.compareTo(s8)); //return +ve since 'a' is lexicographically > 'A'
    }
}
