import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        // Test case 1: Check if an array contains an element 10 next to 10 or an element 20 next to 20, but not both
        int[] arr1 = {1, 10, 2, 10, 3, 20, 4, 20, 5};
        System.out.println(containsAdjacentTensOrTwenties(arr1)); // true

        int[] arr2 = {1, 10, 2, 20, 3, 10, 4, 20, 5};
        System.out.println(containsAdjacentTensOrTwenties(arr2)); // false

        // Test case 2: Rearrange an array so that all the odd numbers come before all the even numbers
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(rearrangeOddEven(arr3))); // [1, 3, 5, 7, 9, 2, 4, 6, 8, 10]

        int[] arr4 = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(rearrangeOddEven(arr4))); // [1, 3, 5, 7, 9, 2, 4, 6, 8, 10]

        // Corner cases
        int[] emptyArr = {};
        System.out.println(containsAdjacentTensOrTwenties(emptyArr)); // false
        System.out.println(Arrays.toString(rearrangeOddEven(emptyArr))); // []

        int[] singleElementArr = {10};
        System.out.println(containsAdjacentTensOrTwenties(singleElementArr)); // false
        System.out.println(Arrays.toString(rearrangeOddEven(singleElementArr))); // [10]
    }

    public static boolean containsAdjacentTensOrTwenties(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr == null || arr.length < 2) {
            return false;
        }

        // Loop through the array and check for adjacent tens or twenties
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == 10 && arr[i + 1] == 10) || (arr[i] == 20 && arr[i + 1] == 20)) {
                return true;
            }
        }

        // If no adjacent tens or twenties are found, return false
        return false;
    }

    public static int[] rearrangeOddEven(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr == null || arr.length < 2) {
            return arr;
        }

        // Create two pointers, one for the odd numbers and one for the even numbers
        int oddPointer = 0;
        int evenPointer = arr.length - 1;

        while (oddPointer < evenPointer) {
            // If the odd pointer points to an even number, swap it with the number at the even pointer
            if (arr[oddPointer] % 2 == 0) {
                int temp = arr[oddPointer];
                arr[oddPointer] = arr[evenPointer];
                arr[evenPointer] = temp;
                evenPointer--;
            } else {
                oddPointer++;
            }
        }

        // Return the rearranged array
        return arr;
    }
}
