import java.util.TreeSet;

public class TreeSetComparison {
    public static void main(String[] args) {
        // Create the first TreeSet
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Create the second TreeSet
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Compare the two TreeSets
        boolean isEqual = set1.equals(set2);

        // Print the result
        if (isEqual) {
            System.out.println("The two TreeSets are equal.");
        } else {
            System.out.println("The two TreeSets are not equal.");
        }
    }
}
