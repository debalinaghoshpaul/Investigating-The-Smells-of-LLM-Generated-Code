public class AverageOfArray {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25};

        double sum = 0;
        for(int num : nums) {
            sum += num;
        }

        double average = sum / nums.length;

        System.out.println("The average value of the array elements is: " + average);
    }
}
