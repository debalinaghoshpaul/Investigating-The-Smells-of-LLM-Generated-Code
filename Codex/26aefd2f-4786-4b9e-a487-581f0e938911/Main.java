import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        
        // Add key-value pairs to the map
        map.put("key1", 10);
        map.put("key2", 20);
        map.put("key3", 30);
        
        // Specify the key for which you want to get the value
        String key = "key2";
        
        // Get the value of the specified key
        Integer value = map.get(key);
        
        // Print the value
        System.out.println("Value of " + key + ": " + value);
    }
}
