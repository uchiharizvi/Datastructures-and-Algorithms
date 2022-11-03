package DataStructures.Tree.BinaryTree.Operations.Traversal;

//Traversal Operations : Inorder, Preorder, Postorder
public class BinaryTree {
    Node root; // root of the tree

    //Constructor
    public BinaryTree() {
        root = null;
    }

    //Wrapper classes
    public void printPostOrder(){
        printPostOrder(root);
    }
    public void printPreOrder(){
        printPreOrder(root);
    }
    public void printInOrder(){
        printInOrder(root);
    }

    public void printPostOrder(Node node) {
        if (node == null) return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.key + " ");
    }

    public void printPreOrder(Node node) {
        if (node == null) return;
        System.out.println(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.println(node.key + " ");
        printInOrder(node.right);
    }

}
