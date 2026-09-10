import java.util.Iterator;

public class IntTree implements Cloneable {
    private IntTreeNode overallRoot;

    // Constructor
    public IntTree() {
        overallRoot = null;
    }

    // Copy constructor
    public IntTree(IntTree other) {
        overallRoot = copy(other.overallRoot);
    }

    // Clone method
    public Object clone() {
        try {
            IntTree cloned = (IntTree) super.clone();
            cloned.overallRoot = copy(overallRoot);
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Equals method
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntTree other = (IntTree) obj;
        return equals(overallRoot, other.overallRoot);
    }

    // SameContents method
    public boolean sameContents(IntTree other) {
        return sameContents(overallRoot, other.overallRoot);
    }

    // ToString method
    public String toString() {
        return toString(overallRoot);
    }

    // Method to produce an iterator
    public Iterator<Integer> iterator() {
        return new IntTreeIterator(overallRoot);
    }

    // Helper method to copy a tree
    private IntTreeNode copy(IntTreeNode root) {
        if (root == null) {
            return null;
        }
        IntTreeNode newRoot = new IntTreeNode(root.data);
        newRoot.left = copy(root.left);
        newRoot.right = copy(root.right);
        return newRoot;
    }

    // Helper method to check if two trees are equal
    private boolean equals(IntTreeNode node1, IntTreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.data == node2.data && equals(node1.left, node2.left) && equals(node1.right, node2.right);
    }

    // Helper method to check if two trees have the same contents
    private boolean sameContents(IntTreeNode node1, IntTreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.data == node2.data && sameContents(node1.left, node2.left) && sameContents(node1.right, node2.right);
    }

    // Helper method to convert a tree to a string
    private String toString(IntTreeNode root) {
        if (root == null) {
            return "empty";
        }
        return "(" + toString(root.left) + " " + root.data + " " + toString(root.right) + ")";
    }

    // Inner class for the iterator
    private class IntTreeIterator implements Iterator<Integer> {
        private Stack<IntTreeNode> stack;

        public IntTreeIterator(IntTreeNode root) {
            stack = new Stack<>();
            pushLeft(root);
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        public Integer next() {
            IntTreeNode node = stack.pop();
            pushLeft(node.right);
            return node.data;
        }

        private void pushLeft(IntTreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
    }

    // Inner class for the tree nodes
    private class IntTreeNode {
        private int data;
        private IntTreeNode left;
        private IntTreeNode right;

        public IntTreeNode(int data) {
            this(data, null, null);
        }

        public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}

// Test program
public class Main {
    public static void main(String[] args) {
        IntTree tree1 = new IntTree();
        // Add code to create and modify the tree

        IntTree tree2 = new IntTree(tree1); // Test copy constructor
        System.out.println("Tree1 equals Tree2: " + tree1.equals(tree2));

        IntTree tree3 = (IntTree) tree1.clone(); // Test clone method
        System.out.println("Tree1 equals Tree3: " + tree1.equals(tree3));

        System.out.println("Tree1 sameContents Tree2: " + tree1.sameContents(tree2));
        System.out.println("Tree1 sameContents Tree3: " + tree1.sameContents(tree3));

        System.out.println("Tree1: " + tree1);
        System.out.println("Tree2: " + tree2);
        System.out.println("Tree3: " + tree3);

        Iterator<Integer> iterator = tree1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
