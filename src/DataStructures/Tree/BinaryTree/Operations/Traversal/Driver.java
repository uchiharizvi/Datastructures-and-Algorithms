package DataStructures.Tree.BinaryTree.Operations.Traversal;

public class Driver {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder Traversal :");
        tree.printPreOrder();
        System.out.println("Inorder Traversal :");
        tree.printInOrder();
        System.out.println("Postorder Traversal :");
        tree.printPostOrder();
    }
}
