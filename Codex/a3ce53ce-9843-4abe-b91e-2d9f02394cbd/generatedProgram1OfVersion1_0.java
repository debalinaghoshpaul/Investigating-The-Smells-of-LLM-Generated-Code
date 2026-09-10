import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {20, 30, 40};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Rotate the array in the left direction
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
