public class SingletonSchool {

    // Single ton class

    private static SingletonSchool school = new SingletonSchool();

    private SingletonSchool()
    {

    }
    public static SingletonSchool getInstance ()
    {
        return school;
    }
    
}
