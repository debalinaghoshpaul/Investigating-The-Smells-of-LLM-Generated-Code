import java.util.*;

public class ArrayToArrayList {

    public static void main(String[] args) {
        // Creating an array
        int[] arr = {1, 2, 3, 4, 5};

        // Creating an ArrayList from the array
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Printing the ArrayList
        System.out.println(list);
    }
}
