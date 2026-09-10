import java.util.Arrays;

public class CloseToZeroSum {
    
    public static void findCloseToZeroSum(int[] array) {
        if(array.length < 2) {
            System.out.println("At least two elements are needed in the array.");
            return;
        }
        
        Arrays.sort(array);
        
        int low = 0;
        int high = array.length - 1;
        
        int minSum = Integer.MAX_VALUE;
        int closestToZero1 = 0;
        int closestToZero2 = 0;
        
        while(low < high) {
            int sum = array[low] + array[high];
            
            if(Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                closestToZero1 = array[low];
                closestToZero2 = array[high];
            }
            
            if(sum < 0) {
                low++;
            } else {
                high--;
            }
        }
        
        System.out.println("Elements with sum closest to zero: " + closestToZero1 + " and " + closestToZero2);
    }
    
    public static void main(String[] args) {
        int[] array = {1, 60, -10, 70, -80, 85};
        findCloseToZeroSum(array);
    }
}
