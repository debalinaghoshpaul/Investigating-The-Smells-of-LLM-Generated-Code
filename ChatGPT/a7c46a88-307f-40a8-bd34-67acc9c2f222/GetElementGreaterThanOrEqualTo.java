import java.util.TreeSet;

public class GetElementGreaterThanOrEqualTo {

    public static void main(String[] args) {
        // Create a tree set
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements to the tree set
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);

        // Get the element in the tree set which is greater than or equal to the given element
        Integer element = treeSet.ceiling(3);

        // Print the element
        System.out.println(element); // Output: 3
    }
}
