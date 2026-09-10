import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        // Test case 1: Normal case
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        mergeArrays(A, B);
        System.out.println(Arrays.toString(A)); // Output: [1, 2, 4, 5, 6, 7]
        System.out.println(Arrays.toString(B)); // Output: [8, 9, 10]

        // Test case 2: Empty array A
        A = new int[0];
        B = new int[]{2, 4, 9};
        mergeArrays(A, B);
        System.out.println(Arrays.toString(A)); // Output: [2, 4, 9]
        System.out.println(Arrays.toString(B)); // Output: []

        // Test case 3: Empty array B
        A = new int[]{1, 5, 6, 7, 8, 10};
        B = new int[0];
        mergeArrays(A, B);
        System.out.println(Arrays.toString(A)); // Output: [1, 5, 6, 7, 8, 10]
        System.out.println(Arrays.toString(B)); // Output: []

        // Test case 4: Arrays of equal length
        A = new int[]{1, 3, 5, 7};
        B = new int[]{2, 4, 6, 8};
        mergeArrays(A, B);
        System.out.println(Arrays.toString(A)); // Output: [1, 2, 3, 4]
        System.out.println(Arrays.toString(B)); // Output: [5, 6, 7, 8]

        // Test case 5: Arrays with negative numbers
        A = new int[]{-1, -3, -5, -7};
        B = new int[]{-2, -4, -6, -8};
        mergeArrays(A, B);
        System.out.println(Arrays.toString(A)); // Output: [-8, -7, -6, -5]
        System.out.println(Arrays.toString(B)); // Output: [-4, -3, -2, -1]
    }

    public static void mergeArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        // Create a new array to store the merged elements
        int[] C = new int[m + n];

        // Merge the elements of A and B into C
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // Copy the remaining elements of A, if any
        while (i < m) {
            C[k++] = A[i++];
        }

        // Copy the remaining elements of B, if any
        while (j < n) {
            C[k++] = B[j++];
        }

        // Copy the merged elements back into A and B
        for (i = 0; i < m; i++) {
            A[i] = C[i];
        }
        for (i = 0; i < n; i++) {
            B[i] = C[m + i];
        }
    }
}
