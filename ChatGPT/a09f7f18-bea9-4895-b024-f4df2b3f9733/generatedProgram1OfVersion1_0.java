import java.util.List;

public class EquilibriumIndices {
    
    public static List<Integer> findEquilibriumIndices(int[] nums) {
        List<Integer> equilibriumIndices = new ArrayList<>();
        
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i];
            
            if (leftSum == totalSum) {
                equilibriumIndices.add(i);
            }
            
            leftSum += nums[i];
        }
        
        return equilibriumIndices;
    }

    public static void main(String[] args) {
        int[] nums = {-7, 1, 5, 2, -4, 3, 0};
        List<Integer> equilibriumIndices = findEquilibriumIndices(nums);
        
        for (int index : equilibriumIndices) {
            System.out.println("Equilibrium indices found at : " + index);
        }
    }
}