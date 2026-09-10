import java.util.*;

public class SortMaxMin {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sortMaxMin(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortMaxMin(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int[] newArr = new int[n];
        int i = 0;
        int j = n - 1;
        int k = 0;

        while (i < j) {
            newArr[k++] = arr[j--];
            newArr[k++] = arr[i++];
        }

        if (n % 2 != 0) {
            newArr[k] = arr[i];
        }

        for (i = 0; i < n; i++) {
            arr[i] = newArr[i];
        }
    }
}
