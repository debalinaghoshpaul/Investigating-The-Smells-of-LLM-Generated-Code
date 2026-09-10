import java.util.HashMap;
import java.util.Map;

public class RemoveAllMappingsFromMap {

    public static void main(String[] args) {
        // create a map
        Map<String, Integer> map = new HashMap<>();

        // add some mappings to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // print the map before removing all mappings
        System.out.println("Map before removing all mappings: " + map);

        // remove all mappings from the map
        map.clear();

        // print the map after removing all mappings
        System.out.println("Map after removing all mappings: " + map);
    }
}
