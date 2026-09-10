import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10}; // array with a missing number
        int n = arr.length + 1; // length of array + 1
        
        int totalSum = n * (n + 1) / 2; // sum of numbers from 1 to n
        
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num; // sum of numbers in the array
        }
        
        int missingNumber = totalSum - arrSum; // find the missing number
        System.out.println("The missing number is: " + missingNumber);
    }
}
