import java.util.ArrayList;
import java.util.List;

public class CompareArrayLists {
    public static void main(String[] args) {
        // Create the first array list
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Create the second array list
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(4);

        // Compare the array lists
        boolean isEqual = list1.equals(list2);

        // Print the result
        if (isEqual) {
            System.out.println("The array lists are equal.");
        } else {
            System.out.println("The array lists are not equal.");
        }
    }
}