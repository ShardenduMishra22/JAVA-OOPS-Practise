class Calculator {

    // Overloaded methods with different parameters

    // Method with one parameter
    public int add(int a) {
        return a + 10;
    }

    // Method with two parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with two parameters but different data types
    public double add(double a, double b) {
        return a + b;
    }

    // Method with parameters in a different order
    public String add(String a, int b) {
        return a + b;
    }
}

public class TestOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println(calc.add(5));          // Calls add(int)
        System.out.println(calc.add(5, 10));      // Calls add(int, int)
        System.out.println(calc.add(5.5, 10.5));  // Calls add(double, double)
        System.out.println(calc.add("Value: ", 5)); // Calls add(String, int)
    }
}
