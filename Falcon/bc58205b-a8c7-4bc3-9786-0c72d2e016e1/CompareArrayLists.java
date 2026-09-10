import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayLists {

    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Compare the two ArrayLists
        boolean isEqual = list1.equals(list2);

        // Print the result
        System.out.println("The two ArrayLists are equal: " + isEqual);
    }
}
