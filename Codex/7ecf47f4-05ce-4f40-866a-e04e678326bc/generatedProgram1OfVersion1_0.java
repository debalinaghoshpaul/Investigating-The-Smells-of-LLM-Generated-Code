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

        // Print the TreeSet before removing an element
        System.out.println("TreeSet before removing an element: " + treeSet);

        // Remove an element from the TreeSet
        int elementToRemove = 30;
        treeSet.remove(elementToRemove);

        // Print the TreeSet after removing an element
        System.out.println("TreeSet after removing " + elementToRemove + ": " + treeSet);
    }
}