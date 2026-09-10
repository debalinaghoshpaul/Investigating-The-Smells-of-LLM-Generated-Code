import java.util.Arrays;

public class KSmallestElements {

    public static void main(String[] args) {
        int[] originalArray = {1, 4, 17, 7, 25, 3, 100};
        int k = 3; // Number of smallest elements to find

        // Sort the array in ascending order
        Arrays.sort(originalArray);

        // Print the k smallest elements
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("K smallest elements of the said array are:");
        for (int i = 0; i < k; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
    }
}
