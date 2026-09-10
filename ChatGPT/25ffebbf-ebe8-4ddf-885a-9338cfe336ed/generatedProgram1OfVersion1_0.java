
public class LongestIncreasingContinuousSubsequence {
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 7, 8, 9, 2};
        int[] result = findLongestIncreasingContinuousSubsequence(arr);
        
        System.out.println("Longest increasing continuous subsequence: " + Arrays.toString(result));
    }
    
    public static int[] findLongestIncreasingContinuousSubsequence(int[] arr) {
        if(arr == null || arr.length == 0) {
            return new int[0];
        }
        
        int maxLen = 0;
        int startIdx = 0;
        int endIdx = 0;
        
        int curLen = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                curLen++;
            } else {
                if(curLen > maxLen) {
                    maxLen = curLen;
                    endIdx = i-1;
                    startIdx = endIdx - maxLen + 1;
                }
                curLen = 1;
            }
        }
        
        if(curLen > maxLen) {
            maxLen = curLen;
            endIdx = arr.length - 1;
            startIdx = endIdx - maxLen + 1;
        }
        
        int[] result = Arrays.copyOfRange(arr, startIdx, endIdx+1);
        return result;
    }
}