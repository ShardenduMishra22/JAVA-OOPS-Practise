import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class DataStructuresExample {
    public static void main(String[] args) {

        // --- 1. Arrays ---
        // Creating an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // --- 2. ArrayList ---
        // ArrayList to store integers dynamically
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        System.out.println("\nArrayList Elements:");
        for (Integer num : arrayList) {
            System.out.println(num);
        }
        arrayList.remove(1);  // Removing element at index 1
        System.out.println("\nArrayList After Removing Element at Index 1:");
        for (Integer num : arrayList) {
            System.out.println(num);
        }

        // --- 3. LinkedList ---
        // LinkedList to store strings
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Charlie");
        System.out.println("\nLinkedList Elements:");
        for (String name : linkedList) {
            System.out.println(name);
        }
        linkedList.remove("Bob");  // Removing "Bob"
        System.out.println("\nLinkedList After Removing Bob:");
        for (String name : linkedList) {
            System.out.println(name);
        }

        // --- 4. HashMap ---
        // HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 22);
        System.out.println("\nHashMap Elements:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        map.remove("Alice");  // Removing the key "Alice"
        System.out.println("\nHashMap After Removing Alice:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // --- 5. HashSet ---
        // HashSet to store unique elements
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate, won't be added
        hashSet.add("Orange");
        System.out.println("\nHashSet Elements (Duplicates are not allowed):");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
    }
}
