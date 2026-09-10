import java.util.HashSet;

public class CompareHashSets {

    public static void main(String[] args) {
        // Create two hash sets
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Apple");
        set2.add("Orange");
        set2.add("Strawberry");

        // Compare the two hash sets
        boolean isEqual = set1.equals(set2);

        // Print the result
        System.out.println("Are the two hash sets equal? " + isEqual);
    }
}
