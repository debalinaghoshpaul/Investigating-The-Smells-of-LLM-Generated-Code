import java.util.*;
import java.lang.*;

public class SmallestAndSecondSmallest {

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        int n = arr.length;

        // Initialize the first and second smallest elements
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            // If the current element is smaller than the first smallest
            // element, then update the first smallest and second smallest
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            }

            // If the current element is smaller than the second smallest
            // element and greater than the first smallest element, then
            // update the second smallest element
            else if (arr[i] < second && arr[i] > first) {
                second = arr[i];
            }
        }

        // Print the first and second smallest elements
        System.out.println("The first smallest element is: " + first);
        System.out.println("The second smallest element is: " + second);
    }
}
