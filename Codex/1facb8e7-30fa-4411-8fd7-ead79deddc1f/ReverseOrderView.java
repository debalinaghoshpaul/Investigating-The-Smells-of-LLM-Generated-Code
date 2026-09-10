import java.util.*;

public class ReverseOrderView {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);

        // Get the reverse order view of the keys
        List<String> reverseKeys = new ArrayList<>(map.keySet());
        Collections.reverse(reverseKeys);

        // Print the reverse order view of the keys
        System.out.println("Reverse Order View of Keys:");
        for (String key : reverseKeys) {
            System.out.println(key);
        }
    }
}
