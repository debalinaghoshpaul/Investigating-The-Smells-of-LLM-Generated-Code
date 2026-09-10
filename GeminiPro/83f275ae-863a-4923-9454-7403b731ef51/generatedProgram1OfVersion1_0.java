import java.util.Arrays;

public class CombSort {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2, 4 };
        System.out.println("Original Array: " + Arrays.toString(arr));

        combSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void combSort(int[] arr) {
        int gap = arr.length;
        boolean swapped = true;

        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int) (gap / 1.3);
            }

            swapped = false;

            for (int i = 0; i + gap < arr.length; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;

                    swapped = true;
                }
            }
        }
    }
}
