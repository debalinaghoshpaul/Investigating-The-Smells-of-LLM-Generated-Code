public class SumArrayValues {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int sum = sumArray(arr);
        
        System.out.println("Sum of array elements: " + sum);
    }
    
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

}
