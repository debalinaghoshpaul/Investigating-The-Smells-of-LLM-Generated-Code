public class CheckTensSum {

    public static void main(String[] args) {
        int[] nums = {10, 20, 10, 40, 10, 50, 10, 70};

        System.out.println(checkTensSum(nums));
    }

    public static boolean checkTensSum(int[] nums) {
        int sumOfTens = 0;

        for (int num : nums) {
            if (num == 10) {
                sumOfTens += num;
            }
        }

        return sumOfTens == 30;
    }
}
