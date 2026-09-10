import java.util.TreeSet;

public class GetNumberOfElementsInATreeSet {

    public static void main(String[] args) {
        // create a tree set
        TreeSet<Integer> treeSet = new TreeSet<>();

        // add some elements to the tree set
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);

        // get the number of elements in the tree set
        int numberOfElements = treeSet.size();

        // print the number of elements in the tree set
        System.out.println("The number of elements in the tree set is: " + numberOfElements);
    }
}
