import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Element 1");
        hashSet.add("Element 2");
        hashSet.add("Element 3");

        // Append an element to the end of the HashSet
        String elementToAppend = "New Element";
        hashSet.add(elementToAppend);

        // Print the updated HashSet
        System.out.println("HashSet after appending element: " + hashSet);
    }
}