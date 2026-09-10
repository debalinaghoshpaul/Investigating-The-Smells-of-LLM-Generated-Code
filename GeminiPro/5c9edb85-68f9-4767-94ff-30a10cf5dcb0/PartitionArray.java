import java.util.Arrays;

public class PartitionArray {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 3, 5, 7, 9};
        int[] arr3 = {2, 4, 6, 8, 10};
        int[] arr4 = {};
        int[] arr5 = null;

        // Expected outputs
        int[][] expected1 = {{2, 4, 6, 8, 10}, {1, 3, 5, 7, 9}};
        int[][] expected2 = {{1, 3, 5, 7, 9}};
        int[][] expected3 = {{2, 4, 6, 8, 10}};
        int[][] expected4 = {{}};
        int[][] expected5 = null;

        // Test the partition method
        int[][] actual1 = partition(arr1);
        int[][] actual2 = partition(arr2);
        int[][] actual3 = partition(arr3);
        int[][] actual4 = partition(arr4);
        int[][] actual5 = partition(arr5);

        // Check if the actual outputs match the expected outputs
        if (Arrays.deepEquals(actual1, expected1)) {
            System.out.println("Test case 1 passed.");
        } else {
            System.out.println("Test case 1 failed.");
        }

        if (Arrays.deepEquals(actual2, expected2)) {
            System.out.println("Test case 2 passed.");
        } else {
            System.out.println("Test case 2 failed.");
        }

        if (Arrays.deepEquals(actual3, expected3)) {
            System.out.println("Test case 3 passed.");
        } else {
            System
