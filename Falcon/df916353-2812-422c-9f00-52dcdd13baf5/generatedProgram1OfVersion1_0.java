import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i]!= 0) {
                arr[i + 1] = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

