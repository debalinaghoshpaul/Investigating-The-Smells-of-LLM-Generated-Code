import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");

        System.out.println("HashSet before removing elements: " + set);

        // Remove all elements from the HashSet
        set.clear();

        System.out.println("HashSet after removing elements: " + set);
    }
}