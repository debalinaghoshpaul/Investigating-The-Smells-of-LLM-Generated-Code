import java.util.Comparator;
import java.util.TreeMap;

public class SortKeysInTreeMapByUsingComparator {

    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());

        // Put elements into the TreeMap
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        // Print the sorted keys
        System.out.println("Sorted keys in reverse order:");
        for (Integer key : treeMap.keySet()) {
            System.out.println(key);
        }
    }
}
