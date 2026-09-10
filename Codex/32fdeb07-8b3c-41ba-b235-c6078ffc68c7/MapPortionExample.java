import java.util.Map;
import java.util.TreeMap;

public class MapPortionExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some key-value pairs to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Define the range of keys
        int startKey = 2;
        int endKey = 4;

        // Get the portion of the map whose keys range from startKey to endKey
        Map<Integer, String> portion = map.subMap(startKey, endKey + 1);

        // Print the portion of the map
        for (Map.Entry<Integer, String> entry : portion.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
