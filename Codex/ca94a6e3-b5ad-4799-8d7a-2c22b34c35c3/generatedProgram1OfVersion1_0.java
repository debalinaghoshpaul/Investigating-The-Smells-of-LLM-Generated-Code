import java.util.*;

public class TreeMapSortExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("John", 25);
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 20);
        treeMap.put("David", 35);

        // Create a custom comparator to sort keys in descending order
        Comparator<String> descendingComparator = (key1, key2) -> key2.compareTo(key1);

        // Create a sorted TreeMap using the custom comparator
        TreeMap<String, Integer> sortedTreeMap = new TreeMap<>(descendingComparator);
        sortedTreeMap.putAll(treeMap);

        // Print the sorted TreeMap
        for (Map.Entry<String, Integer> entry : sortedTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}