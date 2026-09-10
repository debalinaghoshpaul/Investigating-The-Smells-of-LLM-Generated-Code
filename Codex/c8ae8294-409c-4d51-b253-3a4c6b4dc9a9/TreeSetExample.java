import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int givenElement = 35;

        // Get the element in the tree set less than or equal to the given element
        Integer result = treeSet.floor(givenElement);

        if (result != null) {
            System.out.println("Element found: " + result);
        } else {
            System.out.println("No element found less than or equal to " + givenElement);
        }
    }
}
