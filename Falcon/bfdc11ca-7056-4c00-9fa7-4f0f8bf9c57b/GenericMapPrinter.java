import java.util.Map;
import java.util.Set;

public class GenericMapPrinter {
    public static <K, V> void printMap(Map<K, V> map) {
        Set<K> keys = map.keySet();
        for (K key : keys) {
            V value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = Map.of("One", 1, "Two", 2, "Three", 3);
        printMap(stringIntegerMap);

        Map<Integer, String> integerStringMap = Map.of(1, "One", 2, "Two", 3, "Three");
        printMap(integerStringMap);

        // Corner cases
        Map<String, Integer> emptyMap = Map.of();
        printMap(emptyMap);

        Map<Object, Object> objectMap = Map.of(new Object(), new Object(), "key", "value");
        printMap(objectMap);
    }
}

