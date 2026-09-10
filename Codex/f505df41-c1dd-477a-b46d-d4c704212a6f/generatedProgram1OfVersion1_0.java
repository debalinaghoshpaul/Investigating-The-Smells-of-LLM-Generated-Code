import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        // Create an empty HashSet
        HashSet<String> set = new HashSet<>();

        // Check if the HashSet is empty
        if (set.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }
    }
}