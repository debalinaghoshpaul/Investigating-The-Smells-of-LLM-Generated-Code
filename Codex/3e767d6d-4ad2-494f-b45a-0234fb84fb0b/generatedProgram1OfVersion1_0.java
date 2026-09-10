import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(Comparable[] arr) {
        if (arr.length <= 1) {
            return;
        }
        
        int mid = arr.length / 2;
        Comparable[] left = Arrays.copyOfRange(arr, 0, mid);
        Comparable[] right = Arrays.copyOfRange(arr, mid, arr.length);
        
        mergeSort(left);
        mergeSort(right);
        
        merge(arr, left, right);
    }
    
    private static void merge(Comparable[] arr, Comparable[] left, Comparable[] right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        // Test program
        Integer[] arr = {5, 2, 8, 1, 9};
        
        System.out.println("Before sorting: " + Arrays.toString(arr));
        
        mergeSort(arr);
        
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}