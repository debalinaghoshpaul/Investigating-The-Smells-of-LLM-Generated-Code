import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int target = arr[n - 1];

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

// 