import java.util.TreeSet;

public class CompareTreeSets {

    public static void main(String[] args) {
        // Create two tree sets
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Cherry");

        // Compare the two tree sets
        System.out.println("Are the two sets equal? " + set1.equals(set2));
        System.out.println("Is set1 a subset of set2? " + set1.subsetOf(set2));
        System.out.println("Is set2 a subset of set1? " + set2.subsetOf(set1));
    }
}
