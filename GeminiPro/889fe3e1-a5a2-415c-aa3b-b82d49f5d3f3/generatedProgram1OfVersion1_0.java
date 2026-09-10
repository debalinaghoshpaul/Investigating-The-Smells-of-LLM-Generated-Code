import java.util.Arrays;

public class TreeDepthAndArrayWithoutDuplicates {

    public static void main(String[] args) {
        // Test Case 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        System.out.println("The Maximum depth of the binary tree is: " + maxDepth(root1));

        // Test Case 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        System.out.println("The Maximum depth of the binary tree is: " + maxDepth(root2));

        // Test Case 3
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.right.right = new TreeNode(6);
        System.out.println("The Maximum depth of the binary tree is: " + maxDepth(root3));

        // Test Case 4
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        root4.left.left.left = new TreeNode(6);
        root4.left.left.right = new TreeNode(7);
        System.out.println("The Maximum depth of the binary tree is: " + maxDepth(root4));

        // Test Case 5
        int[] arr1 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("The length of the original array is: " + arr1.length);
        System.out.println("After removing duplicates, the new length of the array is: " + removeDuplicates(arr1));

        // Test Case 6
        int[] arr2 = {1, 1, 1, 1, 1};
        System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.println("The length of the original array is: " + arr2.length);
        System.out.println("After removing duplicates, the new length of the array is: " + removeDuplicates(arr2));

        // Test Case 7
        int[] arr3 = {};
        System.out.println("Original array: " + Arrays.toString(arr3));
        System.out.println("The length of the original array is: " + arr3.length);
        System.out.println("After removing duplicates, the new length of the array is: " + removeDuplicates(arr3));
    }

    // Function to find the maximum depth of a binary tree
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

    // Function to find the updated length of a sorted array without duplicates
    public static int removeDuplicates(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[j++] = arr[i];
            }
        }
        return j;
    }

    // Definition of a binary tree node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
