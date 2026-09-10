import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a map
        Map<Integer, String> map = new HashMap<>();
        
        // Add key-value pairs to the map
        map.put(1, "Value 1");
        map.put(3, "Value 3");
        map.put(2, "Value 2");
        
        // Get the greatest key and the associated value
        Integer greatestKey = Collections.max(map.keySet());
        String greatestValue = map.get(greatestKey);
        
        // Get the least key and the associated value
        Integer leastKey = Collections.min(map.keySet());
        String leastValue = map.get(leastKey);
        
        // Print the key-value mappings
        System.out.println("Greatest Key: " + greatestKey + ", Value: " + greatestValue);
        System.out.println("Least Key: " + leastKey + ", Value: " + leastValue);
    }
}
