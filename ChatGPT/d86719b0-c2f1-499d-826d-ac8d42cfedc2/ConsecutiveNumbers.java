import java.util.Arrays;

public class ConsecutiveNumbers {
    
    public static boolean checkConsecutive(int[] arr) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 0, 4, 3, 6};
        
        boolean result = checkConsecutive(arr);
        
        System.out.println("Check consecutive numbers in the said array: " + result);
    }
}
