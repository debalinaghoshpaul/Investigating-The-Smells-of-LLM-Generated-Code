import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some key-value pairs to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Get the NavigableSet view of keys
        NavigableSet<Integer> keySet = map.navigableKeySet();

        // Print the keys
        for (Integer key : keySet) {
            System.out.println(key);
        }
    }
}
