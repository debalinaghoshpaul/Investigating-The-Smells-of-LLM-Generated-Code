import java.util.Map;

public class MapSizeCounter {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);

        // Get the size of the map
        int size = map.size();

        // Print the size
        System.out.println("Size of the map: " + size);
    }
}