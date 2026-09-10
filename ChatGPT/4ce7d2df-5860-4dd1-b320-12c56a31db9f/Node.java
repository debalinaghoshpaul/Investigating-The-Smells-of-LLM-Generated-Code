// Node class to represent a node in the binary tree
class Node {
    int val;
    Node left, right;
    
    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class UpdateBinaryTree {
    
    // Helper function to copy the binary tree
    public static Node copyTree(Node root) {
        if (root == null) {
            return null;
        }
        
        Node newNode = new Node(root.val);
        newNode.left = copyTree(root.left);
        newNode.right = copyTree(root.right);
        
        return newNode;
    }
    
    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        // Copy the binary tree
        Node newRoot = copyTree(root);
        
        // Print the values of the original and updated binary tree
        System.out.println("Original Binary Tree:");
        printTree(root);
        
        System.out.println("\nUpdated Binary Tree:");
        printTree(newRoot);
    }
    
    // Helper function to print the binary tree using inorder traversal
    public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }
}
