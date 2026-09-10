import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        int start = 0;
        int end = arr.length - 1;

        List<Integer> result = new ArrayList<>();

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                result.add(arr[mid]);
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(Arrays.toString(result.toArray()));
    }
}

