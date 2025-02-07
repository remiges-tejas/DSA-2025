public class Test {

    public static void main(String[] args) {

        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        System.out.println(Student.count);

        Student.getCount();
      

        // Singleton Object Access
         SingletonSchool instance = SingletonSchool.getInstance();


    }

}
