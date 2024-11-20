// Parent class
class Animal {
    String type = "Animal";

    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Child class inheriting Animal class
class Dog extends Animal {
    String breed = "Golden Retriever";

    void bark() {
        System.out.println("The dog barks.");
    }

    // Overriding parent method
    @Override
    void eat() {
        System.out.println("The dog eats dog food.");
    }
}

// Main class to test inheritance
public class ExtendsExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Accessing parent class methods and variables
        System.out.println("Animal Type: " + myDog.type); // Inherited from Animal
        myDog.sleep();                                    // Inherited from Animal

        // Accessing child class methods and variables
        System.out.println("Dog Breed: " + myDog.breed); // From Dog class
        myDog.bark();                                    // From Dog class

        // Overridden method
        myDog.eat(); // Calls the overridden method in Dog class
    }
}

// Animal Type: Animal
// This animal sleeps.
// Dog Breed: Golden Retriever
// The dog barks.
// The dog eats dog food.