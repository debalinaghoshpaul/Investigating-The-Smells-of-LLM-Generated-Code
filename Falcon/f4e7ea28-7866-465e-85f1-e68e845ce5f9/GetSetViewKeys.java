import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetSetViewKeys {

    public static void main(String[] args) {
        // create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // put some key-value pairs into the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // get a Set view of the keys in the map
        Set<String> keySet = map.keySet();

        // print the Set of keys
        System.out.println(keySet);
    }
}
