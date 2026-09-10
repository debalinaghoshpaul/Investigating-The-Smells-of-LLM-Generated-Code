
public class AverageExceptMinMax {
    
    public static double calculateAverage(int[] arr) {
        if (arr.length <= 2) {
            return 0; // There are not enough elements to calculate an average
        }
        
        int sum = Arrays.stream(arr).sum();
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        
        return (double) (sum - max - min) / (arr.length - 2);
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 2, 10, 8};
        
        double average = calculateAverage(nums);
        System.out.println("Average value of the array except the largest and smallest values: " + average);
    }
}
