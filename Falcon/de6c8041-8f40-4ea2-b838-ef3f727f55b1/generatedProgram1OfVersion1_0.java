public class MergeArrays {
    public static void main(String[] args) {
        int[] A = { 1, 5, 6, 7, 8, 10 };
        int[] B = { 2, 4, 9 };
        int[] result = merge(A, B);
        System.out.println("Sorted Arrays: A: " + Arrays.toString(result));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static int[] merge(int[] A, int[] B) {
        int[] result = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                result[k++] = A[i++];
            } else {
                result[k++] = B[j++];
            }
        }
        while (i < A.length) {
            result[k++] = A[i++];
        }
        while (j < B.length) {
            result[k++] = B[j++];
        }
        return result;
    }
}

