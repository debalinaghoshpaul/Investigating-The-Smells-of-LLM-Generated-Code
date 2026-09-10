import java.util.HashMap;
import java.util.Map;

public class GetKeyGreaterThanOrEqualTo {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);

        System.out.println(getKeyGreaterThanOrEqualTo(map, 2)); // 3
        System.out.println(getKeyGreaterThanOrEqualTo(map, 3)); // 4
        System.out.println(getKeyGreaterThanOrEqualTo(map, 4)); // null
    }

    public static Integer getKeyGreaterThanOrEqualTo(Map<Integer, Integer> map, Integer key) {
        Integer result = null;
        for (Integer mapKey : map.keySet()) {
            if (mapKey >= key) {
                result = mapKey;
                break;
            }
        }
        return result;
    }
}
