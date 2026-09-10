import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("key1", 10);
        map.put("key2", 20);
        map.put("key3", 30);

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Associate a new value with a key
        map.put("key2", 50);

        // Print the updated HashMap
        System.out.println("Updated HashMap: " + map);
    }
}