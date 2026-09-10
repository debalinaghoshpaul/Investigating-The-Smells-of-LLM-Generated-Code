import java.util.HashMap;
import java.util.Map;

public class CountKeyValueMappings {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Carol", 35);

        // Get the number of key-value mappings in the map
        int size = map.size();

        // Print the size of the map
        System.out.println("The size of the map is: " + size);
    }
}
