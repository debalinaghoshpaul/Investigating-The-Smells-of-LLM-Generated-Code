import java.util.HashMap;
import java.util.Map;

public class GetGreatestKeyLessThan {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        int key = 3;
        Integer greatestKeyLessThan = getGreatestKeyLessThan(map, key);

        if (greatestKeyLessThan != null) {
            System.out.println("Greatest key strictly less than " + key + " is: " + greatestKeyLessThan);
        } else {
            System.out.println("No such key exists");
        }
    }

    public static Integer getGreatestKeyLessThan(Map<Integer, String> map, int key) {
        Integer greatestKeyLessThan = null;

        for (Integer mapKey : map.keySet()) {
            if (mapKey < key && (greatestKeyLessThan == null || mapKey > greatestKeyLessThan)) {
                greatestKeyLessThan = mapKey;
            }
        }

        return greatestKeyLessThan;
    }
}
