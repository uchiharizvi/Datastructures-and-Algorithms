package DataStructures.Tree.BinaryTree.Operations.Basic;

public class Node {
    int key;
    Node left, right;

    public Node(int item){
        this.key = item;
        this.left = this.right = null;
    }
}
