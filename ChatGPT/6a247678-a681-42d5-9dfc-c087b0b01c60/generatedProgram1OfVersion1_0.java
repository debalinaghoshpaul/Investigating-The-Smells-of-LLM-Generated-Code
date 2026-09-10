import java.util.Arrays;

public class MoveZerosToRight {
    public static void main(String[] args) {
        int[] originalArray = {0, 3, 4, 0, 1, 2, 5, 0};
        moveZerosToRight(originalArray);
        System.out.println("Original array: " + Arrays.toString(originalArray));
    }

    public static void moveZerosToRight(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }
}
