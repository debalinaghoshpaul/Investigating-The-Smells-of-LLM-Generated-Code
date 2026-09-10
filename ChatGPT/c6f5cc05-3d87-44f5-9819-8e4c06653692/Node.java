// Node class to create a binary tree node
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeIdentical {

    // Function to check if two binary trees are identical
    public static boolean areIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        
        if (root1 != null && root2 != null) {
            return (root1.data == root2.data && areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right));
        }
        
        return false;
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        Node root2 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        if (areIdentical(root1, root2)) {
            System.out.println("Binary trees are identical.");
        } else {
            System.out.println("Binary trees are not identical.");
        }
    }
}
