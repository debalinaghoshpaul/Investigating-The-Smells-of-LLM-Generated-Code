import java.util.HashMap;
import java.util.Map;

public class MapContainsKeyTest {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        // Specify the key to check
        String keyToCheck = "key2";

        // Check if the map contains the specified key
        if (map.containsKey(keyToCheck)) {
            System.out.println("The map contains the key: " + keyToCheck);
        } else {
            System.out.println("The map does not contain the key: " + keyToCheck);
        }
    }
}
