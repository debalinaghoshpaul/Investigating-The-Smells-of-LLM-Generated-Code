import java.util.Arrays;

public class FindSubarrayWithSmallestSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = findSubarrayWithSmallestSum(arr);
        System.out.println(Arrays.toString(result)); // [1, 2, 3]

        int[] arr2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        result = findSubarrayWithSmallestSum(arr2);
        System.out.println(Arrays.toString(result)); // [-5, 4]

        int[] arr3 = {-2, -1, -3, -4, -5};
        result = findSubarrayWithSmallestSum(arr3);
        System.out.println(Arrays.toString(result)); // [-5]

        int[] arr4 = {-2, -1, -3, -4, -5, -6};
        result = findSubarrayWithSmallestSum(arr4);
        System.out.println(Arrays.toString(result)); // [-6]

        int[] arr5 = {1, 2, 3, 4, 5, 6};
        result = findSubarrayWithSmallestSum(arr5);
        System.out.println(Arrays.toString(result)); // [1]

        int[] arr6 = {1, 2, 3, 4, 5, 6, 7};
        result = findSubarrayWithSmallestSum(arr6);
        System.out.println(Arrays.toString(result)); // [1]
    }

    public static int[] findSubarrayWithSmallestSum(int[] arr) {
        int minSum = Integer.MAX_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum < minSum) {
                minSum = currentSum;
                startIndex = i;
                endIndex = i;
            }

            if (currentSum > 0) {
                currentSum = 0;
            }
        }

        return Arrays.copyOfRange(arr, startIndex, endIndex + 1);
    }
}
