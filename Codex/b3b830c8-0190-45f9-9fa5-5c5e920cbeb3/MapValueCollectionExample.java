import java.util.*;

public class MapValueCollectionExample {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Get the collection view of values
        Collection<Integer> values = map.values();

        // Print the values
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
