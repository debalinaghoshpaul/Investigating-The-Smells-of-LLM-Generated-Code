import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3};
        
        System.out.println("Possible permutations of the first array:");
        List<List<Integer>> perms1 = generatePermutations(nums1);
        for(List<Integer> perm : perms1) {
            System.out.println(perm);
        }
        
        System.out.println("\nPossible permutations of the second array:");
        List<List<Integer>> perms2 = generatePermutations(nums2);
        for(List<Integer> perm : perms2) {
            System.out.println(perm);
        }
    }
    
    public static List<List<Integer>> generatePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }
    
    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums){
        if(tempList.size() == nums.length){
            result.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){ 
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
