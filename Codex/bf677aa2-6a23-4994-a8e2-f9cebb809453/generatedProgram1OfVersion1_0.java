import java.util.HashMap;
import java.util.Map;

public class HashListIterator {
    public static void main(String[] args) {
        // Create a hash list
        Map<String, Integer> hashList = new HashMap<>();
        hashList.put("A", 1);
        hashList.put("B", 2);
        hashList.put("C", 3);
        hashList.put("D", 4);
        hashList.put("E", 5);

        // Iterate through all elements in the hash list
        for (Map.Entry<String, Integer> entry : hashList.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}