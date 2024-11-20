abstract class Dog {
    abstract void makeSound();
    int Age;

    int getAge() {
        return Age;
    }

    void setAge(int age) {
        Age = age;
    }

    public void bark() {
        System.out.println("Bark");
    }
}

interface PlantTypes {
    void plantHeight();
    void plantWeight();
    void plantColor();
}

class GermanShepherd extends Dog {
    @Override
    void makeSound() {
        System.out.println("Bark Bark");
    }
}

class Plant implements PlantTypes {
    @Override
    public void plantHeight() {
        System.out.println("Plant height is 10 feet.");
    }

    @Override
    public void plantWeight() {
        System.out.println("Plant weight is 5 kg.");
    }

    @Override
    public void plantColor() {
        System.out.println("Plant color is green.");
    }
}

class Animal {
    static String animal = "He is an Animal";

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

class Main {
    public static void AddTwoNumber(int a, int b) {
        int result = a + b;
        System.out.println("Addition of two number is: " + result);
    }

    public static void StringTester() {
        String str1 = "Shardendu Mishra in String One";
        System.out.println(str1);

        String str2 = "    Shardendu Mishra   ";
        System.out.println(str2.trim());
    }

    public static void main(String[] args) {
        System.out.println("Learning JAVA-OOPS Program");
        AddTwoNumber(10, 20);
        StringTester();

        // Animal and Cat objects
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();

        // Working with Dog and GermanShepherd
        Dog dog = new GermanShepherd();
        dog.setAge(5);
        System.out.println("The dog's age is: " + dog.getAge());
        dog.makeSound();
        dog.bark();

        // Working with Plant and PlantTypes interface
        Plant plant = new Plant();
        plant.plantHeight();
        plant.plantWeight();
        plant.plantColor();
    }
}