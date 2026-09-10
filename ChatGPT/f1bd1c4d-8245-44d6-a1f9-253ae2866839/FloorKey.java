import java.util.Map;
import java.util.TreeMap;

public class FloorKey {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Put elements to the map
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        treeMap.put(6, "Six");
        treeMap.put(8, "Eight");

        // Get the floor key for key 5
        Integer floorKey = treeMap.floorKey(5);

        // Print the floor key and its value
        if (floorKey != null) {
            System.out.println("Floor key: " + floorKey);
            System.out.println("Value associated with the floor key: " + treeMap.get(floorKey));
        } else {
            System.out.println("No floor key found.");
        }
    }
}
