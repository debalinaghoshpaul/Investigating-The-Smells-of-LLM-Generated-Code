import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    
    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        
        int newLength = removeDuplicates(arr);
        
        System.out.println("New length of the array after removing duplicates: " + newLength);
    }
    
    public static int removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        
        int index = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[index++] = arr[i];
            }
        }
        
        arr[index++] = arr[arr.length - 1];
        
        return index;
    }
}
