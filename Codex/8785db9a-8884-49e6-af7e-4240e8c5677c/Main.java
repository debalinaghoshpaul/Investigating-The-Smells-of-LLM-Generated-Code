import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(6);

        // Retrieve and remove the first element
        if (!treeSet.isEmpty()) {
            int firstElement = treeSet.pollFirst();
            System.out.println("First element: " + firstElement);
        } else {
            System.out.println("TreeSet is empty");
        }
    }
}
