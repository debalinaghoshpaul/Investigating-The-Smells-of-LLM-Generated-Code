import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AbsoluteDistinctCount {

    public static int countAbsoluteDistinctValues(int[] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Create a set to store the absolute values of the elements in the array
        Set<Integer> absoluteValues = new HashSet<>();

        // Iterate over the array and add the absolute values of the elements to the set
        for (int element : arr) {
            absoluteValues.add(Math.abs(element));
        }

        // Return the size of the set, which represents the number of absolute distinct values in the array
        return absoluteValues.size();
    }

    public static void main(String[] args) {
        // Test cases
        int[] testArray1 = {1, -2, 2, -1, 3};
        int[] testArray2 = {0, 0, 0, 0, 0};
        int[] testArray3 = {-1, -2, -3, -4, -5};

        // Print the results
        System.out.println("Absolute distinct count for testArray1: " + countAbsoluteDistinctValues(testArray1));
        System.out.println("Absolute distinct count for testArray2: " + countAbsoluteDistinctValues(testArray2));
        System.out.println("Absolute distinct count for testArray3: " + countAbsoluteDistinctValues(testArray3));

    }
}
