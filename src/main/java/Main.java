import domain.*;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat("Cirmi");
        cat.makeSound();

        Dog dog = new Dog("Bodri");
        dog.makeSound();
    }
}