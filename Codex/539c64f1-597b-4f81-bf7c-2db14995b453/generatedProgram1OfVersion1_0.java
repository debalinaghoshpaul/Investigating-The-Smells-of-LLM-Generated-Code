import java.util.*;

public class ArrangeIntegers {

    public static void main(String[] args) {

        // Test cases
        int[] arr1 = {1, 2, -3, -4, 5, 6, -7, 8, 9};
        int[] arr2 = {-1, -2, -3, -4, -5};
        int[] arr3 = {1, 2, 3, 4, 5};

        // Function call
        arrangeIntegers(arr1);
        arrangeIntegers(arr2);
        arrangeIntegers(arr3);

        // Print the output arrays
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

    public static void arrangeIntegers(int[] arr) {

        // Initialize two pointers
        int positivePointer = 0;

        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {

            // If the current element is negative, swap it with the element at the positivePointer
            if (arr[i] < 0) {

                int temp = arr[i];
                arr[i] = arr[positivePointer];
                arr[positivePointer] = temp;

                // Increment the positivePointer
                positivePointer++;
            }
        }
    }
}
