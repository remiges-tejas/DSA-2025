public class Student {

    // Static Variable
    public static int count = 0;


    // Static Block (Logic Can intiliaze before one time setup task)
    static{
        System.out.println("Static Block ");
    }

    public Student() {

        count++;
    }

    private int id;

    private String name;

    public int age;

    // static methods
    public static void getCount() {
        System.out.println("Total Count is :" + count);

    }
}
