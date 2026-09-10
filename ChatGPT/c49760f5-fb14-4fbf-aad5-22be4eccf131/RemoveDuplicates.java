import java.util.*;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return n;
        }
        int[] newArr = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && arr[i] == arr[i + 1]) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        return j;
    }

    public static int removeDuplicatesAtMostTwice(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return n;
        }
        int[] newArr = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && arr[i] == arr[i + 1] && (i < n - 2 && arr[i] == arr[i + 2])) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("The length of the original array is: " + arr1.length);
        int newLength1 = removeDuplicates(arr1);
        System.out.println("After removing duplicates, the new length of the array is: " + newLength1);

        int[] arr2 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.println("The length of the original array is: " + arr2.length);
        int newLength2 = removeDuplicatesAtMostTwice(arr2);
        System.out.println("After removing duplicates, the new length of the array is: " + newLength2);

        // Corner cases
        int[] arr3 = {1, 1, 1};
        System.out.println("Original array: " + Arrays.toString(arr3));
        System.out.println("The length of the original array is: " + arr3.length);
        int newLength3 = removeDuplicates(arr3);
        System.out.println("After removing duplicates, the new length of the array is: " + newLength3);

        int[] arr4 = {1, 1, 1};
        System.out.println("Original array: " + Arrays.toString(arr4));
        System.out.println("The length of the original array is: " + arr4.length);
        int newLength4 = removeDuplicatesAtMostTwice(arr4);
        System.out.println("After removing duplicates, the new length of the array is: " + newLength4);
    }
}
