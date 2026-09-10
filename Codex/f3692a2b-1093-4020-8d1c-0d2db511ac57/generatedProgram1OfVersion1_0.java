import java.util.HashMap;
import java.util.Map;

public class MapCopyExample {
    public static void main(String[] args) {
        // Create the source map
        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("A", 1);
        sourceMap.put("B", 2);
        sourceMap.put("C", 3);

        // Create the destination map
        Map<String, Integer> destinationMap = new HashMap<>();

        // Copy all mappings from source map to destination map
        destinationMap.putAll(sourceMap);

        // Print the destination map
        System.out.println("Destination Map: " + destinationMap);
    }
}