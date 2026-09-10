import java.util.HashSet;

public class ConvertHashSetToArray {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Convert HashSet to an array
        String[] array = hashSet.toArray(new String[hashSet.size()]);

        // Print the elements of the array
        for (String element : array) {
            System.out.println(element);
        }
    }
}