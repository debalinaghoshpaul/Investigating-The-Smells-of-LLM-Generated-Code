import java.util.*;

public class MapPortion {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add elements to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Given key
        int givenKey = 3;

        // Get the portion of the map
        SortedMap<Integer, String> portion = map.headMap(givenKey, true);

        // Print the portion of the map
        for (Map.Entry<Integer, String> entry : portion.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
