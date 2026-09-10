import java.util.*;

public class TreeMapSearch {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        // Adding key-value pairs to the TreeMap
        treeMap.put(1, "John");
        treeMap.put(2, "Alex");
        treeMap.put(3, "Emily");
        treeMap.put(4, "Simon");
        treeMap.put(5, "Olivia");
        
        // Searching for a key in the TreeMap
        int keyToSearch = 3;
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found with value: " + treeMap.get(keyToSearch));
        } else {
            System.out.println("Key " + keyToSearch + " not found in the TreeMap");
        }
    }
}
