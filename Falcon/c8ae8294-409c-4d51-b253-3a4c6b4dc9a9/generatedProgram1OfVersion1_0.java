import java.util.TreeSet;

public class GetElementLessThanOrEqualTo {

    public static void main(String[] args) {
        // create a tree set
        TreeSet<Integer> treeSet = new TreeSet<>();

        // add some elements to the tree set
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);

        // get the element in the tree set less than or equal to the given element
        Integer element = treeSet.floor(3);

        // print the element
        System.out.println(element); // output: 3
    }
}
