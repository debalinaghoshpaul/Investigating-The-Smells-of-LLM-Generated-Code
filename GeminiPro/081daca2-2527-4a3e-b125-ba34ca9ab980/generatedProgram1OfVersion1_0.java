import java.util.*;

public class GetRemoveLastElementTreeSet {

    public static void main(String[] args) {
        // create a tree set
        TreeSet<String> treeSet = new TreeSet<>();

        // add some elements to the tree set
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cherry");
        treeSet.add("durian");
        treeSet.add("elderberry");

        // retrieve and remove the last element of the tree set
        String lastElement = treeSet.pollLast();

        // print the last element
        System.out.println("Last element: " + lastElement);

        // print the remaining elements in the tree set
        System.out.println("Remaining elements: " + treeSet);
    }
}
