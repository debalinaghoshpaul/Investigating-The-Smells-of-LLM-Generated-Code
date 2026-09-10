import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {-4, 7, -2, 5, -1, 3, -6};
        
        rearrangeArray(arr);
        
        System.out.println("Array after rearranging: " + Arrays.toString(arr));
    }
    
    public static void rearrangeArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
