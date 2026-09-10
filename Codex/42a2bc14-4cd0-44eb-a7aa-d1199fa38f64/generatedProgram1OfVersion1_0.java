import java.util.Arrays;

public class FindIndexInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int target = 5;
        System.out.println(Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Index: " + findIndex(arr, target));

        target = 0;
        System.out.println(Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Index: " + findIndex(arr, target));

        target = 7;
        System.out.println(Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Index: " + findIndex(arr, target));
    }

    public static int findIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
