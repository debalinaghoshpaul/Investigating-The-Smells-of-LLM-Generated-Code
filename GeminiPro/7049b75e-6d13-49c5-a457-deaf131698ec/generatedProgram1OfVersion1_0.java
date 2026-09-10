import java.util.Arrays;

public class NegativeDominance {

    public static boolean isNegativeDominant(int[] arr) {
        int negativeCount = 0;
        for (int num : arr) {
            if (num < 0) {
                negativeCount++;
            }
        }
        return negativeCount > arr.length / 2;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -2, -5, -4, 3, -6};
        System.out.println("Original array of numbers: " + Arrays.toString(arr1));
        System.out.println("Check Negative Dominance in the said array! " + isNegativeDominant(arr1));

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array of numbers: " + Arrays.toString(arr2));
        System.out.println("Check Negative Dominance in the said array! " + isNegativeDominant(arr2));

        int[] arr3 = {0, 0, 0, 0};
        System.out.println("Original array of numbers: " + Arrays.toString(arr3));
        System.out.println("Check Negative Dominance in the said array! " + isNegativeDominant(arr3));

        int[] arr4 = {-1, -2, -3, -4, -5, -6};
        System.out.println("Original array of numbers: " + Arrays.toString(arr4));
        System.out.println("Check Negative Dominance in the said array! " + isNegativeDominant(arr4));

        int[] arr5 = {};
        System.out.println("Original array of numbers: " + Arrays.toString(arr5));
        System.out.println("Check Negative Dominance in the said array! " + isNegativeDominant(arr5));
    }
}
