import java.util.HashMap;
import java.util.Map;

public class MapPortion {
    public static void main(String[] args) {
        // Create a map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Given key
        int givenKey = 3;

        // Get the portion of the map whose keys are greater than the given key
        Map<Integer, String> portion = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > givenKey) {
                portion.put(entry.getKey(), entry.getValue());
            }
        }

        // Print the portion of the map
        System.out.println("Portion of the map:");
        for (Map.Entry<Integer, String> entry : portion.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
