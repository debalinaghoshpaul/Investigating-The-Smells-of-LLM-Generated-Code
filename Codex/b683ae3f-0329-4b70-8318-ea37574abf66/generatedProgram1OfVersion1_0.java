import java.util.HashSet;
import java.util.Set;

public class CompareSets {
    public static void main(String[] args) {
        // Create the first set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Create the second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Retain the elements that are the same
        set1.retainAll(set2);

        // Print the retained elements
        System.out.println("Retained elements: " + set1);
    }
}