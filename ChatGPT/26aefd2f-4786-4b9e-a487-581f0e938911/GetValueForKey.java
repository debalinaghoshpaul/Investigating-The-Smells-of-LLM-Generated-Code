import java.util.HashMap;
import java.util.Map;

public class GetValueForKey {

    public static void main(String[] args) {
        // Create a map
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("name", "John Doe");
        map.put("age", "30");
        map.put("city", "New York");

        // Get the value for a specified key
        String name = map.get("name");

        // Print the value
        System.out.println(name); // Output: John Doe
    }
}
