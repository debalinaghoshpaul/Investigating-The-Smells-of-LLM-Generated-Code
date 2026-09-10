import java.util.Arrays;

public class CheckArrayContainsSpecifiedNumber {

    public static void main(String[] args) {
        // Test case 1: array with specified number next to each other
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num1 = 5;
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Number to check: " + num1);
        System.out.println("Result: " + containsSpecifiedNumberNextToEachOther(arr1, num1));
        System.out.println();

        // Test case 2: array with specified number separated by one element
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num2 = 5;
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Number to check: " + num2);
        System.out.println("Result: " + containsSpecifiedNumberSeparatedByOneElement(arr2, num2));
        System.out.println();

        // Test case 3: array with specified number 20 appearing three times and no 20's are next to each other
        int[] arr3 = {1, 2, 3, 4, 20, 5, 6, 7, 8, 20, 9, 10, 20};
        System.out.println("Array 3: " + Arrays.toString(arr3));
        System.out.println("Result: " + contains20AppearingThreeTimesAndNotNextToEachOther(arr3));
        System.out.println();

        // Test case 4: array with specified number 20 appearing three times but 20's are next to each other
        int[] arr4 = {1, 2, 3, 4, 20, 20, 7, 8, 9, 10, 20};
        System.out.println("Array 4: " + Arrays.toString(arr4));
        System.out.println("Result: " + contains20AppearingThreeTimesAndNotNextToEachOther(arr4));
        System.out.println();

        // Test case 5: array with specified number 20 appearing less than three times
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array 5: " + Arrays.toString(arr5));
        System.out.println("Result: " + contains20AppearingThreeTimesAndNotNextToEachOther(arr5));
    }

    public static boolean containsSpecifiedNumberNextToEachOther(int[] arr, int num) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == num && arr[i + 1] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecifiedNumberSeparatedByOneElement(int[] arr, int num) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == num && arr[i + 2] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains20AppearingThreeTimesAndNotNextToEachOther(int[] arr) {
        int count = 0;
        boolean nextToEachOther = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i < arr.length - 1 && arr[i + 1] == 20) {
                    nextToEachOther = true;
                }
            }
        }

        return count == 3 && !nextToEachOther;
    }
}
