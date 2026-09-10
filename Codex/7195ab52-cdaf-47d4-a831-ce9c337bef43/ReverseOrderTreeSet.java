import java.util.TreeSet;

public class ReverseOrderTreeSet {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);

        // Create a reverse order view of the TreeSet
        TreeSet<Integer> reverseTreeSet = (TreeSet<Integer>) treeSet.descendingSet();

        // Print the elements in reverse order
        System.out.println("Elements in reverse order: " + reverseTreeSet);
    }
}
