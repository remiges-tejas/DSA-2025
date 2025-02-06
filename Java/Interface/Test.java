import animals.Animal;
import animals.Cat;
import animals.Dog;

public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog();

        Cat cat = new Cat();

        dog.eat();
        dog.sleep();

        System.out.println();

        cat.eat();
        cat.sleep();

        // Can Access From Interface and As well as From Class Also
        System.out.println(Dog.MAX_AGE);

        System.out.println(Animal.MAX_AGE);

        System.out.println(Cat.MAX_AGE);

        Animal.info();

        System.out.println();

        // Test the Static method which define inside the interface

        System.out.println(Animal.trimAndUppercase("tejasnisen"));
        System.out.println(Animal.max(10, 233));
        System.out.println(Animal.min(10, 233));
        Animal.swap(10, 20);

        System.out.println();
        // Default Methods
        // No need to implement this method where this interface you implements
        // You can access the method with instance of class where interface is implments
        dog.run();
        cat.run();








        

    }
}