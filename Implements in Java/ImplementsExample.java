public class ImplementsExample {

    // Defining the interface
    interface Animal {
        void eat();
        void sleep();
    }

    // Implementing the interface in Dog class
    static class Dog implements Animal {
        public void eat() {
            System.out.println("The dog eats food.");
        }

        public void sleep() {
            System.out.println("The dog sleeps soundly.");
        }
    }

    // Implementing the interface in Cat class
    static class Cat implements Animal {
        public void eat() {
            System.out.println("The cat eats fish.");
        }

        public void sleep() {
            System.out.println("The cat naps quietly.");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog(); // Polymorphism: Animal reference, Dog object
        dog.eat();
        dog.sleep();

        Animal cat = new Cat(); // Polymorphism: Animal reference, Cat object
        cat.eat();
        cat.sleep();
    }
}