import java.util.Arrays;

public class LeftShiftArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2; // Number of elements to shift

        // Create a new array to store the shifted elements
        int[] shiftedArray = new int[arr.length];

        // Shift the elements to the left
        for (int i = 0; i < arr.length; i++) {
            shiftedArray[(i + n) % arr.length] = arr[i];
        }

        // Print the shifted array
        System.out.println(Arrays.toString(shiftedArray));
    }
}
