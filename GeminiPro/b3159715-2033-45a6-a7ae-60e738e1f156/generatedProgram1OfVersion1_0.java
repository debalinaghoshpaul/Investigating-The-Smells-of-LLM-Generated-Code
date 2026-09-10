import java.util.Arrays;

public class ArrayIndexFinder {

    public static void main(String[] args) {
        // Test cases
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println("Index of " + target + " in the array: " + findIndex(arr, target));

        target = 10;
        System.out.println("Index of " + target + " in the array: " + findIndex(arr, target));

        target = 0;
        System.out.println("Index of " + target + " in the array: " + findIndex(arr, target));

        target = 11;
        System.out.println("Index of " + target + " in the array: " + findIndex(arr, target));

        arr = new int[]{};
        target = 5;
        System.out.println("Index of " + target + " in the array: " + findIndex(arr, target));
    }

    public static int findIndex(int[] arr, int target) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Iterate over the array to find the target element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        // If the target element is not found, return -1
        return -1;
    }
}
