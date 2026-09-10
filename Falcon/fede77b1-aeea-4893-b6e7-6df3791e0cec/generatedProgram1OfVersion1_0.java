// Java program to print postorder traversal of Binary Tree

// A binary tree node
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

// A class to store a stack
class Stack {
    int top;
    int capacity;
    int[] array;

    Stack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
    }

    // Utility function to add an element x in the stack
    void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = x;
    }

    // Utility function to pop top element from the stack
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return array[top--];
    }

    // Utility function to return top element in the stack
    int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return array[top];
    }

    // Utility function to return the size of the stack
    int size() {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    boolean isEmpty() {
        return top == -1;
    }
}

// Iterative postorder traversal using two stacks
class PostorderTraversal {
    // A utility function to print inorder tree traversal
    void printPostorder(Node root) {
        // Create two stacks
        Stack s1 = new Stack(100);
        Stack s2 = new Stack(100);

        // Push root to first stack
        s1.push(root);

        // Run while first stack is not empty
        while (!s1.isEmpty()) {
            // Pop an item from s1 and push it to s2
            Node temp = s1.pop();
            s2.push(temp);

            // Push left and right children of removed item to s1
            if (temp.left != null) {
                s1.push(temp.left);
            }
            if (temp.right != null) {
                s1.push(temp.right);
            }
        }

        // Print all elements of second stack
        while (!s2.isEmpty()) {
            Node temp = s2.pop();
            System.out.print(temp.data + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        PostorderTraversal postorderTraversal = new PostorderTraversal();
        postorderTraversal.printPostorder(root);
    }
}
