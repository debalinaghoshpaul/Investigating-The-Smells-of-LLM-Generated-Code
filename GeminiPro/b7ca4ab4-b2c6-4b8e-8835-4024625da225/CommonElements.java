import java.util.Arrays;

public class CommonElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Find the common elements between the two arrays
        int[] commonElements = findCommonElements(arr1, arr2);

        // Print the common elements
        System.out.println(Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        // Check if the two arrays are null or empty
        if (arr1 == null || arr1.length == 0 || arr2 == null || arr2.length == 0) {
            return new int[0];
        }

        // Sort the two arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Initialize the index of the common elements array
        int i = 0;

        // Initialize the indices of the two input arrays
        int j = 0;
        int k = 0;

        // Iterate over the two input arrays until one of them is exhausted
        while (j < arr1.length && k < arr2.length) {
            // If the elements at the current indices are equal, then add the element to the common
            // elements array and increment the indices of both input arrays
            if (arr1[j] == arr2[k]) {
                commonElements[i++] = arr1[j];
                j++;
                k++;
            }
            // If the element at the current index of the first input array is less than the element
            // at the current index of the second input array, then increment the index of the first
            // input array
            else if (arr1[j] < arr2[k]) {
                j++;
            }
            // Otherwise, increment the index of the second input array
            else {
                k++;
            }
        }

        // Return the common elements array
        return commonElements;
    }
}
