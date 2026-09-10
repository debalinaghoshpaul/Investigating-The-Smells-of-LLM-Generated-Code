import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

        // Get the portion of the map whose keys are greater than or equal to a given key
        int givenKey = 3;
        Map<Integer, String> portion = map.tailMap(givenKey);

        // Print the portion of the map
        for (Map.Entry<Integer, String> entry : portion.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}