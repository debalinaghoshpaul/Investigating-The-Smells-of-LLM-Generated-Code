import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");

        int givenKey = 6;
        Integer floorKey = map.floorKey(givenKey);

        if (floorKey != null) {
            System.out.println("Greatest key less than or equal to " + givenKey + ": " + floorKey);
        } else {
            System.out.println("No key found less than or equal to " + givenKey);
        }
    }
}