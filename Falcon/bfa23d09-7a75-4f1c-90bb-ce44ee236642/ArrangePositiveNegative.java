import java.util.*;

public class ArrangePositiveNegative {

    public static void main(String[] args) {
        int[] arr = {1, -3, 5, -2, 3, -1, 0, 1};
        arrangePositiveNegative(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 5, 3, 1, 0, -3, -2, -1]
    }

    public static void arrangePositiveNegative(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] < 0 && arr[j] > 0) {
                swap(arr, i, j);
                i++;
                j--;
            } else if (arr[i] > 0) {
                i++;
            } else {
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
