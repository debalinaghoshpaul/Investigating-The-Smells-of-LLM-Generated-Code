import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};
        int n = arr.length;
        System.out.println(findLongestConsecutiveSequence(arr, n));
    }

    static int findLongestConsecutiveSequence(int[] arr, int n) {
        Arrays.sort(arr);

        int maxCount = 1;
        int currCount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            } else {
                if (arr[i] == arr[i - 1] + 1) {
                    currCount++;
                } else {
                    if (currCount > maxCount) {
                        maxCount = currCount;
                    }
                    currCount = 1;
                }
            }
        }

        if (currCount > maxCount) {
            maxCount = currCount;
        }

        return maxCount;
    }
}
