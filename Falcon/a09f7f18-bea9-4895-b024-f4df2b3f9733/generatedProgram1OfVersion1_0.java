import java.util.Arrays;

public class FindEquilibriumIndices {
    public static void main(String[] args) {
        int[] nums = {-7, 1, 5, 2, -4, 3, 0};
        int[] indices = findEquilibriumIndices(nums);
        System.out.println("Equilibrium indices found at : " + Arrays.toString(indices));
        System.out.println("Equilibrium indices found at : " + Arrays.toString(indices));
    }

    public static int[] findEquilibriumIndices(int[] nums) {
        int[] indices = new int[nums.length];
        Arrays.fill(indices, -1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    indices[i] = indices[j];
                    indices[j] = indices[i];
                }
            }
        }
        return indices;
    }
}
// 