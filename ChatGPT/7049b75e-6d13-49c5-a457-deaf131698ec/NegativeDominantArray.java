public class NegativeDominantArray {

    public static void main(String[] args) {
        int[] arr1 = {1, -2, -5, -4, 3, -6};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("Original array of numbers: [1, -2, -5, -4, 3, -6]");
        System.out.println("Check Negative Dominance in the said array: " + isNegativeDominant(arr1));

        System.out.println("\nOriginal array of numbers: [1, 2, 3, 4, 5]");
        System.out.println("Check Negative Dominance in the said array: " + isNegativeDominant(arr2));
    }

    public static boolean isNegativeDominant(int[] arr) {
        int negativeCount = 0;
        int positiveCount = 0;

        for (int num : arr) {
            if (num < 0) {
                negativeCount++;
            } else {
                positiveCount++;
            }
        }

        return negativeCount > positiveCount;
    }
}
