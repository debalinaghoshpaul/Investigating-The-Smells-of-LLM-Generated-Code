import java.util.Arrays;

public class PancakeSort {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {3, 2, 4, 1, 5};
        int[] arr2 = {1, 5, 4, 3, 2};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {5, 4, 3, 2, 1};
        int[] arr5 = {};

        // Call the pancakeSort method to sort the arrays
        pancakeSort(arr1);
        pancakeSort(arr2);
        pancakeSort(arr3);
        pancakeSort(arr4);
        pancakeSort(arr5);

        // Print the sorted arrays
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
    }

    public static void pancakeSort(int[] arr) {
        // Find the largest element in the array
        int maxIndex = findMaxIndex(arr);

        // Flip the array so that the largest element is at the front
        flip(arr, maxIndex);

        // Recursively sort the remaining array
        if (arr.length > 2) {
            pancakeSort(Arrays.copyOfRange(arr, 1, arr.length));
        }

        // Flip the array again to put the largest element at the end
        flip(arr, arr.length - 1);
    }

    public static int findMaxIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void flip(int[] arr, int k) {
        int[] newArr = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            newArr[i] = arr[k - i];
        }
        for (int i = 0; i <= k; i++) {
            arr[i] = newArr[i];
        }
    }
}
