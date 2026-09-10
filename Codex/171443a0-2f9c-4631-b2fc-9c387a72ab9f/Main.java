import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add key-value pairs to the map
        map.put(1, "Value 1");
        map.put(3, "Value 3");
        map.put(2, "Value 2");

        // Remove and get the mapping with the greatest key
        Map.Entry<Integer, String> entry = map.pollLastEntry();

        // Print the removed key-value mapping
        System.out.println("Removed Key: " + entry.getKey());
        System.out.println("Removed Value: " + entry.getValue());
    }
}
