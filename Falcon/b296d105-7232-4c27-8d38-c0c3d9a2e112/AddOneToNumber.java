import java.util.Arrays;

public class AddOneToNumber {

    public static void main(String[] args) {
        int[] num1 = {9, 9, 9, 9};
        int[] result1 = addOne(num1);
        System.out.println(Arrays.toString(result1)); // Output: [1, 0, 0, 0, 0]

        int[] num2 = {1, 2, 3, 4, 5};
        int[] result2 = addOne(num2);
        System.out.println(Arrays.toString(result2)); // Output: [1, 2, 3, 4, 6]

        int[] num3 = {0};
        int[] result3 = addOne(num3);
        System.out.println(Arrays.toString(result3)); // Output: [1]

        int[] num4 = {9};
        int[] result4 = addOne(num4);
        System.out.println(Arrays.toString(result4)); // Output: [1, 0]
    }

    public static int[] addOne(int[] num) {
        int[] result = new int[num.length + 1];

        // Add 1 to the least significant digit
        num[num.length - 1]++;

        // Carry over any digits that need to be carried
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] == 10) {
                num[i] = 0;
                result[i + 1]++;
            }
        }

        // If there is a carry-over from the most significant digit, add it to the result
        if (num[0] == 10) {
            num[0] = 0;
            result[0] = 1;
        }

        // Return the result
        return result;
    }
}
