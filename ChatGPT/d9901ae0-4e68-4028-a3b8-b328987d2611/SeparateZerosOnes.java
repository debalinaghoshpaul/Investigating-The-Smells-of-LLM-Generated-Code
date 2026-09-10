import java.util.Arrays;

public class SeparateZerosOnes {
    
    public static void separateZerosOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            
            if (left < right) {
                arr[left++] = 0;
                arr[right--] = 1;
            }
        }
        
        System.out.println("Array after separating 0s and 1s: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0};
        
        System.out.println("Original Array: " + Arrays.toString(arr));

        separateZerosOnes(arr);
    }
}
