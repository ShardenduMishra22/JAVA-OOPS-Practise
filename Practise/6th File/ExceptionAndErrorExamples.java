public class ExceptionAndErrorExamples {
    
    // NullPointerException Example
    public static void nullPointerExceptionExample() {
        String str = null;
        // This will throw NullPointerException
        System.out.println(str.length());
    }

    // ArrayIndexOutOfBoundsException Example
    public static void arrayIndexOutOfBoundsExceptionExample() {
        int[] arr = new int[5];
        // This will throw ArrayIndexOutOfBoundsException
        System.out.println(arr[10]);
    }

    // ArithmeticException Example
    public static void arithmeticExceptionExample() {
        int a = 10;
        int b = 0;
        // This will throw ArithmeticException
        System.out.println(a / b);
    }

    // IllegalArgumentException Example
    public static void illegalArgumentExceptionExample() {
        // This will throw IllegalArgumentException
        throw new IllegalArgumentException("Invalid argument passed");
    }

    // NumberFormatException Example
    public static void numberFormatExceptionExample() {
        String str = "abc";
        // This will throw NumberFormatException
        int number = Integer.parseInt(str);
    }

    // ClassCastException Example
    public static void classCastExceptionExample() {
        Object obj = new String("Hello");
        // This will throw ClassCastException
        Integer num = (Integer) obj;
    }

    // IllegalStateException Example
    public static void illegalStateExceptionExample() {
        // This will throw IllegalStateException
        throw new IllegalStateException("Illegal state encountered");
    }

    // OutOfMemoryError Example
    public static void outOfMemoryErrorExample() {
        // This will throw OutOfMemoryError due to memory exhaustion
        long[] largeArray = new long[Integer.MAX_VALUE];
    }

    // StackOverflowError Example
    public static void stackOverflowErrorExample() {
        // This will throw StackOverflowError due to infinite recursion
        recursiveMethod();
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }

    // VirtualMachineError Example
    public static void virtualMachineErrorExample() {
        // This will throw VirtualMachineError (just an example; these are rare and not usually thrown directly)
        throw new VirtualMachineError("VM error occurred") {};
    }

    // AssertionError Example
    public static void assertionErrorExample() {
        // This will throw AssertionError if assertions are enabled
        assert false : "Assertion failed";
    }

    // LinkageError Example
    public static void linkageErrorExample() {
        // This will throw LinkageError if there is a class loading issue
        // This is a rare error and can be simulated with mismatched class versions, for example.
        throw new LinkageError("Linkage error occurred");
    }

    public static void main(String[] args) {
        try {
            nullPointerExceptionExample();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        try {
            arrayIndexOutOfBoundsExceptionExample();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        try {
            arithmeticExceptionExample();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        try {
            illegalArgumentExceptionExample();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        try {
            numberFormatExceptionExample();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        try {
            classCastExceptionExample();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        try {
            illegalStateExceptionExample();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        try {
            outOfMemoryErrorExample();
        } catch (Error e) {
            System.out.println("Caught error: " + e);
        }
        try {
            stackOverflowErrorExample();
        } catch (Error e) {
            System.out.println("Caught error: " + e);
        }
        try {
            virtualMachineErrorExample();
        } catch (Error e) {
            System.out.println("Caught error: " + e);
        }
        try {
            assertionErrorExample();
        } catch (Error e) {
            System.out.println("Caught error: " + e);
        }
        try {
            linkageErrorExample();
        } catch (Error e) {
            System.out.println("Caught error: " + e);
        }
    }
}


// Errors: These are severe problems that are typically not recoverable. 
// Errors usually occur due to environmental issues like system failures, hardware problems, or JVM internal issues.
// Examples: OutOfMemoryError, StackOverflowError, VirtualMachineError.

// Exceptions: These are events that can be caught and handled by the program. 
// They are generally caused by issues in the code, such as invalid input or logic errors, and can be recovered from.
// Examples: NullPointerException, ArithmeticException, IllegalArgumentException.