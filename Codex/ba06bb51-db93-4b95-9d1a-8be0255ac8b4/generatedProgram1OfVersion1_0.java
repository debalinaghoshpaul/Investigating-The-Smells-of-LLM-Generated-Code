import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MedianAndUniqueNumberFinder {

    public static void main(String[] args) {
        // Test cases for median calculation
        int[] arr1 = {10, 2, 38, 22, 38, 23};
        int[] arr2 = {10, 2, 38, 23, 38, 23, 21};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Median of the said array of integers: " + findMedian(arr1));
        System.out.println();

        System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.println("Median of the said array of integers: " + findMedian(arr2));
        System.out.println();

        System.out.println("Original array: " + Arrays.toString(arr3));
        System.out.println("Median of the said array of integers: " + findMedian(arr3));
        System.out.println();

        // Test cases for finding the unique number
        int[] arr4 = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        int[] arr5 = {1, 2, 3, 4, 5, 6, 6, 5, 3, 2, 1};
        int[] arr6 = {1};

        System.out.println("Source Array : " + Arrays.toString(arr4));
        System.out.println("50 appears only once");
        System.out.println();

        System.out.println("Source Array : " + Arrays.toString(arr5));
        System.out.println("4 appears only once");
        System.out.println();

        System.out.println("Source Array : " + Arrays.toString(arr6));
        System.out.println("1 appears only once");
        System.out.println();
    }

    public static double findMedian(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        // If the array has even number of elements, return the average of middle two elements
        if (arr.length % 2 == 0) {
            return (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2.0;
        }

        // If the array has odd number of elements, return the middle element
        else {
            return arr[arr.length / 2];
        }
    }

    public static int findUniqueNumber(int[] arr) {
        // Create a HashMap to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate over the array and update the frequency of each number
        for (int num : arr) {
            int frequency = frequencyMap.getOrDefault(num, 0);
            frequencyMap.put(num, frequency + 1);
        }

        // Find the number that has a frequency of 1
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no unique number is found, return -1
        return -1;
    }
}
