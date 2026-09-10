import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");

        // Get the number of elements in the HashSet
        int size = set.size();

        // Print the number of elements
        System.out.println("Number of elements in the HashSet: " + size);
    }
}
