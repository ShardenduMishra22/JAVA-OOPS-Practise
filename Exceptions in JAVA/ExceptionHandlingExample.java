public class ExceptionHandlingExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // --- 1. Handling ArithmeticException ---
        try {
            int result = 10 / 0; // This will throw ArithmeticException (divide by zero)
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        // --- 2. Handling ArrayIndexOutOfBoundsException ---
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // --- 3. Handling NumberFormatException ---
        try {
            String invalidNumber = "abc";
            int num = Integer.parseInt(invalidNumber); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        // --- 4. Handling Multiple Exceptions with Multiple Catch Blocks ---
        try {
            String text = null;
            System.out.println(text.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            // This will catch any other exceptions that were not caught by specific catch blocks
            System.out.println("Exception caught: " + e.getMessage());
        }

        // --- 5. Using Finally Block ---
        try {
            System.out.println("Executing try block");
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in catch block: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed, regardless of exception.");
        }

        // --- 6. Using throw statement to manually throw an exception ---
        try {
            checkAge(15); // This will throw a custom exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught with throw: " + e.getMessage());
        }

        // --- 7. Using throws keyword to declare exceptions ---
        try {
            methodThatThrowsException();
        } catch (Exception e) {
            System.out.println("Exception caught with throws: " + e.getMessage());
        }
    }

    // Custom method that throws an exception
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }

    // Method that throws an exception and is declared to throw it
    public static void methodThatThrowsException() throws Exception {
        throw new Exception("This is an exception thrown from the method.");
    }
}