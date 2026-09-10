import java.util.TreeMap;

public class TreeMapSearch {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 30);
        treeMap.put("Mango", 40);
        treeMap.put("Grapes", 50);

        // Search for a value in the TreeMap
        int valueToSearch = 30;
        boolean found = false;

        for (int value : treeMap.values()) {
            if (value == valueToSearch) {
                found = true;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println("Value " + valueToSearch + " found in the TreeMap.");
        } else {
            System.out.println("Value " + valueToSearch + " not found in the TreeMap.");
        }
    }
}
