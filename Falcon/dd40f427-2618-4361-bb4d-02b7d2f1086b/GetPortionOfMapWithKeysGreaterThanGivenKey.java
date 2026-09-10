import java.util.HashMap;
import java.util.Map;

public class GetPortionOfMapWithKeysGreaterThanGivenKey {

    public static void main(String[] args) {
        // create a hash map
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        // get a portion of the map whose keys are greater than a given key
        String key = "c";
        Map<String, Integer> subMap = map.tailMap(key);

        // print the sub map
        System.out.println(subMap);
    }
}
