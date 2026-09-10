import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 3);

        // Create a shallow copy of the original HashMap
        HashMap<String, Integer> shallowCopy = new HashMap<>(originalMap);

        // Display the original HashMap
        System.out.println("Original HashMap: " + originalMap);

        // Display the shallow copy of the HashMap
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}
