import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 7};

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = nums1[i] * nums2[i];
        }

        System.out.println(Arrays.toString(result));
    }
}

// 