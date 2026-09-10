import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Associate a value with a key
        String key = "example";
        int value = 10;
        treeMap.put(key, value);

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);
    }
}