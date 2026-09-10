import java.util.TreeMap;
import java.util.Map;

public class GetFirstAndLastKeyOfMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        // Get the first key
        int firstKey = map.firstKey();
        System.out.println("First Key: " + firstKey);

        // Get the last key
        int lastKey = map.lastKey();
        System.out.println("Last Key: " + lastKey);
    }
}
