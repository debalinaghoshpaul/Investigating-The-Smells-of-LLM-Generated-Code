import java.util.Arrays;

public class ConsecutiveNumbers {

    public static boolean canRearrange(int[] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return false;
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Check if the difference between any two consecutive elements is greater than 1
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                return false;
            }
        }

        // If the loop completes without returning false, then the numbers can be rearranged
        return true;
    }

    public static void main(String[] args) {
        // Test case 1:
        int[] arr1 = {1, 2, 5, 0, 4, 3, 6};
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Check consecutive numbers in the said array!");
        System.out.println(canRearrange(arr1)); // Output: true

        // Test case 2:
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("\nOriginal array: " + Arrays.toString(arr2));
        System.out.println("Check consecutive numbers in the said array!");
        System.out.println(canRearrange(arr2)); // Output: false

        // Test case 3:
        int[] arr3 = {};
        System.out.println("\nOriginal array: " + Arrays.toString(arr3));
        System.out.println("Check consecutive numbers in the said array!");
        System.out.println(canRearrange(arr3)); // Output: false

        // Test case 4:
        int[] arr4 = {1, 2};
        System.out.println("\nOriginal array: " + Arrays.toString(arr4));
        System.out.println("Check consecutive numbers in the said array!");
        System.out.println(canRearrange(arr4)); // Output: true

        // Test case 5:
        int[] arr5 = {1, 2, 3, 4, 5, 7};
        System.out.println("\nOriginal array: " + Arrays.toString(arr5));
        System.out.println("Check consecutive numbers in the said array!");
        System.out.println(canRearrange(arr5)); // Output: false
    }
}
