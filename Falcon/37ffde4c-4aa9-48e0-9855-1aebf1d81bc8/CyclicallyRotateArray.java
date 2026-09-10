import java.util.Arrays;

public class CyclicallyRotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        // cyclically rotate the array clockwise by one
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
