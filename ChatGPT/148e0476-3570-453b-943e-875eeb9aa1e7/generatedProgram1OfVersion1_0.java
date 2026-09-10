
public class LongestBitonicSubarray {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 4, 6, 8, 3, 2, 1};
        ArrayList<Integer> longestBitonicSubarray = findLongestBitonicSubarray(arr);
        System.out.println("Longest Bitonic Subarray: " + longestBitonicSubarray);
    }

    public static ArrayList<Integer> findLongestBitonicSubarray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int maxLength = 1;
        int currentLength = 1;
        boolean increasing = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1] && increasing) {
                currentLength++;
            } else if (arr[i] < arr[i - 1] && increasing) {
                increasing = false;
                currentLength++;
            } else if (arr[i] < arr[i - 1] && !increasing) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = i - currentLength;
                }
                currentLength = 1;
                increasing = true;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            start = n - currentLength;
        }

        ArrayList<Integer> longestBitonicSubarray = new ArrayList<>();
        for (int i = start; i < start + maxLength; i++) {
            longestBitonicSubarray.add(arr[i]);
        }

        return longestBitonicSubarray;
    }
}