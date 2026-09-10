import java.util.Arrays;

public class CocktailSort {
    public static int[] cocktailSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4, 1};
        System.out.println(Arrays.toString(cocktailSort(arr)));
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(cocktailSort(arr1)));
        int[] arr2 = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(cocktailSort(arr2)));
        int[] arr3 = {};
        System.out.println(Arrays.toString(cocktailSort(arr3)));
    }
}
