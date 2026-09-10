import java.util.HashMap;
import java.util.Set;

public class CreateSetViewOfMap {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Get a Set view of the mappings contained in the map
        Set<Map.Entry<String, Integer>> setView = map.entrySet();

        // Iterate over the Set view and print the mappings
        for (Map.Entry<String, Integer> entry : setView) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
