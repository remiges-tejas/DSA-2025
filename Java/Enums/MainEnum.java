package Java.Enums;

public class MainEnum {

    public static void main(String[] args) {

        Day monday = Day.TUESDAY;

        // Ordinal
        int ordinal = monday.ordinal();
        System.out.println(ordinal);

        // name
        System.out.println(monday.name());
        System.out.println(monday.toString());

        // Convert String to Enums

        System.out.println();
        Day enumDay = Day.valueOf("MONDAY");
        System.out.println(enumDay);

        System.out.println();

        Day[] DayVal = Day.values();

        for (Day val : DayVal) {
            System.out.println(val);
        }

    }

}
