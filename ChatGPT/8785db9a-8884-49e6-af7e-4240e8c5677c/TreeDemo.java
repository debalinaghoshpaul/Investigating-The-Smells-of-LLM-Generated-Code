import java.util.TreeSet;

public class TreeDemo {

    public static void main(String[] args) {
        // create a tree set
        TreeSet<Integer> set = new TreeSet<>();

        // add some elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // retrieve the first element of the set
        Integer firstElement = set.first();

        // print the first element
        System.out.println("First element: " + firstElement);

        // remove the first element from the set
        set.remove(firstElement);

        // print the set after removing the first element
        System.out.println("Set after removing the first element: " + set);
    }
}
