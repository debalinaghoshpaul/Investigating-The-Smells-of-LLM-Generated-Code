import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Get the first element
        Integer firstElement = treeSet.first();
        System.out.println("First Element: " + firstElement);

        // Get the last element
        Integer lastElement = treeSet.last();
        System.out.println("Last Element: " + lastElement);
    }
}
