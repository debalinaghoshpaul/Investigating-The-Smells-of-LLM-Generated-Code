import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int givenElement = 25;

        // Get the element(s) greater than or equal to the given element
        TreeSet<Integer> result = new TreeSet<>(treeSet.tailSet(givenElement));

        System.out.println("Elements greater than or equal to " + givenElement + ":");
        for (int element : result) {
            System.out.println(element);
        }
    }
}
