import java.util.Arrays;

public class LargestGap {
    public static void main(String[] args) {
        int[] arr = {23, -2, 45, 38, 12, 4, 6};

        Arrays.sort(arr);

        int maxGap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int gap = arr[i + 1] - arr[i];
            if (gap > maxGap) {
                maxGap = gap;
            }
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Largest gap between sorted elements of the said array: " + maxGap);
    }
}
