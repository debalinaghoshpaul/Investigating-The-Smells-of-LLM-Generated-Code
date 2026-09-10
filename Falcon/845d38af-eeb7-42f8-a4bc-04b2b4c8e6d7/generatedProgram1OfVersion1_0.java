import java.util.HashMap;
import java.util.Map;

public class TestMapContainsValue {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Check if the map contains a mapping for the value 2
        boolean containsValue = map.containsValue(2);

        // Print the result
        System.out.println("Does the map contain a mapping for the value 2? " + containsValue);
    }
}
