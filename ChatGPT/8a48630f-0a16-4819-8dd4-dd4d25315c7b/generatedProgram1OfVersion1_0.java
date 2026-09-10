import java.util.HashMap;
import java.util.Map;

public class FindDuplicateValues {

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "grapes", "orange"};

        findDuplicateValues(array);
    }

    public static void findDuplicateValues(String[] array) {
        Map<String, Integer> map = new HashMap<>();

        for (String item : array) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        System.out.println("Duplicate values in the array are: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
