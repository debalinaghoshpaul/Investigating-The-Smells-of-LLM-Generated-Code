import java.util.Arrays;

public class GnomeSort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 2, 4 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        gnomeSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void gnomeSort(int[] arr) {
        int index = 0;

        while (index < arr.length) {
            if (index == 0) {
                index++;
            } else if (arr[index] >= arr[index - 1]) {
                index++;
            } else {
                swap(arr, index, index - 1);
                index--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
