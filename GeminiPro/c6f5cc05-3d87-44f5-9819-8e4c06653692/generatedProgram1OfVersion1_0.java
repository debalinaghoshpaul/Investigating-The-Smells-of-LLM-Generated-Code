import java.util.Scanner;

public class IdenticalBinaryTrees {

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean areIdentical(Node root1, Node root2) {
        // Check if both nodes are null
        if (root1 == null && root2 == null) {
            return true;
        }

        // Check if one of the nodes is null
        if (root1 == null || root2 == null) {
            return false;
        }

        // Check if the data of the nodes is the same
        if (root1.data != root2.data) {
            return false;
        }

        // Recursively check the left and right subtrees
        return areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input trees
        Node root1 = readTree(scanner);
        Node root2 = readTree(scanner);

        // Check if the trees are identical
        boolean areIdentical = areIdentical(root1, root2);

        // Print the result
        System.out.println(areIdentical ? "The trees are identical" : "The trees are not identical");
    }

    private static Node readTree(Scanner scanner) {
        // Read the root value
        int rootValue = scanner.nextInt();

        // If the root value is -1, then the tree is empty
        if (rootValue == -1) {
            return null;
        }

        // Create a new node with the root value
        Node root = new Node(rootValue);

        // Read the left subtree
        root.left = readTree(scanner);

        // Read the right subtree
        root.right = readTree(scanner);

        // Return the root of the tree
        return root;
    }
}
