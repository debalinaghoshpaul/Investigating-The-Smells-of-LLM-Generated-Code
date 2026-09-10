import java.util.Arrays;

public class ArrayContains10Or30 {

    public static void main(String[] args) {
        // Test case 1: Array contains 10
        int[] arr1 = {1, 2, 3, 4, 10, 6, 7, 8, 9};
        System.out.println(contains10Or30(arr1)); // true

        // Test case 2: Array contains 30
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 30};
        System.out.println(contains10Or30(arr2)); // true

        // Test case 3: Array contains neither 10 nor 30
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(contains10Or30(arr3)); // false

        // Test case 4: Empty array
        int[] arr4 = {};
        System.out.println(contains10Or30(arr4)); // false

        // Test case 5: Array contains both 10 and 30
        int[] arr5 = {1, 2, 3, 4, 10, 6, 7, 8, 9, 30};
        System.out.println(contains10Or30(arr5)); // true

        // Test case 6: Array contains multiple occurrences of 10 and 30
        int[] arr6 = {1, 2, 3, 4, 10, 6, 7, 8, 9, 10, 30};
        System.out.println(contains10Or30(arr6)); // true

        // Test case 7: Array contains negative numbers
        int[] arr7 = {-1, -2, -3, -4, -10, -6, -7, -8, -9};
        System.out.println(contains10Or30(arr7)); // false

        // Test case 8: Array contains duplicate numbers
        int[] arr8 = {1, 2, 3, 4, 10, 6, 7, 8, 9, 10};
        System.out.println(contains10Or30(arr8)); // true
    }

    public static boolean contains10Or30(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10 || arr[i] == 30) {
                return true;
            }
        }
        return false;
    }
}
