import java.util.HashSet;
import java.util.TreeSet;

public class ConvertHashSetToTreeSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        // Convert HashSet to TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        // Print the elements of the TreeSet
        System.out.println("Elements in the TreeSet:");
        for (String element : treeSet) {
            System.out.println(element);
        }
    }
}
