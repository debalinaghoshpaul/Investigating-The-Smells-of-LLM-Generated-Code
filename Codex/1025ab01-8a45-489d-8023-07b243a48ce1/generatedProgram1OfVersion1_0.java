import java.util.Arrays;

public class InterpolationSearch {

    public static void main(String[] args) {
        // Test case 1: Element found
        int[] arr1 = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x1 = 18;
        int result1 = interpolationSearch(arr1, x1);
        System.out.println("Element " + x1 + " found at index " + result1);

        // Test case 2: Element not found
        int[] arr2 = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x2 = 30;
        int result2 = interpolationSearch(arr2, x2);
        System.out.println("Element " + x2 + " not found");

        // Test case 3: Corner case - First element
        int[] arr3 = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x3 = 10;
        int result3 = interpolationSearch(arr3, x3);
        System.out.println("Element " + x3 + " found at index " + result3);

        // Test case 4: Corner case - Last element
        int[] arr4 = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x4 = 47;
        int result4 = interpolationSearch(arr4, x4);
        System.out.println("Element " + x4 + " found at index " + result4);

        // Test case 5: Corner case - Empty array
        int[] arr5 = {};
        int x5 = 10;
        int result5 = interpolationSearch(arr5, x5);
        System.out.println("Element " + x5 + " not found");
    }

    public static int interpolationSearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Calculate the interpolation index
            int pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));

            // Check if the element is found at the interpolated index
            if (arr[pos] == x) {
                return pos;
            }

            // If the element is smaller than the interpolated index, narrow the search space to the left
            else if (arr[pos] < x) {
                low = pos + 1;
            }

            // If the element is larger than the interpolated index, narrow the search space to the right
            else {
                high = pos - 1;
            }
        }

        // The element was not found
        return -1;
    }
}
