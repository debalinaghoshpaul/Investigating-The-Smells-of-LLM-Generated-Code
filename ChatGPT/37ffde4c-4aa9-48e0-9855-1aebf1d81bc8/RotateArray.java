import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateArray(arr);

        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }
}
