import java.util.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        } else {
            insertNode(root, newNode);
        }
    }

    private void insertNode(Node current, Node newNode) {
        if (newNode.data < current.data) {
            if (current.left == null) {
                current.left = newNode;
            } else {
                insertNode(current.left, newNode);
            }
        } else if (newNode.data > current.data) {
            if (current.right == null) {
                current.right = newNode;
            } else {
                insertNode(current.right, newNode);
            }
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node current) {
        if (current != null) {
            inOrderTraversal(current.left);
            System.out.print(current.data + " ");
            inOrderTraversal(current.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 6, 5, 3};

        BinarySearchTree tree = new BinarySearchTree();

        for (int i = 0; i < arr.length; i++) {
            tree.insert(arr[i]);
        }

        System.out.println("The inorder traversal of the binary search tree is:");
        tree.inOrderTraversal();
        System.out.println();
    }
}
