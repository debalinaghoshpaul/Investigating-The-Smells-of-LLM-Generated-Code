import java.util.TreeMap;

public class TreeMapDeletion {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        treeMap.put("C", 3);
        treeMap.put("D", 4);

        // Print the TreeMap before deletion
        System.out.println("TreeMap before deletion: " + treeMap);

        // Delete all elements from the TreeMap
        treeMap.clear();

        // Print the TreeMap after deletion
        System.out.println("TreeMap after deletion: " + treeMap);
    }
}
