import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IterateHashMap {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Get the set of keys from the HashMap
        Set<String> keys = hashMap.keySet();

        // Create an iterator for the set of keys
        Iterator<String> iterator = keys.iterator();

        // Iterate through the set of keys and print the key-value pairs
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = hashMap.get(key);

            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
