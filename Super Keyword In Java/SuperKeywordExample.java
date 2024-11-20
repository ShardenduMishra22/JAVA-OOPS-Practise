class Parent {
    String name = "Parent Class";

    Parent() {
        System.out.println("Parent Constructor Called");
    }

    void display() {
        System.out.println("This is the Parent method");
    }
}

class Child extends Parent {
    String name = "Child Class";

    Child() {
        super(); // Calls the Parent class constructor
        System.out.println("Child Constructor Called");
    }

    void display() {
        System.out.println("This is the Child method");
    }

    void show() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name); // Accesses Parent's variable
        super.display(); // Calls Parent's method
        display();       // Calls Child's method
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}

// Parent Constructor Called
// Child Constructor Called
// Child Class
// Parent Class
// This is the Parent method
// This is the Child method