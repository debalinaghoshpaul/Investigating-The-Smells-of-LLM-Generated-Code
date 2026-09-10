import java.util.TreeSet;

public class RemoveElementFromTreeSet {

    public static void main(String[] args) {
        // Create a tree set
        TreeSet<String> treeSet = new TreeSet<>();

        // Add some elements to the tree set
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        // Print the tree set
        System.out.println("Tree set: " + treeSet);

        // Remove an element from the tree set
        treeSet.remove("Banana");

        // Print the tree set again
        System.out.println("Tree set after removing Banana: " + treeSet);
    }
}
