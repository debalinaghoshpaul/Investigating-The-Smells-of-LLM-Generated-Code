import java.util.*;

public class CopyTreeMap {

    public static void main(String[] args) {

        // Creating a TreeMap
        TreeMap<Integer, String> originalTreeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        originalTreeMap.put(1, "One");
        originalTreeMap.put(2, "Two");
        originalTreeMap.put(3, "Three");

        // Creating a new TreeMap to copy the contents
        TreeMap<Integer, String> copiedTreeMap = new TreeMap<>();

        // Copying the contents of the original TreeMap to the new TreeMap
        copiedTreeMap.putAll(originalTreeMap);

        // Printing the original TreeMap
        System.out.println("Original TreeMap: " + originalTreeMap);

        // Printing the copied TreeMap
        System.out.println("Copied TreeMap: " + copiedTreeMap);
    }
}
