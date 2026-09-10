// Java program to create a new binary tree with the same structure and value as a given binary tree.

// A binary tree node
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

// A binary tree
class BinaryTree {
    Node root;

    // Function to create a new binary tree with the same structure and value as a given binary tree
    public BinaryTree getUpdatedBinaryTree(BinaryTree originalTree) {
        BinaryTree newTree = new BinaryTree();

        // Create a new root node for the new tree
        newTree.root = new Node(originalTree.root.data);

        // Recursively create the left and right subtrees
        newTree.root.left = getUpdatedBinaryTree(originalTree.root.left);
        newTree.root.right = getUpdatedBinaryTree(originalTree.root.right);

        // Return the new tree
        return newTree;
    }

    // Function to print the inorder traversal of a binary tree
    public void printInorder(Node root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    // Driver code
    public static void main(String[] args) {
        BinaryTree originalTree = new BinaryTree();
        originalTree.root = new Node(1);
        originalTree.root.left = new Node(2);
        originalTree.root.right = new Node(3);
        originalTree.root.left.left = new Node(4);
        originalTree.root.left.right = new Node(5);

        BinaryTree newTree = originalTree.getUpdatedBinaryTree(originalTree);

        System.out.println("Inorder traversal of the original tree:");
        originalTree.printInorder(originalTree.root);

        System.out.println("\nInorder traversal of the new tree:");
        newTree.printInorder(newTree.root);
    }
}
