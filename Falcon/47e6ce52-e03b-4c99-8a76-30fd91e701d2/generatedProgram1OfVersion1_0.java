public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] arr) {
        int n = arr.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int currLen = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    currLen++;
                } else {
                    break;
                }
            }
            if (currLen > maxLen) {
                maxLen = currLen;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};
        int n = arr.length;
        int maxLen = longestConsecutiveSequence(arr);
        System.out.println("The length of the longest consecutive elements sequence is " + maxLen);
    }
}

