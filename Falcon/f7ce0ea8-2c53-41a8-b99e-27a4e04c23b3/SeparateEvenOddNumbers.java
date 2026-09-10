import java.util.*;

public class SeparateEvenOddNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create two arrays to store even and odd numbers
        int[] evenNumbers = new int[arr.length];
        int[] oddNumbers = new int[arr.length];

        // Initialize the indices of even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        // Iterate over the original array
        for (int num : arr) {
            // Check if the number is even
            if (num % 2 == 0) {
                // Add the number to the even array
                evenNumbers[evenIndex] = num;
                evenIndex++;
            } else {
                // Add the number to the odd array
                oddNumbers[oddIndex] = num;
                oddIndex++;
            }
        }

        // Create a new array to store the separated even and odd numbers
        int[] separatedArray = new int[arr.length];

        // Copy the even numbers to the separated array
        for (int i = 0; i < evenIndex; i++) {
            separatedArray[i] = evenNumbers[i];
        }

        // Copy the odd numbers to the separated array
        for (int i = 0; i < oddIndex; i++) {
            separatedArray[evenIndex + i] = oddNumbers[i];
        }

        // Print the separated array
        System.out.println(Arrays.toString(separatedArray));
    }
}
