import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GetPortionOfMapLessThanKey {

    public static void main(String[] args) {
        // create a map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);
        map.put("Elderberry", 5);

        // get the portion of the map whose keys are strictly less than "Date"
        Map<String, Integer> subMap = map.headMap("Date");

        // print the sub map
        System.out.println(subMap); // {Apple=1, Banana=2, Cherry=3}
    }
}
