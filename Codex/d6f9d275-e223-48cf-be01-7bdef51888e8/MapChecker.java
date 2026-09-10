import java.util.Map;

public class MapChecker {
    public static void main(String[] args) {
        // Create an empty map
        Map<String, Integer> map = new HashMap<>();

        // Check if the map is empty
        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }
    }
}
