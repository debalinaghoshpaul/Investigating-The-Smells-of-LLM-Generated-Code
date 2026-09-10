import java.util.TreeSet;

public class AddAllElementsOfATreeSetToAnotherTreeSet {

    public static void main(String[] args) {
        // Create a tree set
        TreeSet<Integer> treeSet1 = new TreeSet<>();

        // Add elements to the tree set
        treeSet1.add(1);
        treeSet1.add(2);
        treeSet1.add(3);
        treeSet1.add(4);
        treeSet1.add(5);

        // Create another tree set
        TreeSet<Integer> treeSet2 = new TreeSet<>();

        // Add all the elements of treeSet1 to treeSet2
        treeSet2.addAll(treeSet1);

        // Print the elements of treeSet2
        System.out.println(treeSet2);
    }
}
