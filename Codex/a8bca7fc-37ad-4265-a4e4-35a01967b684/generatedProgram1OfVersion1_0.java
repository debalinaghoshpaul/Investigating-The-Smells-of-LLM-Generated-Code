import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add key-value pairs
        map.put(1, "Value 1");
        map.put(3, "Value 3");
        map.put(5, "Value 5");
        map.put(7, "Value 7");
        map.put(9, "Value 9");

        // Given key
        int givenKey = 6;

        // Get the greatest key less than or equal to the given key
        Integer floorKey = map.floorKey(givenKey);

        // Check if a key exists
        if (floorKey != null) {
            // Get the value associated with the floor key
            String value = map.get(floorKey);
            System.out.println("Key: " + floorKey + ", Value: " + value);
        } else {
            System.out.println("No key found.");
        }
    }
}