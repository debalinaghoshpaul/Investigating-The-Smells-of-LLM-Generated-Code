import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3};

        List<List<Integer>> permutations1 = permute(nums1);
        System.out.println("Possible permutations of nums1:");
        for (List<Integer> perm : permutations1) {
            System.out.println(perm);
        }

        List<List<Integer>> permutations2 = permute(nums2);
        System.out.println("\nPossible permutations of nums2:");
        for (List<Integer> perm : permutations2) {
            System.out.println(perm);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
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
