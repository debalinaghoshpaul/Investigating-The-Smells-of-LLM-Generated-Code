public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 7};
        
        int[] result1 = replaceWithProduct(nums1);
        int[] result2 = replaceWithProduct(nums2);
        
        System.out.println("Array with product of every other element:");
        for(int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Array with product of every other element:");
        for(int num : result2) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] replaceWithProduct(int[] nums) {
        int totalProduct = 1;
        
        for(int num : nums) {
            totalProduct *= num;
        }
        
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = totalProduct / nums[i];
        }
        
        return result;
    }
}
