import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Orange");

        // Clone the original HashSet to a new HashSet
        HashSet<String> clonedSet = new HashSet<>(originalSet);

        // Print the original and cloned HashSets
        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Cloned HashSet: " + clonedSet);
    }
}