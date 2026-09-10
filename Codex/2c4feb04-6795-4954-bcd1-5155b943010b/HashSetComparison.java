import java.util.HashSet;

public class HashSetComparison {
    public static void main(String[] args) {
        // Create the first HashSet
        HashSet<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        // Create the second HashSet
        HashSet<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("orange");
        set2.add("kiwi");

        // Compare the two HashSets
        boolean isEqual = set1.equals(set2);

        // Print the result
        if (isEqual) {
            System.out.println("The two HashSets are equal.");
        } else {
            System.out.println("The two HashSets are not equal.");
        }
    }
}
