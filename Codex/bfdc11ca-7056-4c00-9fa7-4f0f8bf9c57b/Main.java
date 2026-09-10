import java.util.Map;

public class Main {
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
        printMap(map);
    }
}
