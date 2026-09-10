import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Print the HashSet before emptying
        System.out.println("HashSet before emptying: " + set);

        // Empty the HashSet
        set.clear();

        // Print the HashSet after emptying
        System.out.println("HashSet after emptying: " + set);
    }
}
