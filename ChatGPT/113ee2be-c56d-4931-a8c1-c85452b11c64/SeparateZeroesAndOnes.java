import java.util.Arrays;

public class SeparateZeroesAndOnes {
    
    public static void separateZeroesAndOnes(int[] arr) {
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
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        separateZeroesAndOnes(arr);
        
        System.out.println("Array after separation: " + Arrays.toString(arr));
    }
}
