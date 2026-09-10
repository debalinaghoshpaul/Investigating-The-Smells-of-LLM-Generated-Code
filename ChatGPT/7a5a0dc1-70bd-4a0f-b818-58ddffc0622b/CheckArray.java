public class CheckArray {

    public static void main(String[] args) {
        int[] nums = {12, 65, 34, 77, 43, 89};
        int target1 = 65;
        int target2 = 77;

        boolean containsTargets = checkArray(nums, target1, target2);

        if (containsTargets) {
            System.out.println("The array contains both " + target1 + " and " + target2);
        } else {
            System.out.println("The array does not contain both " + target1 + " and " + target2);
        }
    }

    public static boolean checkArray(int[] nums, int target1, int target2) {
        boolean containsTarget1 = false;
        boolean containsTarget2 = false;

        for (int num : nums) {
            if (num == target1) {
                containsTarget1 = true;
            }
            if (num == target2) {
                containsTarget2 = true;
            }
        }

        return containsTarget1 && containsTarget2;
    }
}
