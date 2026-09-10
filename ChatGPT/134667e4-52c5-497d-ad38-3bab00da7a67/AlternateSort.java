import java.util.Arrays;

public class AlternateSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 3, 6};

        // Sort the array
        Arrays.sort(arr);

        int[] sortedArr = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sortedArr[i] = arr[end];
                end--;
            } else {
                sortedArr[i] = arr[start];
                start++;
            }
        }

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
}
