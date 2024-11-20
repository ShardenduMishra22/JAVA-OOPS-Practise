class StaticExample {

    // Static variable
    static int counter = 0;

    // Static method
    static void incrementCounter() {
        counter++;
    }

    // Instance method
    void showCounter() {
        System.out.println("Counter value: " + counter);
    }

    public static void main(String[] args) {
        // Calling static method without creating an object
        StaticExample.incrementCounter();
        StaticExample.incrementCounter();

        // Creating objects of the class
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        // Accessing static variable through objects (not recommended but valid)
        obj1.showCounter();
        obj2.showCounter();

        // Increment using one object and show impact on all instances
        obj1.incrementCounter();
        // Warning because : The static method incrementCounter() from the type StaticExample should be accessed in a static way

        obj2.showCounter();
    }
}

/*
    Yes, the warning you're seeing is likely due to the fact that you're accessing the **static variable** `counter` and the **static method** `incrementCounter()` through an **instance** of the class (`obj1.showCounter()` and `obj2.showCounter()`). 

    Even though this is allowed by Java (since static members are accessible via instances as well), it's **not recommended** because static members are meant to be accessed using the class name, not instances. This could lead to confusion or potential misuse, which is why modern compilers may warn about it.

    ### The correct way to access static members would be:
    ```java
    StaticExample.showCounter(); // Accessing via the class name
    ```

    ### Why does the warning appear?
    - **Static** means the field or method belongs to the class, not to any instance of the class.
    - The warning tells you that while Java allows you to access static members via an instance, it’s not the preferred or intended way, since it suggests that the static member is part of an instance (which it is not).

    To remove the warning, you can either:
    1. **Access the static member using the class name**:
    ```java
    StaticExample.incrementCounter();
    StaticExample.showCounter(); // Use the class name for static members
    ```
    
    2. **Remove the instance method `showCounter()` and make it static** (if it only deals with static variables), so it can be called the same way:
    ```java
    static void showCounter() {
        System.out.println("Counter value: " + counter);
    }
    ```

    This way, you’ll avoid the warning and follow best practices.
*/