import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");

        int givenKey = 4;
        Integer nextKey = treeMap.higherKey(givenKey);

        if (nextKey != null) {
            System.out.println("The least key strictly greater than " + givenKey + " is: " + nextKey);
        } else {
            System.out.println("There is no key strictly greater than " + givenKey);
        }
    }
}