package DataStructures.Tree.BinaryTree.MaxHeight;

public class BinaryTree {
    Node root;
    int height = 0;

    public BinaryTree() {
        root = null;
    }

    public int calculateMaxHeight() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) return -1;
        else {
            int lHeight = height(root.left);
            int rHeight = height(root.right);
            if(lHeight > rHeight) return (lHeight + 1);
            else return (rHeight + 1);
        }
    }
}
