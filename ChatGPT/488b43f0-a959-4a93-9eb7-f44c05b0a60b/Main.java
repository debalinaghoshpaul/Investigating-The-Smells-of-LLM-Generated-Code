import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 5, 0, 2, 1, 4, 3, 6, 1, 0};
        findLargestSubArray(nums);
    }

    public static void findLargestSubArray(int[] nums) {
        Arrays.sort(nums);
        List<Integer> currentSubArray = new ArrayList<>();
        List<Integer> largestSubArray = new ArrayList<>();
        int maxLength = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                currentSubArray.add(nums[i]);
            } else {
                currentSubArray.add(nums[i]);
                if (currentSubArray.size() > maxLength) {
                    maxLength = currentSubArray.size();
                    largestSubArray = new ArrayList<>(currentSubArray);
                }
                currentSubArray.clear();
            }
        }

        if (!currentSubArray.isEmpty()) {
            currentSubArray.add(nums[nums.length - 1]);
            if (currentSubArray.size() > maxLength) {
                maxLength = currentSubArray.size();
                largestSubArray = new ArrayList<>(currentSubArray);
            }
        }

        System.out.println("The largest sub-array is: " + largestSubArray);
        System.out.print("Elements of the sub-array: ");
        for (int num : largestSubArray) {
            System.out.print(num + " ");
        }
    }
}
