import java.util.Arrays;

public class MaximumSumSubsequence {

    public static int maxSubsequenceSum(int[] arr) {
        int maxSoFar = 0;
        int maxEndingHere = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, 5, 6, -7, 8, 9};
        System.out.println("Maximum sum of a contiguous subsequence is: " + maxSubsequenceSum(arr));

        // Additional test cases
        int[] emptyArr = {};
        System.out.println("Empty array: " + maxSubsequenceSum(emptyArr));

        int[] negativeArr = {-1, -2, -3, -4, -5};
        System.out.println("Negative array: " + maxSubsequenceSum(negativeArr));

        int[] alternatingArr = {1, -2, 3, -4, 5, -6};
        System.out.println("Alternating positive and negative array: " + maxSubsequenceSum(alternatingArr));
    }
}
