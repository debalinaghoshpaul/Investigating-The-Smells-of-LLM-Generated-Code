import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // Missing number: 10
        int[] arr2 = {0, 1, 3, 4, 5, 6, 7, 8, 9}; // Missing number: 2
        int[] arr3 = {0, 1, 2, 3, 5, 6, 7, 8, 9}; // Missing number: 4
        int[] arr4 = {0, 1, 2, 3, 4, 6, 7, 8, 9}; // Missing number: 5
        int[] arr5 = {0, 1, 2, 3, 4, 5, 7, 8, 9}; // Missing number: 6
        int[] arr6 = {0, 1, 2, 3, 4, 5, 6, 8, 9}; // Missing number: 7
        int[] arr7 = {0, 1, 2, 3, 4, 5, 6, 7, 9}; // Missing number: 8
        int[] arr8 = {0, 1, 2, 3, 4, 5, 6, 7, 8}; // Missing number: 9
        int[] arr9 = {0}; // Missing number: 1
        int[] arr10 = {}; // Missing number: 0

        // Find the missing number for each test case
        System.out.println("Missing number for array " + Arrays.toString(arr1) + ": " + findMissingNumber(arr1));
        System.out.println("Missing number for array " + Arrays.toString(arr2) + ": " + findMissingNumber(arr2));
        System.out.println("Missing number for array " + Arrays.toString(arr3) + ": " + findMissingNumber(arr3));
        System.out.println("Missing number for array " + Arrays.toString(arr4) + ": " + findMissingNumber(arr4));
        System.out.println("Missing number for array " + Arrays.toString(arr5) + ": " + findMissingNumber(arr5));
        System.out.println("Missing number for array " + Arrays.toString(arr6) + ": " + findMissingNumber(arr6));
        System.out.println("Missing number for array " + Arrays.toString(arr7) + ": " + findMissingNumber(arr7));
        System.out.println("Missing number for array " + Arrays.toString(arr8) + ": " + findMissingNumber(arr8));
        System.out.println("Missing number for array " + Arrays.toString(arr9) + ": " + findMissingNumber(arr9));
        System.out.println("Missing number for array " + Arrays.toString(arr10) + ": " + findMissingNumber(arr10));
    }

    public static int findMissingNumber(int[] arr) {
        // Check if the array is empty or null
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Iterate over the array to find the missing number
        for (int i = 0; i < arr.length; i++) {
            // Check if the current number is equal to the expected number
            if (arr[i] != i) {
                return i;
            }
        }

        // If no missing number is found, return the last number plus 1
        return arr[arr.length - 1] + 1;
    }
}

