import java.util.TreeMap;

public class KeyValueMapping {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add key-value pairs to the map
        map.put(1, "Value 1");
        map.put(3, "Value 3");
        map.put(5, "Value 5");
        map.put(7, "Value 7");
        map.put(9, "Value 9");

        // Given key
        int key = 4;

        // Get the least key greater than or equal to the given key
        Integer result = map.ceilingKey(key);

        // Check if there is a key greater than or equal to the given key
        if (result != null) {
            // Get the value associated with the key
            String value = map.get(result);
            System.out.println("Key: " + result + ", Value: " + value);
        } else {
            System.out.println("No key found.");
        }
    }
}