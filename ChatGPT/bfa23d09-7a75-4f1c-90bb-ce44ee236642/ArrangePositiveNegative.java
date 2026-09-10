
public class ArrangePositiveNegative {
    
    public static void main(String[] args) {
        int[] arr = {4, -3, 5, -2, -1, 0, 8, -7};
        
        arrangePositiveNegative(arr);
        
        System.out.println("Arranged array: " + Arrays.toString(arr));
    }
    
    public static void arrangePositiveNegative(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            if (arr[i] < 0 && arr[j] >= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                if (arr[i] >= 0) {
                    i++;
                }
                if (arr[j] < 0) {
                    j--;
                }
            }
        }
    }
}
Explanation:
- We iterate over the array from the beginning and end simultaneously.
- When we find a negative element at the beginning and a positive element at the end, we swap them.
- We continue this process until the two pointers meet, ensuring that all positive numbers appear before all negative numbers in the array.
