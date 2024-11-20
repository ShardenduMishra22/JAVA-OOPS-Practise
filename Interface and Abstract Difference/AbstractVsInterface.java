// Abstract Class Example
abstract class Vehicle {
    int wheels; // Instance variable

    Vehicle(int wheels) { // Constructor
        this.wheels = wheels;
    }

    abstract void move(); // Abstract method

    void display() { // Concrete method
        System.out.println("This vehicle has " + wheels + " wheels.");
    }
}

class Car extends Vehicle {
    Car() {
        super(4); // Calling the constructor of the abstract class
    }

    void move() {
        System.out.println("The car drives on the road.");
    }
}

// Interface Example
interface Animal {
    void eat(); // Abstract method (implicitly public)
    void sleep(); // Abstract method
}

class Dog implements Animal {
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void sleep() {
        System.out.println("The dog sleeps soundly.");
    }
}

public class AbstractVsInterface {
    public static void main(String[] args) {
        // Abstract class usage
        Vehicle myCar = new Car();
        myCar.display();
        myCar.move();

        // Interface usage
        Animal myDog = new Dog();
        myDog.eat();
        myDog.sleep();
    }
}

// Abstract Class:

// Can have both abstract methods (no implementation) and concrete methods (with implementation).
// Can have constructors, instance variables, and state (like the wheels field in Vehicle).
// Used when classes share some common state or behavior.
// Example: Vehicle class defines shared characteristics (e.g., wheels) and allows specific behavior like move() for subclasses (Car).

// Interface:

// Purely defines a contract (behavior) for a class with only abstract methods (before Java 8).
// Cannot have instance variables or constructors.
// Allows multiple inheritance (a class can implement multiple interfaces).
// Example: Animal defines behaviors (eat, sleep) that any class (Dog) must implement.