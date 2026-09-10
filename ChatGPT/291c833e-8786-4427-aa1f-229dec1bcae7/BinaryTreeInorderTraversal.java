import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

class BinaryTreeInorderTraversal {

  public static void main(String[] args) {
    // Test case 1: Empty tree
    TreeNode root1 = null;
    System.out.println(inorderTraversal(root1)); // []

    // Test case 2: Tree with one node
    TreeNode root2 = new TreeNode(10);
    System.out.println(inorderTraversal(root2)); // [10]

    // Test case 3: Complete binary tree
    TreeNode root3 = new TreeNode(10);
    root3.left = new TreeNode(20);
    root3.right = new TreeNode(30);
    root3.left.left = new TreeNode(40);
    root3.left.right = new TreeNode(50);
    System.out.println(inorderTraversal(root3)); // [40, 20, 50, 10, 30]

    // Test case 4: Incomplete binary tree
    TreeNode root4 = new TreeNode(10);
    root4.left = new TreeNode(20);
    root4.left.right = new TreeNode(50);
    System.out.println(inorderTraversal(root4)); // [20, 50, 10]

    // Test case 5: Tree with only right child
    TreeNode root5 = new TreeNode(10);
    root5.right = new TreeNode(20);
    System.out.println(inorderTraversal(root5)); // [10, 20]

    // Test case 6: Tree with only left child
    TreeNode root6 = new TreeNode(10);
    root6.left = new TreeNode(20);
    System.out.println(inorderTraversal(root6)); // [20, 10]
  }

  // Perform inorder traversal using a stack
  public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
      // Push all left children to the stack
      while (current != null) {
        stack.push(current);
        current = current.left;
      }

      // Pop the top element from the stack and print it
      current = stack.pop();
      result.add(current.val);

      // Move to the right child
      current = current.right;
    }

    return result;
  }
}
