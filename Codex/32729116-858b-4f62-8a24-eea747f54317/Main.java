import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");

        int key = 4;
        Integer leastKey = treeMap.ceilingKey(key);

        if (leastKey != null) {
            System.out.println("Least key greater than or equal to " + key + ": " + leastKey);
        } else {
            System.out.println("No key greater than or equal to " + key);
        }
    }
}
