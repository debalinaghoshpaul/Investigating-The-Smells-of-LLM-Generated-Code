import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some key-value pairs to the map
        map.put(10, "Value 10");
        map.put(20, "Value 20");
        map.put(30, "Value 30");
        map.put(40, "Value 40");
        map.put(50, "Value 50");

        // Call the method to get the greatest key strictly less than the given key
        Integer givenKey = 35;
        Integer result = getGreatestKeyLessThan(map, givenKey);

        // Print the result
        System.out.println("Greatest key strictly less than " + givenKey + ": " + result);
    }

    public static Integer getGreatestKeyLessThan(Map<Integer, String> map, Integer givenKey) {
        // Get a view of the keys in descending order
        Map<Integer, String> descendingMap = map.descendingMap();

        // Iterate through the keys
        for (Integer key : descendingMap.keySet()) {
            // Check if the key is strictly less than the given key
            if (key < givenKey) {
                return key;
            }
        }

        // Return null if no such key is found
        return null;
    }
}