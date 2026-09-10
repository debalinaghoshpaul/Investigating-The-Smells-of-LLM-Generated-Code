import java.util.Arrays;

public class ArrangeIntegers {
    
    public static void main(String[] args) {
        int[] arr = {-3, 4, -5, 7, 2, -1, 0, 9, -8};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        arrangeIntegers(arr);
        
        System.out.println("Arranged Array: " + Arrays.toString(arr));
    }
    
    public static void arrangeIntegers(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            if (arr[i] < 0) {
                i++;
            } else if (arr[j] >= 0) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
