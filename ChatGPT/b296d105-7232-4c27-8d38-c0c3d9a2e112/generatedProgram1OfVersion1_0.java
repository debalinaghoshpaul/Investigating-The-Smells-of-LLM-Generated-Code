import java.util.Arrays;

public class AddOneToArray {

    public static void main(String[] args) {
        int[] inputArray = {9, 9, 9, 9};
        int[] result = addOne(inputArray);
        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Output array: " + Arrays.toString(result));
    }

    public static int[] addOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[n + 1];
        result[0] = 1;
        
        return result;
    }
}
