import java.util.TreeMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value pairs
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);
        treeMap.put("Grapes", 4);

        // Get all keys from the TreeMap
        Set<String> keys = treeMap.keySet();

        // Print all keys
        for (String key : keys) {
            System.out.println(key);
        }
    }
}