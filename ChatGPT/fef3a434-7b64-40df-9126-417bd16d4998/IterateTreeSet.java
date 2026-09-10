import java.util.TreeSet;
import java.util.Iterator;

public class IterateTreeSet {

    public static void main(String[] args) {
        // Create a tree set
        TreeSet<String> treeSet = new TreeSet<>();

        // Add some elements to the tree set
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        // Create an iterator for the tree set
        Iterator<String> iterator = treeSet.iterator();

        // Iterate through the tree set using the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
