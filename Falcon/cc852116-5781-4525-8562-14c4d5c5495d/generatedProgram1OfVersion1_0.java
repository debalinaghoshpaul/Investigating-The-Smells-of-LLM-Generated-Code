import java.util.Arrays;

public class CountDistinctValues {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]!= arr[i + 1]) {
                count++;
            }
        }
        System.out.println("Number of distinct values: " + count);
    }
}

// 