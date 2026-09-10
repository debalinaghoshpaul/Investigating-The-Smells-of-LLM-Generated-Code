import java.util.HashSet;

public class AppendElementToHashSet {

    public static void main(String[] args) {
        // Create a hash set
        HashSet<String> names = new HashSet<>();

        // Add some elements to the hash set
        names.add("John");
        names.add("Mary");
        names.add("Bob");

        // Append a new element to the end of the hash set
        names.add("Alice");

        // Print the hash set
        System.out.println(names);
    }
}
