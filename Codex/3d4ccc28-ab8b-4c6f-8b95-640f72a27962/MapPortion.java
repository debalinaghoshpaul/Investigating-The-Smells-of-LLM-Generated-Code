import java.util.*;

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

        // Get the portion of the map whose keys are strictly less than a given key
        int givenKey = 4;
        SortedMap<Integer, String> portion = map.headMap(givenKey);

        // Print the portion of the map
        System.out.println("Portion of the map whose keys are strictly less than " + givenKey + ":");
        for (Map.Entry<Integer, String> entry : portion.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
