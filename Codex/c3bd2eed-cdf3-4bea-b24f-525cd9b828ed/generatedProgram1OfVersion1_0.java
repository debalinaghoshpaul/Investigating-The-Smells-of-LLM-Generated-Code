import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int secondLargest = findSecondLargestElement(arr);
        System.out.println("The second largest element in the array is: " + secondLargest);
    }

    public static int findSecondLargestElement(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("The array must have at least two elements.");
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the second largest element, which is the last element in the sorted array
        return arr[arr.length - 2];
    }
}
