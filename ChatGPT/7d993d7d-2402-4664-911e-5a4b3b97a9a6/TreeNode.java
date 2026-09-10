class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class LongestConsecutivePath {
    private int longestPath = 0;

    public int longestConsecutive(TreeNode root) {
        if(root == null) {
            return 0;
        }
        dfs(root, root.val, 1);
        return longestPath;
    }

    private void dfs(TreeNode node, int target, int currentPath) {
        if(node == null) {
            return;
        }

        if(node.val == target + 1) {
            currentPath++;
        } else {
            currentPath = 1;
        }

        longestPath = Math.max(longestPath, currentPath);

        dfs(node.left, node.val, currentPath);
        dfs(node.right, node.val, currentPath);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);

        LongestConsecutivePath solution = new LongestConsecutivePath();
        System.out.println("Length of the longest consecutive sequence path: " + solution.longestConsecutive(root)); // Output should be 3
    }
}
