import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create the first TreeSet
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Create the second TreeSet
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Add all elements of set1 to set2
        set2.addAll(set1);

        // Print the elements of set2
        System.out.println("Elements of set2: " + set2);
    }
}
