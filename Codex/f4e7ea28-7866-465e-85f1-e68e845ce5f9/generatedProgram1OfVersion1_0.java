import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        // Get the set view of keys
        Set<String> keySet = map.keySet();

        // Print the keys
        System.out.println("Keys: " + keySet);
    }
}