public class Permutations {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3};
        System.out.println("Possible permutations of the said array:");
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                System.out.print(nums1[i] + " " + nums2[j] + " ");
            }
            System.out.println();
        }
    }
}

// 