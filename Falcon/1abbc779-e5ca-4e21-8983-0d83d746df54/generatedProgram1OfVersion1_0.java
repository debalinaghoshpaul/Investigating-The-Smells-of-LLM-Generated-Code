import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] nums1 = {3, 5, 6, 9, 8, 7};
        int[] nums2 = {5, 0, 1, 2, 3, 4, -2};

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        System.out.println("After sorting new array becomes: " + Arrays.toString(nums1));
        System.out.println("After sorting new array becomes: " + Arrays.toString(nums2));
    }
}

// 