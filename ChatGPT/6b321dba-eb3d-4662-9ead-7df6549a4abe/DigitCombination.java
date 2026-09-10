
public class DigitCombination {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of digits (n): ");
        int n = sc.nextInt();
        
        int[] digits = new int[n];
        System.out.println("Enter the digits chosen from 0 to 9:");
        for(int i=0; i<n; i++) {
            digits[i] = sc.nextInt();
        }
        
        System.out.print("Enter the target sum (s): ");
        int targetSum = sc.nextInt();
        
        int count = getNumOfCombinations(digits, targetSum);
        System.out.println("Number of combinations: " + count);
    }
    
    public static int getNumOfCombinations(int[] digits, int targetSum) {
        // Use a recursive helper function to find all combinations
        return getCombinations(digits, targetSum, 0, 0, 0);
    }
    
    public static int getCombinations(int[] digits, int targetSum, int index, int sum, int count) {
        if(sum == targetSum && index > 0) {
            return count + 1;
        }
        
        if(index >= digits.length || sum > targetSum) {
            return count;
        }
        
        // Include current digit in the sum
        count = getCombinations(digits, targetSum, index+1, sum+digits[index], count);
        
        // Skip current digit
        count = getCombinations(digits, targetSum, index+1, sum, count);
        
        return count;
    }
}
