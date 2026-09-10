import java.util.Arrays;

public class CheckPairSumInRotatedArray {

    public static boolean checkPairWithSumExists(int[] arr, int targetSum) {
        int n = arr.length;
        
        // Find the pivot element in the rotated sorted array
        int pivot = findPivot(arr, 0, n-1);
        
        // Initialize left and right pointers
        int left = (pivot + 1) % n;
        int right = pivot;
        
        // Find the pair with the specified sum
        while (left != right) {
            int sum = arr[left] + arr[right];
            if (sum == targetSum) {
                return true;
            } else if (sum < targetSum) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }
        
        return false;
    }

    public static int findPivot(int[] arr, int low, int high) {
        if (high < low)
            return -1;
        if (high == low)
            return low;

        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > low && arr[mid] < arr[mid - 1]) {
            return (mid - 1);
        }
        if (arr[low] >= arr[mid]) {
            return findPivot(arr, low, mid - 1);
        }
        return findPivot(arr, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 3, 4, 5, 6};
        int targetSum = 9;

        Arrays.sort(arr); // Sorting the array before calling the function
        boolean pairExists = checkPairWithSumExists(arr, targetSum);

        if(pairExists) {
            System.out.println("Pair with sum " + targetSum + " exists in the array.");
        } else {
            System.out.println("Pair with sum " + targetSum + " does not exist in the array.");
        }
    }
}
