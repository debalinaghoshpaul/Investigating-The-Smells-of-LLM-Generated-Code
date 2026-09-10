import java.util.Arrays;

class DuplicateElementsRemoval {

    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};

        // Find the length of the original array
        int originalLength = originalArray.length;

        // Remove duplicate elements
        int[] updatedArray = removeDuplicates(originalArray);

        // Find the length of the updated array
        int updatedLength = updatedArray.length;

        // Print the results
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("The length of the original array is: " + originalLength);
        System.out.println("After removing duplicates, the new length of the array is: " + updatedLength);
    }

    public static int[] removeDuplicates(int[] array) {
        // Initialize the result array
        int[] result = new int[array.length];

        // Initialize the index of the result array
        int index = 0;

        // Iterate over the input array
        for (int i = 0; i < array.length; i++) {
            // If the current element is not equal to the previous element
            if (i == 0 || array[i] != array[i - 1]) {
                // Add the current element to the result array
                result[index] = array[i];
                // Increment the index of the result array
                index++;
            } else if (i >= 2 && array[i] != array[i - 2]) {
                // If the current element is equal to the previous element, but not the one before it
                // Add the current element to the result array
                result[index] = array[i];
                // Increment the index of the result array
                index++;
            }
        }

        // Return the result array
        return Arrays.copyOf(result, index);
    }
}
