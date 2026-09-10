
public class SortArrayExceptTwoNumbers {

    public static void main(String[] args) {
        int[] nums1 = {3, 5, 6, 9, 8, 7};
        int[] nums2 = {5, 0, 1, 2, 3, 4, -2};

        System.out.println("Original Array 1: " + Arrays.toString(nums1));
        Arrays.sort(nums1);
        System.out.println("Sorted Array 1: " + Arrays.toString(nums1));

        System.out.println("Original Array 2: " + Arrays.toString(nums2));
        Arrays.sort(nums2);
        System.out.println("Sorted Array 2: " + Arrays.toString(nums2));
    }
}
