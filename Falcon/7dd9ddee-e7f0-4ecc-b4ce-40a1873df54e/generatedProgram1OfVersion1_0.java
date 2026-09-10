import java.util.ArrayList;
import java.util.List;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};
        int n = arr.length;
        int maxLength = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i + 1]) {
                list.add(arr[i]);
            } else {
                maxLength = Math.max(maxLength, list.size());
                list.clear();
                list.add(arr[i]);
            }
        }
        maxLength = Math.max(maxLength, list.size());
        System.out.println(maxLength);
    }
}

// 