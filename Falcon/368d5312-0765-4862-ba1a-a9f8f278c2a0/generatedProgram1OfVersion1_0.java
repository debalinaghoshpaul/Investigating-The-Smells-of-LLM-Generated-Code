import java.util.*;

public class GetPortionMap {

    public static void main(String[] args) {
        // create a map
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        // get the portion of the map whose keys are less than or equal to "c"
        Map<String, Integer> subMap = map.subMap("a", true, "c", true);

        // print the submap
        System.out.println(subMap); // {a=1, b=2, c=3}
    }
}
