import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Value 1");
        map.put(3, "Value 3");
        map.put(5, "Value 5");
        map.put(7, "Value 7");
        map.put(9, "Value 9");

        int key = 6;
        Integer greatestKey = map.lowerKey(key);

        if (greatestKey != null) {
            String value = map.get(greatestKey);
            System.out.println("Key: " + greatestKey + ", Value: " + value);
        } else {
            System.out.println("No key found");
        }
    }
}
