package animals;
public interface Animal {

    // Static Constant Can also added in interface
    // (public static final ) No needed to add.
    // Interface ka Object Nahi Bana Skte.

    int MAX_AGE = 150;

    // By Deafult Interface provide abstraction 100% (NO NEED OF ABstract Keyword)
    // By Default Interface Method is Public
    void eat();

    void sleep();

    // Interface can have static methods
    // Instace method can;t not have body
    // (Related with the instace)

    public static void info() {
        System.out.println("THis is an Animak Interface");
    }

    // Utilities Method WHich going to used multiple times
    // these method you can define here
    // But method should be the static
    // for example : min() , max(), trimAndUppercase()

    public static String trimAndUppercase(String str) {
        if (str != null) {
            return str.trim().toUpperCase();
        }
        return "";
    }

    // find max

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    // find min

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    // Swap

    public static void swap(int a, int b) {

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swaping :" + a + " " + b);

    }

    // Default Methods

    public default void run() {

        this.eat();
        System.out.println("Running");
    }

}
