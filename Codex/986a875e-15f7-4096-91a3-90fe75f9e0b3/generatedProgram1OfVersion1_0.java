import java.util.*;

public class MapKeysExample {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        
        // Add some key-value pairs to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Grapes", 4);
        
        // Get the first (lowest) key
        String firstKey = map.keySet().stream().findFirst().orElse(null);
        System.out.println("First key: " + firstKey);
        
        // Get the last (highest) key
        String lastKey = map.keySet().stream().reduce((first, second) -> second).orElse(null);
        System.out.println("Last key: " + lastKey);
    }
}