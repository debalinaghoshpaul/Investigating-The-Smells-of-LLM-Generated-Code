import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Specify the value to check
        int valueToCheck = 2;

        // Check if the map contains the specified value
        boolean containsValue = map.containsValue(valueToCheck);

        // Print the result
        if (containsValue) {
            System.out.println("The map contains the value " + valueToCheck);
        } else {
            System.out.println("The map does not contain the value " + valueToCheck);
        }
    }
}