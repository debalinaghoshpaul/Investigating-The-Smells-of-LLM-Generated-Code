
import java.util.Map;
import java.util.TreeMap;
import java.util.NavigableSet;

public class KeysOfMapAsNavigableSet {

    public static void main(String[] args) {
        // Create a TreeMap
        Map<String, Integer> map = new TreeMap<>();

        // Add some key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);

        // Get a NavigableSet view of the keys in the map
        NavigableSet<String> keys = map.navigableKeySet();

        // Print the keys in the set
        System.out.println("Keys in the map:");
        for (String key : keys) {
            System.out.println(key);
        }
    }
}

