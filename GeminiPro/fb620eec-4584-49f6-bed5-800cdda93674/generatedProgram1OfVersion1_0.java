import java.util.Arrays;

public class FindDuplicateValues {

    public static void main(String[] args) {
        // Initialize an array of integer values
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Iterate over the array to find duplicate values
        for (int i = 0; i < arr.length - 1; i++) {
            // If the current element is equal to the next element, then it is a duplicate
            if (arr[i] == arr[i + 1]) {
                // Print the duplicate value
                System.out.println("Duplicate value: " + arr[i]);
            }
        }
    }
}
