// Class in the same package
class AccessSpecifiersExample {

    // Public method - Accessible everywhere
    public void publicMethod() {
        System.out.println("Public method: Accessible everywhere.");
    }

    // Protected method - Accessible within the same package and by subclasses
    protected void protectedMethod() {
        System.out.println("Protected method: Accessible within same package and by subclasses.");
    }

    // Default method (no modifier) - Accessible only within the same package
    void defaultMethod() {
        System.out.println("Default method: Accessible only within the same package.");
    }

    // Private method - Accessible only within this class
    private void privateMethod() {
        System.out.println("Private method: Accessible only within this class.");
    }

    // Method to demonstrate all access
    void demonstrateAccess() {
        publicMethod();    
        protectedMethod(); 
        defaultMethod();   
        privateMethod();   
    }
}

// Subclass in the same package
class SubClass extends AccessSpecifiersExample {
    void showAccess() {
        publicMethod();    // Accessible
        protectedMethod(); // Accessible because it's inherited
        // defaultMethod(); // Not accessible if it's in a different package
        // privateMethod(); // Not accessible (private method)
    }
}

public class TestAccessSpecifiers {
    public static void main(String[] args) {
        AccessSpecifiersExample obj = new AccessSpecifiersExample();
        
        // Accessing methods from the same class
        obj.publicMethod();      // Accessible everywhere
        obj.protectedMethod();   // Accessible within same package
        obj.defaultMethod();     // Accessible within same package
        // obj.privateMethod();     // Accessible only in the same class (inside demonstrateAccess)

        // Calling the demonstrateAccess method inside the same class
        obj.demonstrateAccess();

        // Accessing methods from subclass
        SubClass subObj = new SubClass();
        subObj.showAccess(); // Can access public and protected methods but not default/private

        // Accessing default and private methods would lead to error outside the class/package
    }
}
