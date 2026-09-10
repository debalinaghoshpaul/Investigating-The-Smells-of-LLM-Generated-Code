
public class AverageWithoutExtremes {

    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 2, 7, 9};
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : array) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        sum = sum - min - max;
        double average = (double) sum / (array.length - 2);
        
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Average value without extremes: " + average);
    }
}
