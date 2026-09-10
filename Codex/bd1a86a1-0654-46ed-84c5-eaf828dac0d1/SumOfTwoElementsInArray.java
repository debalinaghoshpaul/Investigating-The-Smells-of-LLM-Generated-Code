import java.util.Arrays;

public class SumOfTwoElementsInArray {

    public static void main(String[] args) {
        // Sample array
        int[] arr = {1, 2, 4, 5, 6};
        int target = 6;

        // Find the sum of two elements in the array equal to the target value
        int[] result = findSumOfTwoElements(arr, target);

        // Print the result
        if (result != null) {
            System.out.println("The sum of the two elements in the array equal to the target value is: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two elements in the array sum up to the target value.");
        }

        // Test cases
        System.out.println("\nTest Case 1:");
        int[] arr1 = {1, 2, 4, 5, 6};
        int target1 = 7;
        int[] result1 = findSumOfTwoElements(arr1, target1);
        if (result1 != null) {
            System.out.println("The sum of the two elements in the array equal to the target value is: " + result1[0] + " and " + result1[1]);
        } else {
            System.out.println("No two elements in the array sum up to the target value.");
        }

        System.out.println("\nTest Case 2:");
        int[] arr2 = {1, 2, 4, 5, 6};
        int target2 = 3;
        int[] result2 = findSumOfTwoElements(arr2, target2);
        if (result2 != null) {
            System.out.println("The sum of the two elements in the array equal to the target value is: " + result2[0] + " and " + result2[1]);
        } else {
            System.out.println("No two elements in the array sum up to the target value.");
        }

        System.out.println("\nTest Case 3:");
        int[] arr3 = {1, 2, 4, 5, 6};
        int target3 = 10;
        int[] result3 = findSumOfTwoElements(arr3, target3);
        if (result3 != null) {
            System.out.println("The sum of the two elements in the array equal to the target value is: " + result3[0] + " and " + result3[1]);
        } else {
            System.out.println("No two elements in the array sum up to the target value.");
        }
    }

    public static int[] findSumOfTwoElements(int[] arr, int target) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Initialize two pointers, one at the start of the array and one at the end of the array
        int left = 0;
        int right = arr.length - 1;

        // Iterate until the two pointers meet
        while (left < right) {
            // Calculate the sum of the two elements at the current pointers
            int sum = arr[left] + arr[right];

            // If the sum is equal to the target value, return the two elements
            if (sum == target) {
                return new int[]{arr[left], arr[right]};
            }
            // If the sum is less than the target value, move the left pointer to the right
            else if (sum < target) {
                left++;
            }
            // If the sum is greater than the target value, move the right pointer to the left
            else {
                right--;
            }
        }

        // No two elements in the array sum up to the target value
        return null;
    }
}
