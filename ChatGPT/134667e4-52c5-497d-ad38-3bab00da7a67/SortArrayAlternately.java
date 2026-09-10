import java.util.Arrays;

public class SortArrayAlternately {
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4, 9};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        sortArrayAlternately(arr);
        
        System.out.println("Sorted array alternately: " + Arrays.toString(arr));
    }
    
    public static void sortArrayAlternately(int[] arr) {
        Arrays.sort(arr);
        
        int[] result = new int[arr.length];
        
        int left = 0, right = arr.length - 1;
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[right];
                right--;
            } else {
                result[i] = arr[left];
                left++;
            }
        }
        
        System.arraycopy(result, 0, arr, 0, arr.length);
    }
}
