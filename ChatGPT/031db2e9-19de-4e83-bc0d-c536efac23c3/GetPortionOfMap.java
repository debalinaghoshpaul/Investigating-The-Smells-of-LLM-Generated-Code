import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class GetPortionOfMap {

    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");
        hashMap.put(6, "Six");
        hashMap.put(7, "Seven");
        hashMap.put(8, "Eight");
        hashMap.put(9, "Nine");
        hashMap.put(10, "Ten");

        // Get the portion of the map whose keys range from 3 (inclusive) to 7 (exclusive)
        SortedMap<Integer, String> subMap = hashMap.subMap(3, 7);

        // Print the subMap
        System.out.println(subMap);
    }
}
