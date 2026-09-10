
public class PairSumInRotatedArray {

    public static boolean pairWithSumExists(int[] arr, int sum) {
        int n = arr.length;
        int pivot = findPivot(arr, 0, n-1);
        
        int left = (pivot + 1) % n;
        int right = pivot;
        
        while(left != right) {
            if(arr[left] + arr[right] == sum) {
                return true;
            }
            
            if(arr[left] + arr[right] < sum) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }
        
        return false;
    }
    
    public static int findPivot(int[] arr, int low, int high) {
        if(high < low) {
            return -1;
        }
        
        if(high == low) {
            return low;
        }
        
        int mid = (low + high) / 2;
        
        if(mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        
        if(mid > low && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        
        if(arr[low] >= arr[mid]) {
            return findPivot(arr, low, mid - 1);
        }
        
        return findPivot(arr, mid + 1, high);
    }
    
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int sum = 10;
        
        boolean pairExists = pairWithSumExists(arr, sum);
        
        if(pairExists) {
            System.out.println("A pair with the sum " + sum + " exists in the array.");
        } else {
            System.out.println("No such pair exists in the array.");
        }
    }
}
