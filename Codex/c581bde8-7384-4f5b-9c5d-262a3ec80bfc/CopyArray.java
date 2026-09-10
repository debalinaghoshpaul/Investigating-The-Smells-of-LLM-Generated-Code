import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Copy the array by iterating over it
        int[] copyArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copyArray[i] = originalArray[i];
        }

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(originalArray));

        // Print the copy array
        System.out.println("Copy array: " + Arrays.toString(copyArray));
    }
}
