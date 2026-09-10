public class LargestGap {
    public static void main(String[] args) {
        int[] arr = {23, -2, 45, 38, 12, 4, 6};
        int n = arr.length;
        int maxGap = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    maxGap = Math.max(maxGap, arr[i] - arr[j]);
                }
            }
        }
        System.out.println("Largest gap between sorted elements of the said array: " + maxGap);
    }
}

// 