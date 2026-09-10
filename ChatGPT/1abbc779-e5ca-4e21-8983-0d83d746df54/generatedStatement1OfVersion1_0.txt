// Java program to sort a given array of distinct integers where all its numbers are sorted except two numbers

import java.util.Arrays;

public class Main {
    
    // Function to sort array with two unsorted numbers
    public static void sortArray(int[] nums) {
        int n = nums.length;
        int firstUnsorted = -1, lastUnsorted = -1;
        
        // Find the first unsorted number
        for(int i=0; i<n-1; i++) {
            if(nums[i] > nums[i+1]) {
                firstUnsorted = i;
                break;
            }
        }
        
        // Find the last unsorted number
        for(int i=n-1; i>0; i--) {
            if(nums[i] < nums[i-1]) {
                lastUnsorted = i;
                break;
            }
        }
        
        if(firstUnsorted == -1) {
            System.out.println("Array is already sorted");
            return;
        }
        
        int[] tempArray = Arrays.copyOfRange(nums, firstUnsorted, lastUnsorted+1);
        Arrays.sort(tempArray);
        
        int index = 0;
        for(int i=firstUnsorted; i<=lastUnsorted; i++) {
            nums[i] = tempArray[index++];
        }
        
        System.out.println("After sorting new array becomes: " + Arrays.toString(nums));
    }
    
    public static void main(String[] args) {
        int[] nums1 = { 3, 5, 6, 9, 8, 7 };
        int[] nums2 = { 5, 0, 1, 2, 3, 4, -2 };
        
        sortArray(nums1);
        sortArray(nums2);
    }
}