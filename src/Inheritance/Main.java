package Inheritance;

public class Main {
    public static void main(String[] args) {

        //Objects

        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new AnimalImp();

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();

        animal.eat();
        animal.sleep();
    }
}
