// Abstract class with common functionality
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting...");
    }

    abstract void drive(); // Abstract method
}

// Interface for electric capability
interface ElectricVehicle {
    void chargeBattery();

    default void batteryStatus() {
        System.out.println("Battery is fully charged.");
    }
}

// Interface for amphibious capability
interface AmphibiousVehicle {
    void switchMode(String mode); // Abstract method
}

// A concrete class that combines abstract class and interfaces
class AmphibiousCar extends Vehicle implements ElectricVehicle, AmphibiousVehicle {
    AmphibiousCar(String brand) {
        super(brand);
    }

    @Override
    void drive() {
        System.out.println(brand + " is driving...");
    }

    @Override
    public void chargeBattery() {
        System.out.println(brand + " is charging its battery.");
    }

    @Override
    public void switchMode(String mode) {
        System.out.println(brand + " is switching to " + mode + " mode.");
    }
}

// Main class to demonstrate usage
public class Main {
    public static void main(String[] args) {
        AmphibiousCar car = new AmphibiousCar("AmphiCar");

        // Methods from abstract class
        car.start();
        car.drive();

        // Methods from ElectricVehicle interface
        car.chargeBattery();
        car.batteryStatus();

        // Methods from AmphibiousVehicle interface
        car.switchMode("water");
    }
}
