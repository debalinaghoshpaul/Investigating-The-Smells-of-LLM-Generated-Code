import java.util.Arrays;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10}; // Input array with one missing number
        int n = arr.length + 1; // Total number of elements including the missing number
        int totalSum = n * (n + 1) / 2; // Expected sum of elements if no number is missing
        int actualSum = Arrays.stream(arr).sum(); // Actual sum of elements in the array

        int missingNumber = totalSum - actualSum;
        System.out.println("The missing number in the array is: " + missingNumber);
    }
}
