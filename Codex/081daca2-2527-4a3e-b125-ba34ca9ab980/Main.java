import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Retrieve and remove the last element
        if (!treeSet.isEmpty()) {
            int lastElement = treeSet.last();
            treeSet.remove(lastElement);
            System.out.println("Last element removed: " + lastElement);
        } else {
            System.out.println("TreeSet is empty");
        }

        // Print the updated TreeSet
        System.out.println("Updated TreeSet: " + treeSet);
    }
}
