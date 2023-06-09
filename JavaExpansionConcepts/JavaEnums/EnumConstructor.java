package JavaExpansionConcepts.JavaEnums;
/**
 * ENUM CONSTRUCTOR
 * Because an enum is like a class, it can have a constructor like a regular class.
 * They can either be private or package-private (default)
 * Here is an example:
 */

enum Days {
    //enum constants calling the enum constructors
    MONDAY("The day is Monday."), TUESDAY("The day is TUESDAY"), WEDNESDAY("The day is Wednesday."),
    THURSDAY("The day is Thursday.");

    private final String dayToday;

    //private enum constructor
    private Days(String dayToday) {
        this.dayToday = dayToday;
    }

    public String getDayToday() {
        return this.dayToday;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        Days days = Days.THURSDAY;
        System.out.println(days.getDayToday());
    }
}
