import java.util.TreeMap;

public class TreeMapSearch {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("cherry", 3);
        treeMap.put("date", 4);
        treeMap.put("elderberry", 5);

        // Search for a key in the TreeMap
        String keyToSearch = "cherry";
        if (treeMap.containsKey(keyToSearch)) {
            int value = treeMap.get(keyToSearch);
            System.out.println("Key found! Value: " + value);
        } else {
            System.out.println("Key not found!");
        }
    }
}
