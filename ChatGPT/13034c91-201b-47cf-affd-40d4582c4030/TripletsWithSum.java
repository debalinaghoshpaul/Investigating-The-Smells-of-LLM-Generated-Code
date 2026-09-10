import java.util.*;

public class TripletsWithSum {

    public static List<List<Integer>> findTriplets(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i+1, hi = nums.length - 1;
                int sum = target - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[lo]);
                        triplet.add(nums[hi]);
                        result.add(triplet);

                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 0, 5, -1, -4};
        int target = 2;

        List<List<Integer>> triplets = findTriplets(nums, target);

        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
