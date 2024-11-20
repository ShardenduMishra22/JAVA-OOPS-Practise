public class StringExample {
    public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello";
        String str2 = "Java";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println(result);  // "Hello Java"

        // String Length
        System.out.println("Length of str1: " + str1.length());  // 5

        // Extracting a substring
        String subStr = str2.substring(0, 2);
        System.out.println("Substring: " + subStr);  // "Ja"

        // Comparing Strings
        String str3 = "hello";
        boolean isEqual = str1.equals(str3);
        System.out.println("str1 equals str3: " + isEqual);  // false

        // Ignoring case in comparison
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("str1 equals str3 ignoring case: " + isEqualIgnoreCase);  // true

        // Changing case
        System.out.println("str1 in lowercase: " + str1.toLowerCase());  // "hello"
        System.out.println("str2 in uppercase: " + str2.toUpperCase());  // "JAVA"

        // Trimming whitespaces
        String str4 = "   Java Programming   ";
        System.out.println("Trimmed: " + str4.trim());  // "Java Programming"

        // Replacing characters
        String replacedStr = str2.replace('J', 'C');
        System.out.println("Replaced String: " + replacedStr);  // "Cava"

        // Checking if a string contains a substring
        boolean contains = str1.contains("ell");
        System.out.println("str1 contains 'ell': " + contains);  // true
    }
}
