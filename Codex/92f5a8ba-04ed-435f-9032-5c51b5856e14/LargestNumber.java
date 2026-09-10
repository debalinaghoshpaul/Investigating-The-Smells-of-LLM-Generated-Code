import java.util.Arrays;

public class LargestNumber {

    public static String largestNumber(int[] nums) {
        // Convert the int array to a String array
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the String array in descending order
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // Concatenate the sorted Strings to form the largest number
        StringBuilder sb = new StringBuilder();
        for (String num : strNums) {
            sb.append(num);
        }

        // Handle the case where the largest number is 0
        if (sb.toString().equals("0")) {
            return "0";
        } else {
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3, 0, 4, 6};
        int[] nums2 = {3, 30, 34, 5, 9};
        int[] nums3 = {0, 0, 0, 0, 0};

        System.out.println("Largest number using the said array numbers: " + largestNumber(nums1));
        System.out.println("Largest number using the said array numbers: " + largestNumber(nums2));
        System.out.println("Largest number using the said array numbers: " + largestNumber(nums3));
    }
}
