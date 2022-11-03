package DataStructures.Tree.BinarySearchTree.Operations.Insertion;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    private void insert(int key) {
        root = insertRecord(root, key);
    }

    /*A recursive function to insert a new key to BST*/
    private Node insertRecord(Node root, int key) {
        /*If the tree is empty, return new node*/
        if (root == null) {
            root = new Node(key);
            return root;
        }
        /*Otherwise recur down the tree*/
        if (key < root.key) {
            root.left = insertRecord(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecord(root.right, key);
        }
        /*return the (unchanged) node pointer*/
        return root;
    }

    /*call inorderRecord*/
    private void inorder() {
        inorderRecord(root);
    }
    /* A utility function to do inorder traversal of BST*/
    private void inorderRecord(Node root) {
        if(root != null){
            inorderRecord(root.left);
            System.out.println(root.key);
            inorderRecord(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        // print inorder traversal of the BST
        tree.inorder();
    }
}
