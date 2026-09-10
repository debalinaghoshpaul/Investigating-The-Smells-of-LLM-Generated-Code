public class MaxProduct {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        
        findMaxProduct(nums);
    }
    
    public static void findMaxProduct(int[] nums) {
        if(nums.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }
        
        int maxProduct = Integer.MIN_VALUE;
        int num1 = 0;
        int num2 = 0;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i]*nums[j] > maxProduct) {
                    maxProduct = nums[i]*nums[j];
                    num1 = nums[i];
                    num2 = nums[j];
                }
            }
        }
        
        System.out.println("Pair is (" + num1 + ", " + num2 + "), Maximum Product: " + maxProduct);
    }
}
