import java.util.HashSet;

public class CloneHashSet {

    public static void main(String[] args) {
        // Create a hash set
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Blue");

        // Clone the hash set
        HashSet<String> hashSet2 = (HashSet<String>) hashSet1.clone();

        // Print the cloned hash set
        System.out.println("Cloned HashSet: " + hashSet2);
    }
}
