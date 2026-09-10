import java.util.Scanner;

public class MaxSumOfIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input data
        String[] lines = new String[100];
        int numLines = 0;
        while (sc.hasNext()) {
            lines[numLines++] = sc.next();
        }
        
        // Create a 2D array to store the integers
        int[][] nums = new int[numLines][];
        for (int i = 0; i < numLines; i++) {
            String[] numsStr = lines[i].split(",");
            nums[i] = new int[numsStr.length];
            for (int j = 0; j < numsStr.length; j++) {
                nums[i][j] = Integer.parseInt(numsStr[j]);
            }
        }
        
        // Calculate the maximum sum of integers passing according to the rule
        for (int i = 1; i < numLines; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (j == 0) {
                    nums[i][j] += nums[i-1][j];
                } else if (j == nums[i].length - 1) {
                    nums[i][j] += nums[i-1][j-1];
                } else {
                    nums[i][j] += Math.max(nums[i-1][j-1], nums[i-1][j]);
                }
            }
        }
        
        // Find the maximum sum in the last line
        int maxSum = 0;
        for (int num : nums[numLines-1]) {
            if (num > maxSum) {
                maxSum = num;
            }
        }
        
        System.out.println(maxSum);
    }

}
