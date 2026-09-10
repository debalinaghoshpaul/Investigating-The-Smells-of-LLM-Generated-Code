package chapter_fifteen;

/**
 * 5. Complete the definition of the binary search tree class IntTree in Display 15.39
 * by adding the following: Make IntTree implement the Cloneable interface,
 * including the definition of a clone method; add a copy constructor; add an
 * equals method; add a method named sameContents as described later in this
 * project; add a toString method; and add a method to produce an iterator. Define
 * equals so that two trees are equal if (and only if) the two trees have the exact same
 * shape and have the same numbers in corresponding nodes. The clone method and
 * the copy constructor should each produce a deep copy that is equal to the original
 * list according to the equals method. The boolean valued method sameContents
 * has one parameter of type IntTree and returns true if the calling object and the
 * argument tree contain exactly the same numbers, and returns false otherwise.
 * Note that equals and sameContents are not the same. Also, write a suitable
 * test program.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_05
{
    public static void main(String[] args)
    {
        IntTree tree = new IntTree();
        tree.add(11);
        tree.add(12);
        tree.add(13);
        tree.add(14);
        tree.add(15);
        tree.add(16);

        /* 11 12 13 14 15 16 */
        System.out.println(tree.toString());

        IntTree tree1 = new IntTree(tree); // copy constructor
        System.out.println(tree.equals(tree1)); // true


        IntTree tree2 = new IntTree();
        tree.add(16);
        tree.add(15);
        tree.add(14);
        tree.add(13);
        tree.add(12);
        tree.add(11);

        System.out.println(tree1.equals(tree2)); // false

        System.out.println(tree1.sameContents(tree2)); // true

        IntTree tree3 = tree.clone();
        System.out.println(tree3.equals(tree)); // true

    }
}

package chapter_fifteen;


public class IntTree implements Cloneable
{
    public static class IntTreeNode implements Cloneable
    {
        private int data;
        private IntTreeNode leftLink;
        private IntTreeNode rightLink;

        public IntTreeNode(int data, IntTreeNode leftLink,
                           IntTreeNode rightLink)
        {
            this.data = data;
            this.leftLink = leftLink;
            this.rightLink = rightLink;
        }

        @Override
        protected IntTreeNode clone()
        {
            return  new IntTreeNode(data, (leftLink == null)? null : leftLink.clone(),
                    (rightLink == null)? null : rightLink.clone());
        }

        public boolean equals(IntTreeNode node)
        {
            if (node == null)
                return false;
            return data == node.data
                    && (node.rightLink == null) || (node.rightLink.equals(rightLink)
                    && (node.leftLink == null) || node.leftLink.equals(leftLink));
        }
    }

    private IntTreeNode root;

    public IntTree()
    {
        root = null;
    }

    /** add a copy constructor */
    public IntTree(IntTree original)
    {
        root = original.root.clone();
    }

    public void add(int item)
    {
        root = insertInSubtree(item, root);
    }

    public boolean contains(int item)
    {
        return isInSubtree(item, root);
    }

    public void showElements()
    {
        showElementsInSubtree(root);
    }

    private static IntTreeNode insertInSubtree(int item,
                                                IntTreeNode subTreeRoot)
    {
        if (subTreeRoot == null)
            return new IntTreeNode(item, null, null);
        else if (item < subTreeRoot.data)
        {
            subTreeRoot.leftLink = insertInSubtree(item, subTreeRoot.
                leftLink);
            return subTreeRoot;
        }
        else //item >= subTreeRoot.data
        {
            subTreeRoot.rightLink = insertInSubtree(item, subTreeRoot.
                rightLink);
            return subTreeRoot;
        }
    }

    private static boolean isInSubtree(int item, IntTreeNode subTreeRoot)
    {
        if (subTreeRoot == null)
            return false;
        else if (subTreeRoot.data == item)
            return true;
        else if (item < subTreeRoot.data)
            return isInSubtree(item, subTreeRoot.leftLink);
        else //item >= link.data
        return isInSubtree(item, subTreeRoot.rightLink);
    }

    private static void showElementsInSubtree(IntTreeNode subTreeRoot)
    {
        //Uses inorder traversal.
        if (subTreeRoot != null)
        {
            showElementsInSubtree(subTreeRoot.leftLink);
            System.out.print(subTreeRoot.data + " ");
            showElementsInSubtree(subTreeRoot.rightLink);
        } //else do nothing. Empty tree has nothing to display.
    }

    /**
     * Make IntTree implement the Cloneable interface,
     * including the definition of a clone method;
     * */
    @Override
    protected IntTree clone()
    {
        IntTree tree = new IntTree();
        tree.root = root.clone();
        return tree;
    }

    /** add an equals method
     * Define
     * equals so that two trees are equal if (and only if) the two trees have the exact same
     * shape and have the same numbers in corresponding nodes.
     * */
    public boolean equals(IntTree tree)
    {
        return root.equals(tree.root);
    }

    /**
     * add a method named sameContents
     * The boolean valued method sameContents
     * has one parameter of type IntTree and returns true if the calling object and the
     * argument tree contain exactly the same numbers, and returns false otherwise.
     * */
    public boolean sameContents(IntTree tree)
    {
        return sameContents(tree.root);
    }

    private boolean sameContents(IntTreeNode node)
    {
        if (node == null)
            return true;
        return isInSubtree(node.data, root)
                && sameContents(node.leftLink)
                && sameContents(node.rightLink);
    }

    /** add A ToString*/
    public String toString()
    {
        StringBuilder x = new StringBuilder();
        toString(root, x);
        return x.toString();
    }

    private void toString(IntTreeNode node, StringBuilder s)
    {
        if (node != null)
        {
            toString(node.leftLink, s);
            s.append(node.data).append(" ");
            toString(node.rightLink, s);
        }
    }
}



