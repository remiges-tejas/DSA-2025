package Java.Enums;

// Class
class EnumsClass {
    public static final String SUNDAY = "SUNDAY";
    public static final String TUESDAY = "TUESDAY";
}

// Interface
interface InterfaceEnums {
    String SUNDAY = "SUNDAY";
    String TUESDAY = "TUESDAY";
}

// Enums
enum Day {
    SUNDAY,
    MONDAY,
    SATURDAY,
    TUESDAY,
    WEDNESDAY,
    FRIDAY,
    THURSDAY

}

public class ImplEnums {

    public static void main(String[] args) {

        // Access Using the Class
        System.out.println(EnumsClass.SUNDAY);
        System.out.println(EnumsClass.TUESDAY);

        System.out.println();
        // Access using interface
        System.out.println(InterfaceEnums.SUNDAY);

        System.out.println();

        // Access Using Enums
        System.out.println(Day.SUNDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.FRIDAY);
    }

}
