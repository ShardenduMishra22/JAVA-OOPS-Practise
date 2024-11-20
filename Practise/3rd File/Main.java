// Defining an interface with a default method
interface Animal {
    void makeSound(); // Abstract method

    // Default method
    default void sleep() {
        System.out.println("Sleeping...");
    }
}

// Another interface
interface Pet {
    void play(); // Abstract method
}

// Base class
class LivingBeing {
    void breathe() {
        System.out.println("Breathing...");
    }
}

// Derived class that extends a class and implements multiple interfaces
class Dog extends LivingBeing implements Animal, Pet {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public void play() {
        System.out.println("Playing fetch!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Using methods from interfaces and base class
        dog.makeSound();   // Overridden from Animal
        dog.breathe();     // Inherited from LivingBeing
        dog.sleep();       // Default method from Animal interface
        dog.play();        // Overridden from Pet
    }
}
