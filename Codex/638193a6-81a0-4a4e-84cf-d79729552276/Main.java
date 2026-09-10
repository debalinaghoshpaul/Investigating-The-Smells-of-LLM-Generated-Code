import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet1 = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet1.add("Apple");
        treeSet1.add("Banana");
        treeSet1.add("Orange");

        // Clone the TreeSet to another TreeSet
        TreeSet<String> treeSet2 = new TreeSet<>(treeSet1);

        // Print the cloned TreeSet
        System.out.println("Cloned TreeSet: " + treeSet2);
    }
}
