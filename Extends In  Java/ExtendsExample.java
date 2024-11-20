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

/*
    Yes, the program works without `@Override`, but here's why you should still use it:

    ### Why Does It Work Without `@Override`?
    The `@Override` annotation is optional. When you create a method in the child class with the **same signature** (name, parameters, and return type) as a method in the parent class, Java automatically treats it as an overridden method. The annotation is not required for this behavior.

    ### Why Use `@Override` Then?
    1. **Error Checking**:  
    If you accidentally make a mistake in the method signature (e.g., typo in the method name or parameters), Java won’t treat it as overriding. Without `@Override`, this mistake won't cause a compilation error—it would create a new method instead.  
    Example:  
    ```java
    class Parent {
        void display() {
            System.out.println("Parent method");
        }
    }
    class Child extends Parent {
        // Mistyped method name
        void dispay() {
            System.out.println("Child method");
        }
    }
    ```
    Without `@Override`, this would compile without errors, but the `display()` method in the parent wouldn't be overridden. Using `@Override` would catch this mistake.

    2. **Code Readability**:  
    The annotation explicitly indicates to other developers (and yourself) that the method is intentionally overriding a parent method.

    3. **Consistency Across Code**:  
    Using `@Override` makes it clear that a method's behavior comes from overriding, not just a similar-looking method in the child class.

    ### Conclusion:
    The program works because the Java compiler automatically determines overridden methods based on matching signatures. However, using `@Override` is considered a good practice for error checking and improving code clarity.
*/