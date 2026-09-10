public class MaximumSubarray {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maximumSubarray(arr);
        System.out.println(maxSum); // Output: 6

        // Corner cases
        int[] allNegativeArr = {-1, -2, -3, -4, -5};
        maxSum = maximumSubarray(allNegativeArr);
        System.out.println(maxSum); // Output: -1

        int[] emptyArr = {};
        maxSum = maximumSubarray(emptyArr);
        System.out.println(maxSum); // Output: 0
    }

    public static int maximumSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
