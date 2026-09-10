import java.util.HashMap;
import java.util.Map;

public class MapRemovalExample {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        
        // Add some mappings to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        System.out.println("Map before removal: " + map);
        
        // Remove all mappings from the map
        map.clear();
        
        System.out.println("Map after removal: " + map);
    }
}