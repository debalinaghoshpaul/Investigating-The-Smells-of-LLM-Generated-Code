import java.util.HashMap;
import java.util.Map;

public class ShallowCopyHashMap {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Put elements into the HashMap
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 3);

        // Get a shallow copy of the HashMap
        Map<String, Integer> shallowCopy = new HashMap<>(hm);

        // Modify the shallow copy
        shallowCopy.put("four", 4);

        // Print the original HashMap
        System.out.println("Original HashMap: " + hm);

        // Print the shallow copy
        System.out.println("Shallow copy: " + shallowCopy);
    }
}
