import java.util.Arrays;

public class LargestGapCalculator {

    public static void main(String[] args) {
        int[] array = {23, -2, 45, 38, 12, 4, 6};

        int largestGap = calculateLargestGap(array);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Largest gap between sorted elements of the array: " + largestGap);
    }

    public static int calculateLargestGap(int[] array) {
        Arrays.sort(array);
        int largestGap = 0;

        for (int i = 1; i < array.length; i++) {
            int gap = array[i] - array[i - 1];
            if (gap > largestGap) {
                largestGap = gap;
            }
        }

        return largestGap;
    }
}
