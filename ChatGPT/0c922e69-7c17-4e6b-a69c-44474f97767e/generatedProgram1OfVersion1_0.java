
    public static int findSmallestSubarrayLength(int[] nums, int target) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int leftPointer = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                minLength = Math.min(minLength, i - leftPointer + 1);
                sum -= nums[leftPointer];
                leftPointer++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 8;
        int result = findSmallestSubarrayLength(nums, target);
        System.out.println("Minimum length of a contiguous subarray of which the sum is " + target + ": " + result);
    }
}