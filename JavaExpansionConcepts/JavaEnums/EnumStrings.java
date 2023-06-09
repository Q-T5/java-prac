package JavaExpansionConcepts.JavaEnums;
/**
 * ENUM STRINGS
 * Remember we can get the String representation of enum constansts using the toString() method or the name() method
 */

//example of using toString() and name() methods
enum Name { SHAWNNA, MARTIN, JOEL, SIMONS, JANELLE }

/**
 * CHANGING THE DEFAULT STRING VALUE OF ENUMS
 * We can achieve this by overriding the to String method. For example
 */
enum Cars {
    MAZDA {
        //overrding the toString() method
        public String toString() {
            return "This car is a Mazda";
        }
    },

    TESLA {
        public String toString() {
            return "This car is a Tesla";
        }
    },

    VOLKSWAGEN {
        public String toString() {
            return "This car is a Volkswagen";
        }
    };
}

public class EnumStrings {
    public static void main(String[] args) {
        System.out.println(Name.JANELLE.toString());
        System.out.println(Name.JOEL.name());

        //example using the overriden toString() methods
        System.out.println(Cars.MAZDA.toString());
        System.out.println(Cars.TESLA.name()); //this one is not affected however and cannot be ovveridden as it is final
    }
}
