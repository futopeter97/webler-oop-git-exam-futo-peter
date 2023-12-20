import domain.*;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat("Cirmi");
        cat.makeSound();

        Dog dog = new Dog("Bodri");
        dog.makeSound();

        Cat anotherCat = new Cat("Tom");
        Dog anotherDog = new Dog("Odie");

        cat.makeSound();
        dog.makeSound();
    }
}