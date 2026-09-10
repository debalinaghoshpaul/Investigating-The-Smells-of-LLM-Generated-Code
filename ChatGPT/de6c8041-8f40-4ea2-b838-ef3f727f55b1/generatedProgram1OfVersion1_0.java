import java.util.Arrays;

public class MergeSortedArrays {
    
    public static void mergeArrays(int[] A, int[] B) {
        int p = A.length;
        int q = B.length;
        
        int[] temp = new int[p + q];
        
        int i = 0, j = 0, k = 0;
        
        while (i < p && j < q) {
            if (A[i] < B[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = B[j++];
            }
        }
        
        while (i < p) {
            temp[k++] = A[i++];
        }
        
        while (j < q) {
            temp[k++] = B[j++];
        }
        
        for (i = 0; i < p; i++) {
            A[i] = temp[i];
        }
        
        for (j = 0; j < q; j++) {
            B[j] = temp[p + j];
        }
    }

    public static void main(String[] args) {
        int[] A = { 1, 5, 6, 7, 8, 10 };
        int[] B = { 2, 4, 9 };
        
        System.out.println("Before merging:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
        
        mergeArrays(A, B);
        
        System.out.println("\nAfter merging:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }
}
