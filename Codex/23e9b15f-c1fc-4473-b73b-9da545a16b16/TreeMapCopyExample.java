import java.util.TreeMap;

public class TreeMapCopyExample {
    public static void main(String[] args) {
        // Create the source TreeMap
        TreeMap<String, Integer> sourceMap = new TreeMap<>();
        sourceMap.put("A", 1);
        sourceMap.put("B", 2);
        sourceMap.put("C", 3);

        // Create the destination TreeMap
        TreeMap<String, Integer> destinationMap = new TreeMap<>();

        // Copy the contents of the source TreeMap to the destination TreeMap
        destinationMap.putAll(sourceMap);

        // Print the contents of the destination TreeMap
        System.out.println("Destination TreeMap: " + destinationMap);
    }
}
