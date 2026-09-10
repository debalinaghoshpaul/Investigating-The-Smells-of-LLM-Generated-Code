import java.util.Arrays;

public class Separate0sAnd1s {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {0, 1, 0, 1, 0, 1, 0, 1};
        int[] arr2 = {1, 0, 1, 0, 1, 0, 1, 0};
        int[] arr3 = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] arr4 = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] arr5 = {};

        // Print original arrays
        System.out.println("Original arrays:");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        // Separate 0s and 1s
        separate0sAnd1s(arr1);
        separate0sAnd1s(arr2);
        separate0sAnd1s(arr3);
        separate0sAnd1s(arr4);
        separate0sAnd1s(arr5);

        // Print separated arrays
        System.out.println("Separated arrays:");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
    }

    public static void separate0sAnd1s(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // If the left element is 1, swap it with the right element
            if (arr[left] == 1) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            } else {
                // If the left element is 0, move the left pointer to the right
                left++;
            }
        }
    }
}
