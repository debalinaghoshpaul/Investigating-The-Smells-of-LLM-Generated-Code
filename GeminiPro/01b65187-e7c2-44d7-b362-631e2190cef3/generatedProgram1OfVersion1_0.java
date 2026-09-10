import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int findMajorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int majorityElement = -1;
        int majorityCount = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > majorityCount) {
                majorityElement = entry.getKey();
                majorityCount = entry.getValue();
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 1, 2, 3};
        System.out.println(findMajorityElement(nums1)); // 1

        int[] nums2 = {3, 2, 3};
        System.out.println(findMajorityElement(nums2)); // 3

        int[] nums3 = {1};
        System.out.println(findMajorityElement(nums3)); // 1

        int[] nums4 = {1, 1, 1, 2, 2, 2, 3, 3, 3};
        System.out.println(findMajorityElement(nums4)); // 1

        int[] nums5 = {1, 2, 3, 4, 5};
        System.out.println(findMajorityElement(nums5)); // -1

        int[] nums6 = {};
        System.out.println(findMajorityElement(nums6)); // -1
    }
}
