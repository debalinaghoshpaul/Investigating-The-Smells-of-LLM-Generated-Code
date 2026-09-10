import java.util.TreeSet;

public class CloneTreeSet {

    public static void main(String[] args) {
        // create a tree set
        TreeSet<String> treeSet = new TreeSet<>();

        // add elements to the tree set
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        // clone the tree set
        TreeSet<String> clonedTreeSet = new TreeSet<>(treeSet);

        // print the original tree set
        System.out.println("Original tree set: " + treeSet);

        // print the cloned tree set
        System.out.println("Cloned tree set: " + clonedTreeSet);
    }
}
