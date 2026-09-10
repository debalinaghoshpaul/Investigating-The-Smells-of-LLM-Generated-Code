import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -6, 5, 4};
        int start = 0;
        int end = arr.length - 1;
        List<Integer> intervals = new ArrayList<>();
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == 0) {
                intervals.add(mid);
            }
            if (arr[mid] < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(intervals);
    }
}

