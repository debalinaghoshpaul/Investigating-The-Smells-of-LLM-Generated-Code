import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some key-value pairs to the map
        map.put(1, "Apple");
        map.put(3, "Banana");
        map.put(5, "Grape");
        map.put(7, "Orange");
        map.put(9, "Pineapple");

        // Call the method to get the least key
        Integer leastKey = getLeastKey(map, 4);

        // Print the result
        System.out.println("Least key greater than or equal to 4: " + leastKey);
    }

    public static Integer getLeastKey(TreeMap<Integer, String> map, int target) {
        // Use the ceilingKey() method to get the least key greater than or equal to the target
        Integer leastKey = map.ceilingKey(target);

        // Return null if there is no such key
        if (leastKey == null) {
            return null;
        }

        // Otherwise, return the least key
        return leastKey;
    }
}
