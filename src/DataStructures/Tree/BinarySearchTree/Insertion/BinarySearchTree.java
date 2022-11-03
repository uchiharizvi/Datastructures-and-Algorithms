package DataStructures.Tree.BinarySearchTree.Insertion;

public class BinarySearchTree {
    Node root;//specify root node

    public BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRecord(root, key);
    }
    void search(int key) {
        root = searchRecord(root, key);
    }

    private Node searchRecord(Node root, int key) {
        return root;
    }

    Node insertRecord(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.key) root.left = insertRecord(root.left, key);
        else if (key > root.key) root.right = insertRecord(root.right, key);
        return root;
    }

    public void inOrder() {
        System.out.println("Inorder Traversal");
        inOrderTraverse(root);
    }
    public void preOrder() {
        System.out.println("Preorder Traversal");
        preOrderTraverse(root);
    }

    private void preOrderTraverse(Node root) {
        if (root != null) {
            System.out.println(root.key);
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }

    public void postOrder() {
        System.out.println("Postorder Traversal");
        postOrderTraverse(root);
    }

    private void postOrderTraverse(Node root) {
        if (root != null) {
            postOrderTraverse(root.left);
            postOrderTraverse(root.right);
            System.out.println(root.key);
        }
    }

    //inorder traversal
    private void inOrderTraverse(Node root) {
        if (root != null) {
            inOrderTraverse(root.left);
            System.out.println(root.key);
            inOrderTraverse(root.right);
        }
    }
}
