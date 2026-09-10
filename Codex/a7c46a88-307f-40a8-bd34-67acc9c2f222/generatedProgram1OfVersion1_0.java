import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int givenElement = 25;

        Integer result = treeSet.ceiling(givenElement);

        if (result != null) {
            System.out.println("Element greater than or equal to " + givenElement + ": " + result);
        } else {
            System.out.println("No element found greater than or equal to " + givenElement);
        }
    }
}