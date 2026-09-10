import java.util.ArrayList;
import java.util.HashMap;

public class ZeroSumSubArrays {

    public static void findSubArrays(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<int[]> result = new ArrayList<>();

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                ArrayList<Integer> list = map.get(sum);
                for (int start : list) {
                    result.add(java.util.Arrays.copyOfRange(nums, start + 1, i + 1));
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(i);
        }

        for (int[] arr : result) {
            System.out.print("Sub-arrays with 0 sum : ");
            System.out.println(java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        int[] nums2 = {1, 2, -3, 4, 5, 6};
        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};

        findSubArrays(nums1);
        findSubArrays(nums2);
        findSubArrays(nums3);
    }
}
