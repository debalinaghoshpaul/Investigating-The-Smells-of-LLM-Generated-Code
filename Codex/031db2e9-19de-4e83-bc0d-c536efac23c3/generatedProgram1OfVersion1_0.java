import java.util.Map;
import java.util.TreeMap;

public class MapPortion {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some key-value pairs to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Get the portion of the map based on the key range
        Map<Integer, String> portion = map.subMap(2, 4);

        // Print the portion of the map
        for (Map.Entry<Integer, String> entry : portion.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}